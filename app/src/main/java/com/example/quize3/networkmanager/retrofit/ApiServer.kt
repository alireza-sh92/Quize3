package com.example.quize3.networkmanager.retrofit

import com.example.quize3.networkmanager.usersdata.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST


interface ApiServer {
    @POST("/users")
    fun updateUser(
        @Body user: User
    ): Call<User>


}