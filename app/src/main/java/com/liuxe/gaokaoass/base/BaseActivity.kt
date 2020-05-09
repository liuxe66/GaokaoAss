package com.liuxe.gaokaoass.base

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseViewHolder
import com.gyf.immersionbar.ImmersionBar
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.utils.DisplayUtils
import me.yokeyword.fragmentation.SupportActivity


/**
 *
 * @author  Lai
 *
 * @time 2019/9/18 13:58
 * @describe describe
 *
 */
abstract class BaseActivity : SupportActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        initStatusBar()
        init(savedInstanceState)

        /*Looper.myQueue().addIdleHandler {
            false
        }*/
    }


    inline fun <reified T : RecyclerView.Adapter<BaseViewHolder>> getAdapter(recyclerView: RecyclerView): T? {
        recyclerView.adapter?.apply {
            return this as T
        }
        return null
    }

    @LayoutRes
    abstract fun getLayout(): Int

    abstract fun init(savedInstanceState: Bundle?)

    private fun initStatusBar() {
        ImmersionBar.with(this)
            .statusBarDarkFont(true)
            .keyboardEnable(true).init()
    }


    protected fun initTitleBar(toolbar: Toolbar, title: String) {
        toolbar.setTitleTextColor(resources.getColor(R.color.color_black))
        toolbar.setNavigationIcon(R.drawable.ic_back_black)
        toolbar.setNavigationOnClickListener(View.OnClickListener { onBackPressedSupport() })
        setTitleCenter(toolbar, title)
    }

    protected fun setRightTxt(
        toolbar: Toolbar,
        txt: String,
        onClickListener: View.OnClickListener
    ) {
        val titleText = TextView(this)
        titleText.setTextColor(ContextCompat.getColor(this, R.color.color_black))
        titleText.text = txt
        titleText.textSize = 14f
        titleText.gravity = Gravity.CENTER
        val layoutParams = Toolbar.LayoutParams(
            Toolbar.LayoutParams.WRAP_CONTENT,
            Toolbar.LayoutParams.WRAP_CONTENT
        )
        layoutParams.gravity = Gravity.RIGHT
        layoutParams.rightMargin = DisplayUtils.dp2px(16f)
        titleText.layoutParams = layoutParams
        titleText.setOnClickListener(onClickListener)
        toolbar.addView(titleText)
    }

    private fun setTitleCenter(toolbar: Toolbar, title: String) {
        val titleText = TextView(this)
        titleText.setTextColor(ContextCompat.getColor(this, R.color.color_black))
        titleText.text = title
        titleText.textSize = 18f
        //        TextPaint tp = titleText.getPaint();
        //        tp.setFakeBoldText(true);
        titleText.gravity = Gravity.CENTER
        val layoutParams = Toolbar.LayoutParams(
            Toolbar.LayoutParams.WRAP_CONTENT,
            Toolbar.LayoutParams.WRAP_CONTENT
        )
        layoutParams.gravity = Gravity.CENTER
        titleText.layoutParams = layoutParams
        toolbar.addView(titleText)
    }


    fun toast(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show()
    }

}