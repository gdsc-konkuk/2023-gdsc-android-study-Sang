package com.example.app3

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.app3.databinding.ActivityEditProfileBinding

class EditProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 다음주에 뷰바인딩 정리 하면서 뷰바인딩 들어갈게용~
        val backEditProfile = findViewById<ImageView>(R.id.imageView_back)
        val saveButton = findViewById<Button>(R.id.saveButton)
        val nickNameEdit = findViewById<TextView>(R.id.editTextText)
        val editName = findViewById<TextView>(R.id.editName)

        backEditProfile.setOnClickListener {
            finish()
        }
        saveButton.setOnClickListener {
            if (nickNameEdit.text.isEmpty()) {
                Toast.makeText(this@EditProfileActivity, "닉네임은 빈칸일 수 없습니다.", Toast.LENGTH_SHORT)
                    .show()
            } else {
                //데이터 반영 뷰바인딩 담주 차근차근 정리하며 수정!
                editName.text = nickNameEdit.text.toString()
                Toast.makeText(this@EditProfileActivity, "저장 되었습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}