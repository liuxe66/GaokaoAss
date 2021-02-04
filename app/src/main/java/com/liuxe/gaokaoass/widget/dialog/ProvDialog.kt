package com.liuxe.gaokaoass.widget.dialog

import android.app.Dialog
import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View.MeasureSpec.UNSPECIFIED
import android.view.View.MeasureSpec.makeMeasureSpec
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.liuxe.gaokaoass.R.*


class ProvDialog(private var ctx: Context, themeResId: Int) : Dialog(ctx, themeResId) {

    var itemClickListener:DialogItemClickListener? = null
    var provArr = arrayOf(
        "河南","上海", "云南", "内蒙古", "北京", "吉林", "四川", "天津", "宁夏", "安徽",
        "山东", "山西", "广东", "广西", "新疆", "江苏", "江西", "河北",  "浙江", "海南", "湖北",
        "湖南", "甘肃", "福建", "西藏", "贵州", "辽宁", "重庆", "陕西", "青海", "黑龙江"
    )

    var title: String = "请选择省份"
    var list: ArrayList<String> = provArr.toList() as ArrayList<String>
    var location:String = ""

    constructor(ctx: Context,location:String) : this(ctx, style.BottomDialog) {
        this.location = location
        init()
    }

    private fun init() {
        val contentView = LayoutInflater.from(ctx).inflate(layout.dialog_bottom, null)
        val tvTitle: TextView = contentView.findViewById(id.tv_dialog_title)
        val recyclerView: RecyclerView = contentView.findViewById(id.recycler_dialog)
        tvTitle.text = title
        val bottomAdapter = BottomAdapter(list,location)
        val layoutManager = GridLayoutManager(ctx,2)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = bottomAdapter
        bottomAdapter.setOnItemClickListener { adapter, view, position ->
            itemClickListener?.onItemClick(list[position])
            dismiss()
        }

        this.setContentView(contentView)


        val params: ViewGroup.LayoutParams = contentView.layoutParams
        //将布局宽度设置为屏幕的宽度
        params.width = ctx.resources.displayMetrics.widthPixels

        //获取布局的实际测量高度
        val h = makeMeasureSpec(0, UNSPECIFIED)
        contentView.measure(h, 0)
        params.height = contentView.measuredHeight

        //当高度大于屏幕3/4，控件高度设置为屏幕的3/4
        if (params.height >= ctx.resources.displayMetrics.heightPixels / 5 * 4) {
            params.height = ctx.resources.displayMetrics.heightPixels / 5 * 4
        }

        contentView.layoutParams = params
        this.setCanceledOnTouchOutside(true)
        this.window!!.setGravity(Gravity.BOTTOM)
        this.window!!.setWindowAnimations(style.BottomDialog_Animation)

    }


}