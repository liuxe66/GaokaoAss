package com.liuxe.gaokaoass.utils

import android.content.Context
import android.os.Build
import android.view.View
import androidx.annotation.NonNull

object StatusBarUtils {

    /**
     * 增加View的paddingTop,增加的值为状态栏高度 (智能判断，并设置高度)
     *
     * @param context 目标Context
     * @param view    需要增高的View
     */
    fun setPaddingTop(context: Context, @NonNull view: View) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val lp = view.layoutParams
            if (lp != null && view.paddingTop == 0) {
                lp.height += getStatusBarHeight(context)
                view.setPadding(
                    view.paddingLeft, view.paddingTop + getStatusBarHeight(context),
                    view.paddingRight, view.paddingBottom
                )
            }
        }
    }

    /**
     * 获取状态栏高度
     *
     * @param context 目标Context
     */
    fun getStatusBarHeight(context: Context): Int {
        // 获得状态栏高度
        val resourceId = context.resources.getIdentifier("status_bar_height", "dimen", "android")
        return context.resources.getDimensionPixelSize(resourceId)
    }

}