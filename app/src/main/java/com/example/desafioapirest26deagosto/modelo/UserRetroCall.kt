package com.example.desafioapirest26deagosto.modelo

import retrofit2.http.GET

interface UserRetroCall {

    @GET("/users")
    fun getUserList():ArrayList<Users>
}