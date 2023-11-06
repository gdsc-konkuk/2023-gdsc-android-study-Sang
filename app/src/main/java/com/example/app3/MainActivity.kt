package com.example.app3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myPageEdit = findViewById<ImageView>(R.id.imageView5_1) //다음주에 뷰바인딩 정리 하면서 뷰바인딩 들어갈게용~

        val intent = Intent(this, EditProfileActivity::class.java) //클래스에 뭐가 들어있는지를 넘겨줌 : reflection

        myPageEdit.setOnClickListener {
            startActivity(intent)
        }
    }
}