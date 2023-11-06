package com.example.app3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.app3.databinding.FragmentProfileEditBinding

class ProfileEditFragment : Fragment() {
    private lateinit var binding: FragmentProfileEditBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileEditBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.imageViewBack.setOnClickListener {
            @Suppress("DEPRECATION")
            requireActivity().onBackPressed()
        }
        binding.saveButton.setOnClickListener {
            if (binding.editTextText.text.isEmpty()) {
                Toast.makeText(requireContext(), "닉네임은 빈칸일 수 없습니다.", Toast.LENGTH_SHORT).show()
            } else {
                // 데이터 반영 (뷰 바인딩으로 수정 필요)
                binding.editName.text = binding.editTextText.text.toString()
                Toast.makeText(requireContext(), "저장되었습니다.", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}
