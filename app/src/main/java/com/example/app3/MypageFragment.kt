package com.example.app3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.app3.databinding.FragmentMypageBinding

fun countIsDone(dummyDataList: List<DummyData>): Int {
    return dummyDataList.count { it.isDone }
}

class MypageFragment : Fragment() {

    private lateinit var binding: FragmentMypageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Log.v("4","실행")
        binding = FragmentMypageBinding.inflate(inflater, container, false)

        val myPageEdit = binding.imageView51


        myPageEdit.setOnClickListener {
            // 프래그먼트 전환 코드
            val editProfileFragment = ProfileEditFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.mainFrameLayout, editProfileFragment)
                .addToBackStack(null) // 뒤로가기 스택에 추가
                .commit()
        }

        return binding.root
    }
}