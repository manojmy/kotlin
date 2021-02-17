package com.example.kotlin.dashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.kotlin.GetActivity
import com.example.kotlin.R
import java.time.Instant

class DashboardActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
       var getapidata = findViewById<Button>(R.id.getapidata);
        getapidata.setOnClickListener(this)
            }
    override fun onClick(v: View?) {
       when(v?.id){
           R.id.getapidata ->{
               var  intent= Intent(this,GetActivity::class.java)
               startActivity(intent)
           }
       }
    }
}