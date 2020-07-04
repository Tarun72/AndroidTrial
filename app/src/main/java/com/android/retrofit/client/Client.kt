package com.android.retrofit.client

import com.android.retrofit.interceptor.LoggingInterceptor
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BaseUrl = "https://jsonplaceholder.typicode.com/"


fun getRetrofit(): Retrofit {
    return Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .client(LoggingInterceptor.getClientBasic())
        .baseUrl(BaseUrl)
        .build()
}

fun getApiService(): ApiInterface {
    return getRetrofit()
        .create(ApiInterface::class.java)
}