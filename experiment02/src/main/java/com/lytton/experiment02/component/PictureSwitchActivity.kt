package com.lytton.experiment02.component

import com.lytton.common.base.activity.BaseViewModelActivity
import com.lytton.experiment02.R
import com.lytton.experiment02.databinding.ActivityPictureSwitchBinding

class PictureSwitchActivity : BaseViewModelActivity<ActivityPictureSwitchBinding>() {
    
    private val images: Array<Int> = arrayOf(
        R.drawable.vue,
        R.drawable.java,
        R.drawable.kotlin,
        R.drawable.photoshop,
        R.drawable.tailwindcss6
    )
    
    private var currentIndex: Int = 0


    override fun initListeners() {
        super.initListeners()
        binding.switchPicture.setOnClickListener {
            currentIndex = ++currentIndex % images.size
            binding.imageView.setImageResource(images[currentIndex])
        }
    }
}