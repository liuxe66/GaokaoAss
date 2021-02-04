package com.liuxe.gaokaoass.ui

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseActivity
import kotlinx.android.synthetic.main.activity_college.*

class CollegeActivity : BaseActivity() {

    override fun getLayout() = R.layout.activity_college

    override fun init(savedInstanceState: Bundle?) {
        val word = intent.getStringExtra("collegeName")
        initTitleBar(toolbar,"")
        val webSettings: WebSettings = web_college.settings
        //支持缩放，默认为true。
        webSettings.setSupportZoom(true)
        //调整图片至适合webview的大小
        webSettings.useWideViewPort = true
        // 缩放至屏幕的大小
        webSettings.loadWithOverviewMode = true
        //设置默认编码
        webSettings.defaultTextEncodingName = "utf-8"
        //设置自动加载图片
        webSettings.loadsImagesAutomatically = true

        webSettings.builtInZoomControls = true
        webSettings.displayZoomControls = false

        webSettings.cacheMode = WebSettings.LOAD_NO_CACHE
        webSettings.domStorageEnabled = true
        webSettings.javaScriptEnabled = true

        web_college.webViewClient = object :WebViewClient(){

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)

                    //header header-fixed bottomline

                    val javascript =  "javascript:function getClass(parent,sClass){" +
                    "var aEle=parent.getElementsByTagName('div');" +
                            "var aResult=[];" +
                            "var i=0;" +
                            "for(i<0;i<aEle.length;i++){" +
                            "if(aEle[i].className==sClass){" +
                            "aResult.push(aEle[i]);" +
                            "}" +
                            "};" +
                            "return aResult;}" +
                            "function hideView() {" +
                            "getClass(document,'header-fixed bottomline')[0].style.display='none';" +
                            "getClass(document,'zhanwei')[0].style.display='none';" +
                            "getClass(document,'tools')[0].style.display='none';}"


//                    val hideView =
//                        "javascript:function hideView() {" +
//                                " document.getElementsByClassName('header header-fixed bottomline')[0].style.display='none';" +
//                                "document.getElementsByClassName('tools')[0].style.display='none';" +
//                                "}"

                    view?.loadUrl(javascript)

                    view?.loadUrl("javascript:hideView();")


            }
        }

        web_college.loadUrl("https://gaokao.baidu.com/gaokao/m/school/home?word="+word)
    }

    override fun onBackPressedSupport() {
        if (web_college.canGoBack()){
            web_college.goBack()
        } else {
            super.onBackPressedSupport()
        }
    }
}