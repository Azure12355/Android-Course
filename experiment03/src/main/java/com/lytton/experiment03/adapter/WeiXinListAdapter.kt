package com.lytton.experiment03.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lytton.experiment03.R
import com.lytton.experiment03.entity.WeiXinUser

/**
 * @program: Homework
 * @description:
 * @author: LyttonYang
 * @create: 2024-09-19 07:59
 */
class WeiXinListAdapter(private val weixinList: List<WeiXinUser>): 
    RecyclerView.Adapter<WeiXinListAdapter.WeiXinHolder>() {
    class WeiXinHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val avatar: ImageView = itemView.findViewById(R.id.avatar)
        val name: TextView = itemView.findViewById(R.id.name)
        val msg: TextView = itemView.findViewById(R.id.msg)
        val time: TextView = itemView.findViewById(R.id.time)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeiXinHolder {
        val itemView = LayoutInflater.from(parent.context).
        inflate(R.layout.activity_wei_xin, parent, false)
        
        return WeiXinHolder(itemView)
    }

    override fun onBindViewHolder(holder: WeiXinHolder, position: Int) {
        val currentWeiXinUser = weixinList[position]
        holder.avatar.setImageResource(currentWeiXinUser.avatar)
        holder.name.text = currentWeiXinUser.name
        holder.msg.text = currentWeiXinUser.msg
        holder.time.text = currentWeiXinUser.time
        
    }

    override fun getItemCount(): Int {
        return weixinList.size
    }
}