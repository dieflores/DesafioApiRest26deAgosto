package com.example.desafioapirest26deagosto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.desafioapirest26deagosto.modelo.RetroUserRequest
import com.example.desafioapirest26deagosto.modelo.Users
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), Callback<ArrayList<Users>> {

    lateinit var recView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recView = findViewById(R.id.recyclerView)
        recView.layoutManager = LinearLayoutManager(this)

        loadAPI()
    }

    fun loadAPI(){
        var request: RetroUserRequest = RetroUserRequest()
        request.getUserListRequest(this)
    }

    override fun onResponse(call: Call<ArrayList<Users>>, response: Response<ArrayList<Users>>) {
        if (response != null){
            recView.adapter = UserListAdapter(response.body()!!)

        }
    }

    override fun onFailure(call: Call<ArrayList<Users>>, t: Throwable) {

    }
}