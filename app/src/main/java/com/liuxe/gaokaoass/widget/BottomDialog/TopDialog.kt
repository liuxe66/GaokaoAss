package com.liuxe.gaokaoass.widget.BottomDialog

import android.app.Dialog
import android.content.Context
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.liuxe.gaokaoass.R.*
import android.view.View.MeasureSpec.*
import androidx.recyclerview.widget.GridLayoutManager
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import android.view.View.SYSTEM_UI_FLAG_IMMERSIVE
import android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
import android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
import android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.*


class TopDialog(var ctx: Context, themeResId: Int) : Dialog(ctx, themeResId) {

    var itemClickListener:DialogItemClickListener? = null

    var title: String = ""
    var default:String = ""
    var list:ArrayList<String> = ArrayList()

    constructor(ctx: Context,title:String,default:String,list:List<String>) : this(ctx, style.TopDialog) {
        this.title = title
        this.default = default
        this.list = list as ArrayList<String>
        init()
    }

    override fun onStart() {
        super.onStart()
        val uiOptions = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_IMMERSIVE
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
        this.window!!.decorView.systemUiVisibility = uiOptions
    }

    private fun init() {
        this.setCanceledOnTouchOutside(true)
        this.window!!.setGravity(Gravity.TOP)
        this.window!!.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        this.window!!.setWindowAnimations(style.TopDialog_Animation)
        val contentView = LayoutInflater.from(ctx).inflate(layout.dialog_top, null)
        var tvTitle: TextView = contentView.findViewById(id.tv_dialog_title)
        var recyclerView: RecyclerView = contentView.findViewById(id.recycler_dialog)
        tvTitle.text = title
        var bottomAdapter = BottomAdapter(list,default)
        var layoutManager: GridLayoutManager = GridLayoutManager(ctx,2)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = bottomAdapter
        bottomAdapter.setOnItemClickListener(BaseQuickAdapter.OnItemClickListener { adapter, view, position ->

            itemClickListener?.onItemClick(list[position])
            dismiss()
        })

        this.setContentView(contentView)


        var params: ViewGroup.LayoutParams = contentView.layoutParams
        //将布局宽度设置为屏幕的宽度
        params.width = ctx!!.getResources().getDisplayMetrics().widthPixels

        //获取布局的实际测量高度
        val h = makeMeasureSpec(0, UNSPECIFIED)
        contentView.measure(h, 0)
        params.height = contentView.getMeasuredHeight()

        //当高度大于屏幕3/4，控件高度设置为屏幕的3/4
        if (params.height >= ctx!!.getResources().getDisplayMetrics().heightPixels / 5 * 4) {
            params.height = ctx!!.getResources().getDisplayMetrics().heightPixels /5 * 4
        }

        contentView.layoutParams = params


    }


}