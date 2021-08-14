package com.example.a10118349_uas_akb.dasbord

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.a10118349_uas_akb.R

class DasbordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dasbord)


        val btn = findViewById<Button>(R.id.btn_member)
        btn.setOnClickListener { toMain() }
    }

    fun toMain() {
        val i = Intent(this@DasbordActivity, HomeActivity::class.java)
        startActivity(i)
    }
}






