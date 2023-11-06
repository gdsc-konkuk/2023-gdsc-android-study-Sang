package com.example.app3

import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class HomeAdapter(private val data: List<DummyData>) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.re_item, parent, false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

    inner class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imageView2)
        private val editText: EditText = itemView.findViewById(R.id.title_item)

        fun bind(item: DummyData) {
            imageView.setOnClickListener {
                item.isDone = !item.isDone
                bind(item)
            }
            imageView.setImageResource(if (item.isDone) R.drawable.done_checked else R.drawable.undone_checked)
            val titleEditable = Editable.Factory.getInstance().newEditable(item.title)
            editText.text = titleEditable

            editText.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                }

                override fun afterTextChanged(s: Editable?) {
                    // EditText 내용이 변경될 때 data class 업데이트
                    item.title = s.toString()
                }
            })
        }
    }
}
