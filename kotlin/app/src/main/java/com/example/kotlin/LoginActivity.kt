package com.example.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EdgeEffect
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity(), View.OnClickListener {
   // var et_username;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init();
    }

    private fun init() {
         var  tv_welcome=  findViewById<TextView>(R.id.tv_login)
         var  tv_forgotpassword=  findViewById<TextView>(R.id.tv_forgotpassword)
        var et_username= findViewById<EditText>(R.id.et_username)
        var et_userpassword= findViewById<EditText>(R.id.et_userpassword)
        tv_welcome.setOnClickListener(this)
        tv_forgotpassword.setOnClickListener(this)

    }
    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.tv_login -> {/* code goes here */
              //  et_username.setText();
                var intent=  Intent(this,DashBoradActivity::class.java);
                startActivity(intent)

            }
            R.id.tv_forgotpassword ->{
                Toast.makeText(this,"Comming Soon",Toast.LENGTH_SHORT).show()
            }
        }

    }
}