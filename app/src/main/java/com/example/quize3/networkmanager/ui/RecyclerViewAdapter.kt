package com.example.quize3.networkmanager.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.quize3.R
import com.example.quize3.networkmanager.usersdata.User
import okio.Utf8.size
import java.nio.file.Files.size

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    lateinit var user: User

        companion object {
            const val TAG = "Recycler Adapter"
        }



        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): RecyclerView.ViewHolder {
            Log.d(TAG, "onCreateViewHolder")

            val v = LayoutInflater.from(parent.context).inflate(R.layout.fragment_list_of_users, parent, false)

            return RecyclerView.ViewHolder(v)
        }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }
        override fun onBindViewHolder(
            holder: RecyclerView.ViewHolder,
            position: Int
        ) {
            Log.d(TAG, "onBindViewHolder")



        }

        override fun getItemCount(): Int {
            return user.size
        }


        inner class ViewHolder(
            itemView: View
        ) : RecyclerView.ViewHolder(itemView) {

            var fName: TextView = itemView.findViewById(R.id.firstname_recyclerView)
            var lName: TextView = itemView.findViewById(R.id.lastName_Field)
            var nCode: TextView = itemView.findViewById(R.id.nationalcode_recyclerView)

        }



}