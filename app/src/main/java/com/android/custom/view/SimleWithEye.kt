package com.android.custom.view

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.ContextMenu
import android.view.View

class SimleWithEye(context: Context, attr:AttributeSet):View(context, attr){

    init {

    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        println("onAttachedToWindow")
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
    }

    override fun layout(l: Int, t: Int, r: Int, b: Int) {
        super.layout(l, t, r, b)
    }

    override fun draw(canvas: Canvas?) {
        println("intrinsic bound")
        super.draw(canvas)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        println("always perform task in this view draw method call this method ")
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        println("onDetachedFromWindow")

    }

}
