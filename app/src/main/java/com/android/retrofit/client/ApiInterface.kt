package com.android.retrofit.client

import com.android.retrofit.entity.Post
import retrofit2.http.GET

interface ApiInterface {

    @GET("posts")
    suspend fun getPosts(): List<Post>

}