package com.android.constraint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.retrofit.R
import java.lang.StringBuilder

class ConstraintExampleActivity : AppCompatActivity() {
   lateinit var theroy:StringBuilder
    var singleLineBreak:String = "\n"
    var doubleLineBreak:String = "\n\n"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_example)
        theroy = StringBuilder()
        theroy.append("**********************Constraint Layouts********************")
        theroy.append(doubleLineBreak)
        theroy.append("A ConstraintLayout is a android.view.ViewGroup which allows you to position and size widgets in a flexible way.")
        theroy.append(singleLineBreak)
            theroy.append("it allows us to build complex Ui with Flatten View Hierarchy(no nested view) ")
        theroy.append("https://coggle.it/diagram/XuWs7ORfjZgGi-n0/t/-")
        theroy.append("Relative positioning\n" +
                "Margins\n" +
                "Centering positioning\n" +
                "Circular positioning\n" +
                "Visibility behavior\n" +
                "Dimension constraints\n" +
                "Chains\n" +
                "Virtual Helpers objects\n" +
                "Optimizer\n")
        theroy.append(singleLineBreak)

    }
}
