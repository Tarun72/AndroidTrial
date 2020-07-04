package com.android.custom.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.retrofit.R

class CustomViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      /*  var circleView:CircleView = CircleView(this)
        setContentView(circleView)*/
        setContentView(R.layout.activity_custom_view)
    }
}
