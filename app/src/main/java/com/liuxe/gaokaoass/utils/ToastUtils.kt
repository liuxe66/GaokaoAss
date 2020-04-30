package com.liuxe.gaokaoass.utils

import android.content.Context
import android.widget.Toast

object ToastUtils {
    private var mToast: Toast? = null

    /**
     * 显示一个toast提示
     *
     * @param text toast字符串
     */
    fun showToast(context: Context,text: String) {
        showToast(context,text, Toast.LENGTH_SHORT)
    }

    /**
     * 取消toast提示
     *
     */
    fun toastCancle() {
        /**
         * 保证运行在主线程
         */
        if (mToast != null) {
            mToast!!.cancel()
        }
    }

    /**
     * 显示一个toast提示
     *
     * @param context  context 上下文对象
     * @param text     toast字符串
     * @param duration toast显示时间
     */
    fun showToast(context: Context, text: String, duration: Int) {
        /**
         * 保证运行在主线程
         */

        if (mToast == null) {
            mToast = Toast.makeText(context, text, duration)
        } else {
            mToast!!.setText(text)
            mToast!!.duration = duration
        }
        mToast!!.show()

    }
}