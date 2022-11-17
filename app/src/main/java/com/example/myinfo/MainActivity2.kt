package com.example.myinfo

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import com.example.myinfo.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity(){

    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)




            var dataReceived = intent
            var fname :String = dataReceived.getStringExtra("fname").toString()
            var lname :String = dataReceived.getStringExtra("lname").toString()
            var email :String = dataReceived.getStringExtra("email").toString()
            var mobile :String = dataReceived.getStringExtra("mobile").toString()
            var gender :String = dataReceived.getStringExtra("gender").toString()
            var hobbies :String = dataReceived.getStringExtra("hobbies").toString()

            binding.ShareData.text = "Name : " + "$fname $lname" +"\n"+
                    "Mobile : " + "$mobile"+"\n"+
                    "Email : " + "$email"+"\n"+
                    "Gender : " + "$gender"+"\n"+
                    "Hobbies : " + "$hobbies"

        }
    }


