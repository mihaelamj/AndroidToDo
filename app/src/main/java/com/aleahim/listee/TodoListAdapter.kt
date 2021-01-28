package com.aleahim.listee

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TodoListAdapter(val lists: ArrayList<TaskList>): RecyclerView.Adapter<TodoListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoListViewHolder {
        val view = LayoutInflater.from(parent.context)
        val inflate = view.inflate(R.layout.todo_list_view_holder, parent, false)
        return TodoListViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: TodoListViewHolder, position: Int) {
        val indexString = (position + 1).toString()
        holder.listPositionTextView.text = indexString
        holder.listTitleTextView.text = lists[position].name
    }

    override fun getItemCount(): Int {
//        return todoLists.size
        return lists.size
    }

    fun addList(list: TaskList) {
        lists.add(list)
        notifyItemInserted(lists.size - 1)
    }
}