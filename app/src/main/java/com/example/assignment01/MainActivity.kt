package com.example.assignment01

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley


class MainActivity : AppCompatActivity() {

    val url="https://jsonplaceholder.typicode.com/posts"

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.buttonSubmit)
        btn.setOnClickListener(View.OnClickListener {
            downloadTask()
        })


    }
    fun downloadTask(){
        val queue = Volley.newRequestQueue(this)
        val reques = StringRequest(Request.Method.GET,url,Response.Listener { response ->


            Log.e("Error",response.toString())
        },Response.ErrorListener {  })
        queue.add(reques)
    }

}