package com.lytton.experiment03.components

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.lytton.common.base.activity.BaseViewModelActivity
import com.lytton.experiment03.R
import com.lytton.experiment03.adapter.TrainInfoListAdapter
import com.lytton.experiment03.adapter.WeiXinListAdapter
import com.lytton.experiment03.databinding.ActivityWeiXinListBinding
import com.lytton.experiment03.entity.TrainInfo
import com.lytton.experiment03.entity.WeiXinUser

class WeiXinListActivity : BaseViewModelActivity<ActivityWeiXinListBinding>() {
    private lateinit var weixinList: List<WeiXinUser>
    private lateinit var weixinListAdapter: WeiXinListAdapter

    override fun initDatum() {
        super.initDatum()

        weixinList = listOf(
            WeiXinUser(R.drawable.a12, "你玩感情我玩命√", "你若折我姐妹翅膀，我定毁你整个天堂。", "20:00"),
            WeiXinUser(R.drawable.a14, "有多远滚多远", "我从不奢望，有人能读出老子的忧伤。", "20:00"),
            WeiXinUser(R.drawable.a15, "老子有资格拽i", "你的长相，影响了我滴健康成长，我看到你`，心情比上坟还要纠结。", "20:00"),
            WeiXinUser(R.drawable.a16, "没心没肺总比撕心裂肺好", "我害怕的是，那些回忆，我还记得，你却忘了", "20:00"),
            WeiXinUser(R.drawable.a17, "滚不滚随你", "我要努力成为你未来见到会后悔没好好珍惜的人。", "20:00"),
            WeiXinUser(R.drawable.a18, "为爱战天下丶", " 不是所有的努力都能成功，不是所有的付出都有回报 。", "20:00"),
            WeiXinUser(R.drawable.a19, "哥不伺候低等妞儿、", "你永远都不知道有些话从你嘴里说出来我是多么的难过？", "20:00"),
            WeiXinUser(R.drawable.a20, "浮夸半生、", "我的脾气赶走了很多人， 但留下了最真的人。", "20:00"),
            WeiXinUser(R.drawable.a21, "圈子不同别硬碰", "时间告诉你，无理取闹的年龄过了，该懂事了。", "20:00"),
            WeiXinUser(R.drawable.a22, "走好不送", " 好好生活 慢慢相遇。", "20:00"),
            WeiXinUser(R.drawable.a23, "滚!你碍我眼了", "宁愿用这一生等你发现，我一直在你身旁从未走远。", "20:00"),
            WeiXinUser(R.drawable.a24, "趁你病，要你命", "果我爱你可以换来你爱我。那我愿意一辈子爱你", "20:00"),
            WeiXinUser(R.drawable.a12, "汉子称霸天下@", "放弃、你说得如此容易。我却要用尽力气去执行", "20:00"),
            WeiXinUser(R.drawable.a14, "朕免你一死", "亲爱的过去，请别再拍我的肩膀，我不想再回头。", "20:00"),
            WeiXinUser(R.drawable.a15, "老子不按开关你发屁光", "我从不争抢，是我的谁也抢不走，不是我的，我也不强留。", "20:00"),
            WeiXinUser(R.drawable.a16, "斩尽メ天下", "青春是一道明媚的忧伤，我没哭，可是眼泪流下来了", "20:00"),
            WeiXinUser(R.drawable.a17, "我不要等待ゝ", "找不到对的人，其实很可能是，改不掉错的自己。", "20:00"),
        )

        binding.weiXinList.layoutManager = LinearLayoutManager(this)
        weixinListAdapter = WeiXinListAdapter(weixinList)
        binding.weiXinList.adapter = weixinListAdapter

    }
}