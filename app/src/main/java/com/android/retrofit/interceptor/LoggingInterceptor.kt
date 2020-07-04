package com.android.retrofit.interceptor

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor

/**
 * Interceptors class
 *
 */


object LoggingInterceptor {

    fun getClientBasic():OkHttpClient{
        val loggingInterceptor:HttpLoggingInterceptor =  HttpLoggingInterceptor()
        //loggingInterceptor.level = HttpLoggingInterceptor.Level.BASIC
        loggingInterceptor.level = HttpLoggingInterceptor.Level.HEADERS

        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(loggingInterceptor)
        return httpClient.build()
    }

}

class InterceptorChain:Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response {

        return chain.proceed(chain.request())
    }

}