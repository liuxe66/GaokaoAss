package com.liuxe.gaokaoass.utils

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Matrix
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.VectorDrawable
import android.os.Build
import android.renderscript.Allocation
import android.renderscript.Element
import android.renderscript.RenderScript
import android.renderscript.ScriptIntrinsicBlur
import android.view.View
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat

object BitmapUtils {
    /**
     * 将一个view转换成bitmap位图
     * @param view 要转换的View
     * @return view转换的bitmap
     */
    fun viewToBitmap(view: View): Bitmap {
        val bitmap = Bitmap.createBitmap(
            view.measuredWidth, view.measuredHeight,
            Bitmap.Config.ARGB_8888
        )
        view.draw(Canvas(bitmap))
        return bitmap
    }

    /**
     * 获取模糊虚化的bitmap
     * @param context
     * @param bitmap 要模糊的图片
     * @param radius 模糊等级 >=0 && <=25
     * @return
     */
    fun getBlurBitmap(context: Context, bitmap: Bitmap, radius: Int): Bitmap {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            blurBitmap(context, bitmap, radius)
        } else bitmap
    }

    /**
     * android系统的模糊方法
     *
     * @param bitmap 要模糊的图片
     * @param radius 模糊等级 >=0 && <=25
     */
    private fun blurBitmap(context: Context, bitmap: Bitmap, radius: Int): Bitmap {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            //Let's create an empty bitmap with the same size of the bitmap we want to blur
            val outBitmap = Bitmap.createBitmap(
                bitmap.width, bitmap.height, Bitmap
                    .Config.ARGB_8888
            )
            //Instantiate a new Renderscript
            val rs = RenderScript.create(context)
            //Create an Intrinsic Blur Script using the Renderscript
            val blurScript = ScriptIntrinsicBlur.create(rs, Element.U8_4(rs))
            //Create the Allocations (in/out) with the Renderscript and the in/out bitmaps
            val allIn = Allocation.createFromBitmap(rs, bitmap)
            val allOut = Allocation.createFromBitmap(rs, outBitmap)
            //Set the radius of the blur
            blurScript.setRadius(radius.toFloat())
            //Perform the Renderscript
            blurScript.setInput(allIn)
            blurScript.forEach(allOut)
            //Copy the final bitmap created by the out Allocation to the outBitmap
            allOut.copyTo(outBitmap)
            //recycle the original bitmap
            //            bitmap.recycle();
            //After finishing everything, we destroy the Renderscript.
            rs.destroy()
            return outBitmap
        } else {
            return bitmap
        }
    }

    /**
     * 获取drawable资源文件图片bitmap
     *
     * @param context context
     * @param id      资源文件id
     * @return 资源文件对应图片bitmap
     */
    fun getBitmap(context: Context, @DrawableRes id: Int): Bitmap {
        return BitmapFactory.decodeResource(context.resources, id)
    }

    fun getBitmapFromDrawable(context: Context, @DrawableRes drawableId: Int): Bitmap {
        val drawable = ContextCompat.getDrawable(context, drawableId)

        if (drawable is BitmapDrawable) {
            return (drawable as BitmapDrawable).bitmap
        } else if (drawable is VectorDrawable || drawable is VectorDrawableCompat) {
            val bitmap = Bitmap.createBitmap(
                drawable.getIntrinsicWidth(),
                drawable.getIntrinsicHeight(),
                Bitmap.Config.ARGB_8888
            )
            val canvas = Canvas(bitmap)
            drawable.setBounds(0, 0, canvas.width, canvas.height)
            drawable.draw(canvas)

            return bitmap
        } else {
            throw IllegalArgumentException("unsupported drawable type")
        }
    }

    /**
     * 转换bitmap宽高
     *
     * @param bitmap    bitmap
     * @param newWidth  新的bitmap宽度
     * @param newHeight 新的bitmap高度
     * @return 转换宽高后的bitmap
     */
    fun conversionBitmap(bitmap: Bitmap, newWidth: Int, newHeight: Int): Bitmap {
        val width = bitmap.width
        val height = bitmap.height
        // 计算缩放比例
        val scaleWidth = newWidth.toFloat() / width
        val scaleHeight = newHeight.toFloat() / height
        // 取得想要缩放的matrix参数
        val matrix = Matrix()
        matrix.postScale(scaleWidth, scaleHeight)
        // 得到新的图片
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true)
    }
}