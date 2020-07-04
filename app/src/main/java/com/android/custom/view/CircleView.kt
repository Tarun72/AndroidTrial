package com.android.custom.view

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import androidx.core.content.ContextCompat
import com.android.retrofit.R

class CircleView (context:Context): View(context){
    var paint:Paint = Paint()
    var centerOfX =  340F
    var centerOfY =  340F
    var radiusOfCircleView =  140F
    init {
        paint.color = ContextCompat.getColor(context,android.R.color.holo_green_light)
        paint.strokeWidth = 40f
        paint.style = Paint.Style.STROKE// Constructor Call
    }override fun onDraw(canvas: Canvas?) {
        canvas?.drawCircle(centerOfX,centerOfY,radiusOfCircleView,paint)
        super.onDraw(canvas)
    }
}
