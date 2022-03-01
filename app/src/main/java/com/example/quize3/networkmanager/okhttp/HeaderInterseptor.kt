package com.example.quize3.networkmanager.okhttp

import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterseptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {

        val apiToken = "bkjcsbcg687hwgjhgksc"

        val apiRequest = chain.request().newBuilder()
            .addHeader("Authorization", "Bearer $apiToken")
            .build()

        return chain.proceed(apiRequest)
    }
}