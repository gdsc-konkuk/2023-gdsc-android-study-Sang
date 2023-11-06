package com.example.app3

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.app3.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private val dummyDataList = mutableListOf(
        DummyData("2023-11-06", 1, "카공하러 가기", false),
        DummyData("2023-11-06", 2, "영어 공부하기", true),
        DummyData("2023-11-06", 3, "운동하기", false) ,
        DummyData("2023-11-06", 4, "카공하러 가기", false),
        DummyData("2023-11-06", 5, "영어 공부하기", true),
        DummyData("2023-11-06", 6, "운동하기", false),
        DummyData("2023-11-06", 7, "카공하러 가기", false),
        DummyData("2023-11-06", 8, "영어 공부하기", false),
        DummyData("2023-11-06", 9, "운동하기", false) ,
        DummyData("2023-11-06", 10, "카공하러 가기", false),
        DummyData("2023-11-06", 11, "영어 공부하기", false),
        DummyData("2023-11-06", 12, "운동하기", false),
        DummyData("2023-11-06", 13, "카공하러 가기", false),
        DummyData("2023-11-06", 14, "영어 공부하기", false),
        DummyData("2023-11-06", 15, "운동하기", false)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root

        val recyclerView = binding.recyclerHome
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = HomeAdapter(dummyDataList)


        view.setOnClickListener {
            // 포커스를 해제할 EditText를 찾아서 포커스 해제
            val editText = view.findFocus() as? EditText
            editText?.clearFocus()
        }

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }


}