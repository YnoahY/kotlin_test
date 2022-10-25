package com.junga.memo

import MemoEntity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_memo.view.*
import java.lang.reflect.Constructor

class MyAdapter(val context : Context,
                var list : List<MemoEntity>,
                var onDeleteListener: onDeleteListener) : RecyclerView.Adapter<MyAdapter.MyViewHoler>() {

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHoler {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_memo,parent,false)

        return MyViewHoler(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHoler, position: Int) {
        //list = 1, 2, 3,
        val memo:MemoEntity = list[position]

        holder.memo.text = memo.memo
        holder.root.setOnLongClickListener(object : View.OnLongClickListener {
            override fun onLongClick(v: View?): Boolean {
                onDeleteListener.onDeleteListener(memo)
                return true
            }
        })

    }

    inner class MyViewHoler(itemViw : View) : RecyclerView.ViewHolder(itemViw) {
        val memo: TextView = itemView.textview_memo
        val root: ConstraintLayout = itemView.root

    }

}