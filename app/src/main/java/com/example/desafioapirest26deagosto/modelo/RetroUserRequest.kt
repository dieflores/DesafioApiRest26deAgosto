package com.example.desafioapirest26deagosto.modelo

import retrofit2.Call
import retrofit2.Callback
import retrofit2.create

class RetroUserRequest {

    private var userCalls: UserRetroCall? = null

    init {
        userCalls = RetrofitUser.getRetro().create(UserRetroCall::class.java)
    }

    fun getUserListRequest(callB: Callback<ArrayList<Users>>){
        var call: Call<ArrayList<Users>> = userCalls!!.getUserList()
        call.enqueue(callB)

    }
}