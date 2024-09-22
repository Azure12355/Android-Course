package com.lytton.experiment02

import android.util.Log
import com.lytton.common.base.activity.BaseViewModelActivity
import com.lytton.experiment02.component.LoginActivity
import com.lytton.experiment02.component.PictureSwitchActivity
import com.lytton.experiment02.component.TaxesCalculateActivity
import com.lytton.experiment02.component.TrainNumberInquiryActivity
import com.lytton.experiment02.databinding.ActivityMainBinding

class MainActivity : BaseViewModelActivity<ActivityMainBinding>() {
    
    companion object {
        const val TAG = "MainActivity"
    }

    override fun initListeners() {
        super.initListeners()
        binding.taxesCalculate.setOnClickListener {
            Log.d(TAG, "initListeners: click TaxesCalculateActivity")
            startActivity(TaxesCalculateActivity::class.java)
        }
        
        binding.login.setOnClickListener {
            startActivity(LoginActivity::class.java)
        }
        
        binding.trainNumberInquiry.setOnClickListener {
            startActivity(TrainNumberInquiryActivity::class.java)
        }
        
        binding.picturePolling.setOnClickListener {
            startActivity(PictureSwitchActivity::class.java)
        }
    }
}