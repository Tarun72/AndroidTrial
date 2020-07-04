package com.android.retrofit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.android.retrofit.viewmodel.PostViewModel
import resources.Parser.getMappedData

/**
 * retrofit challenges
 * Beginning interceptors Completed
 * headers
 * authenticator
 * */
class PostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)
        var viewModel:PostViewModel = ViewModelProviders.of(this).get(PostViewModel::class.java)
        viewModel.getPosts()
        viewModel.livePostData.observe(this, Observer {
            print(it.size)
        it.forEach {
          // print(it)
        }
        }
        )


    }

}
