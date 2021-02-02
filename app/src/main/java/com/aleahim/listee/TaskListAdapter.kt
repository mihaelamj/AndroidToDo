package com.aleahim.listee

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TaskListAdapter(var list: TaskList) : RecyclerView.Adapter<TaskListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.task_view_holder, parent, false)
        return TaskListViewHolder(view)
    } // TaskList

    override fun onBindViewHolder(holder: TaskListViewHolder, position: Int) {
       holder.tasktextView?.text = list.tasks[position]
    }

    override fun getItemCount(): Int {
        return list.tasks.size
    }
}