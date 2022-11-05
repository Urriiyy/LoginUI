//   Два Activity, переключение кнопкой Sign In (Sign Up)
//
package com.example.loginui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button11: TextView = findViewById(R.id.button11)
        button11.setOnClickListener(){
            val intent = Intent(this, EditActivity::class.java)
            startActivity(intent)
        }

    }
}