package com.example.app3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class EditProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editprofile)

        //다음주에 뷰바인딩 정리 하면서 뷰바인딩 들어갈게용~
        val backEditProfile = findViewById<ImageView>(R.id.imageView_back)
        val saveButton = findViewById<Button>(R.id.saveButton)
        var nickNameEdit = findViewById<TextView>(R.id.editTextText)
        var editName = findViewById<TextView>(R.id.editName)


        backEditProfile.setOnClickListener{ finish() }
        saveButton.setOnClickListener{
            if(TextUtils.isEmpty(nickNameEdit.text.toString()))
            {
                Toast.makeText(this@EditProfile, "닉네임은 빈칸일 수 없습니다.", Toast.LENGTH_SHORT).show()
            }
            else
            {
                //데이터 반영 뷰바인딩 담주 차근차근 정리하며 수정!
                editName.text = nickNameEdit.text.toString()
                Toast.makeText(this@EditProfile, "저장 되었습니다.", Toast.LENGTH_SHORT).show()
            }
        }

    }
}