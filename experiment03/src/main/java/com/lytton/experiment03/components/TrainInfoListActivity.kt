package com.lytton.experiment03.components

import androidx.recyclerview.widget.LinearLayoutManager
import com.lytton.common.base.activity.BaseViewModelActivity
import com.lytton.experiment03.adapter.TrainInfoListAdapter
import com.lytton.experiment03.databinding.ActivityTrainInfoListBinding
import com.lytton.experiment03.entity.TrainInfo

class TrainInfoListActivity : BaseViewModelActivity<ActivityTrainInfoListBinding>() {
    
    private lateinit var trainInfoList: List<TrainInfo>
    private lateinit var trainInfoListAdapter: TrainInfoListAdapter

    override fun initDatum() {
        super.initDatum()
        
        trainInfoList = listOf(
            TrainInfo("G11111", "孟买", "迪拜", 888888.0),
            TrainInfo("G22222", "南极", "北极", 18799999.0),
            TrainInfo("G33333", "东京", "纽约", 2000000.0),
            TrainInfo("G44444", "开罗", "墨西哥", 8909988.0),
            TrainInfo("G55555", "悉尼", "冰岛", 8232288.0),
            TrainInfo("G11111", "新西兰", "瑞士", 1293188.0),
            TrainInfo("G22222", "伦敦", "巴黎", 88123418.0),
            TrainInfo("G33333", "华盛顿", "苏丹", 8899988.0),
            TrainInfo("G44444", "洛杉矶", "阿拉斯加", 8234188.0),
            TrainInfo("G55555", "牙买加", "摩洛哥", 1321888.0),
        )
        
        binding.trainInfoList.layoutManager = LinearLayoutManager(this)
        trainInfoListAdapter = TrainInfoListAdapter(trainInfoList)
        binding.trainInfoList.adapter = trainInfoListAdapter
        
    }
}