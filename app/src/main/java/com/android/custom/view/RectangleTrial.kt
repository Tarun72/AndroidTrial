package com.android.custom.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import androidx.core.content.ContextCompat

class RectangleTrial(context:Context, attr:AttributeSet) :View(context,attr){
    var right = 820F // end
    var bottom = 620F // bottom
    var left = 220F // screen start
    var top = 820F // top alignment

    var strokeWidth = 20F
    var paintRectangle:Paint = Paint()

    init {
        paintRectangle.color = ContextCompat.getColor(context,android.R.color.holo_green_light)
        paintRectangle.strokeWidth =strokeWidth
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        println("onAttachedToWindow")
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        println("onMeasure")
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        println("onLayout")

    }

    override fun layout(l: Int, t: Int, r: Int, b: Int) {
        super.layout(l, t, r, b)
        println("Layout")

    }

    override fun onDraw(canvas: Canvas?) {
        canvas?.drawRect(left,top,right,bottom,paintRectangle)
        super.onDraw(canvas)
        println("onDraw method is called ")
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        println("onDetachedFromWindow")

    }

}