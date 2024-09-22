package com.lytton.experiment03.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lytton.experiment03.R
import com.lytton.experiment03.entity.TrainInfo

/**
 * @program: Homework
 * @description:
 * @author: LyttonYang
 * @create: 2024-09-18 21:08
 */

class TrainInfoListAdapter(private val trainInfoList: List<TrainInfo>):
    RecyclerView.Adapter<TrainInfoListAdapter.TrainViewHolder>() {

    class TrainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.name)
        val start: TextView = itemView.findViewById(R.id.start)
        val end: TextView = itemView.findViewById(R.id.end)
        val price: TextView = itemView.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrainViewHolder {
        val itemView = LayoutInflater.from(parent.context).
        inflate(R.layout.activity_train_info, parent, false)
        
        return TrainViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TrainViewHolder, position: Int) {
        val currentTrain = trainInfoList[position]
        holder.name.text = currentTrain.name
        holder.start.text = currentTrain.start
        holder.end.text = currentTrain.end
        holder.price.text = currentTrain.price.toString()

        Log.d("TrainInfoListAdapter", "Binding train: ${currentTrain.name}") // 添加日志
    }

    override fun getItemCount(): Int {
        return trainInfoList.size
    }
}