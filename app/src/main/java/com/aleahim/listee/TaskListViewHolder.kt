package com.aleahim.listee

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val tasktextView = itemView?.findViewById<TextView>(R.id.textView_taskName) as TextView
}