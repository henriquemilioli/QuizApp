package br.henrique.francisco.quizapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class MessageAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val items : List<String> = listOf("Um", "Dois", "Três")

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val card = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.message_card, parent, false)
        return MessageViewHolder(card)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val currentItem = items[position]
        if (holder is MessageViewHolder){
            holder.messageTextView.text = currentItem
        }
    }

    class MessageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val messageTextView: TextView = itemView.findViewById(R.id.message_textView)
    }



}