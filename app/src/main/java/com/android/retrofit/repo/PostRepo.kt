package com.android.retrofit.repo

import androidx.lifecycle.LiveData
import com.android.retrofit.client.getApiService
import com.android.retrofit.entity.Post

class PostRepo {
    suspend fun getPosts(): List<Post> {
        val posts = getApiService().getPosts()
        return posts;
    }
}