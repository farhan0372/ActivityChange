package com.example.activitychange

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edt_name=findViewById<EditText>(R.id.ac_main_edt_name)
        val edt_family=findViewById<EditText>(R.id.ac_main_edt_family)
        val btn_confirm=findViewById<Button>(R.id.ac_main_btn_confirm)

        btn_confirm.setOnClickListener {

            var intent:Intent= Intent(this,MainActivity2::class.java)
            intent.putExtra("edt_name",edt_name.text.toString())
            intent.putExtra("edt_family",edt_family.text.toString())
            finish()



        }

    }
}