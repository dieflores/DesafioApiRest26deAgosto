package com.example.desafioapirest26deagosto.modelo

import retrofit2.Call
import retrofit2.http.GET

interface UserRetroCall {

    @GET("users")
    fun getUserList(): Call<ArrayList<Users>>
}