package com.liuxe.gaokaoass.utils

import android.content.Context
import android.graphics.*

/*
 *Created by Liuxe on 
 *desc : 
 */
object  TopImageUtil {

    /**图片加上配文后生成的新图片*/
    private var mNewBitmap: Bitmap? = null
    /**图片的宽度*/
    private var mBitmapWidth: Int = 0
    /**图片的高度*/
    private var mBitmapHeight: Int = 0
    /**画图片的画笔*/
    private var mBitmapPaint: Paint? = null
    /**画文字的画笔*/
    private var mTextPaint: Paint? = null

    init {
        mBitmapPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        mTextPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    }

    fun drawTextToBitmap(context: Context, imgId: Int, text: String): Bitmap? {
        val bitmapSource = BitmapFactory.decodeResource(context.resources, imgId)
        mBitmapWidth = bitmapSource.width
        mBitmapHeight = bitmapSource.height

        mNewBitmap = Bitmap.createBitmap(
            mBitmapWidth,
            mBitmapHeight,
            Bitmap.Config.ARGB_8888
        )
        val canvas = Canvas(mNewBitmap!!)
        //把图片画上来
        canvas.drawBitmap(bitmapSource, 0f, 0f, mBitmapPaint)

        mTextPaint?.color = Color.parseColor("#f7585c")
        mTextPaint?.isFakeBoldText = true
        mTextPaint?.textSize = 100f

        drawText(canvas,text,190f,320f, mTextPaint!!,-5f)

        canvas.save()
        canvas.restore()
        return mNewBitmap
    }

    fun drawText(canvas: Canvas, text: String, x: Float, y: Float, paint: Paint, angle: Float) {
        if (angle != 0f) {
            canvas.rotate(angle, x, y)
        }
        canvas.drawText(text, x, y, paint)
        if (angle != 0f) {
            canvas.rotate(-angle, x, y)
        }
    }

}