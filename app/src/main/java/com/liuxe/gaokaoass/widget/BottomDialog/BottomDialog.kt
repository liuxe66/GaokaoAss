package com.liuxe.gaokaoass.widget.BottomDialog

import android.app.Dialog
import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.liuxe.gaokaoass.R.*
import android.view.View.MeasureSpec.*
import androidx.recyclerview.widget.GridLayoutManager


class BottomDialog(var ctx: Context, themeResId: Int) : Dialog(ctx, themeResId) {

    var itemClickListener:DialogItemClickListener? = null

    var title: String = ""
    var default:String = ""
    var list:ArrayList<String> = ArrayList()

    constructor(ctx: Context,title:String,default:String,list:List<String>) : this(ctx, style.BottomDialog) {
        this.title = title
        this.default = default
        this.list = list as ArrayList<String>
        init()
    }

    private fun init() {
        val contentView = LayoutInflater.from(ctx).inflate(layout.dialog_bottom, null)
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
        if (params.height >= ctx!!.getResources().getDisplayMetrics().heightPixels /5 * 4) {
            params.height = ctx!!.getResources().getDisplayMetrics().heightPixels / 5 * 4
        }

        contentView.layoutParams = params
        this.setCanceledOnTouchOutside(true)
        this.window!!.setGravity(Gravity.BOTTOM)
        this.window!!.setWindowAnimations(style.BottomDialog_Animation)

    }


}