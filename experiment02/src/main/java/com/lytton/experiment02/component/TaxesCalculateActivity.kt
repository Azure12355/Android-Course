package com.lytton.experiment02.component

import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import com.lytton.common.base.activity.BaseViewModelActivity
import com.lytton.experiment02.databinding.ActivityTaxesCalculateBinding

class TaxesCalculateActivity : BaseViewModelActivity<ActivityTaxesCalculateBinding>() {

    companion object {
        const val TAG = "TaxesCalculateActivity"
    }

    private var isUpdatingActualAmount = false // 标志变量，用于避免重复调用

    override fun initListeners() {
        // 创建 TextWatcher 实例
        val textWatcher: TextWatcher = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d(TAG, "beforeTextChanged: before changed")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d(TAG, "onTextChanged: ")
            }

            override fun afterTextChanged(s: Editable?) {
                if (isUpdatingActualAmount) return // 若正在更新，则退出该方法

                // 获取输入的金额和税款
                val payableAmountText = binding.payableAmount.text.toString()
                val taxesText = binding.taxes.text.toString()

                // 将输入字符串转换为数值，处理可能的异常
                val payableAmount = payableAmountText.toDoubleOrNull() ?: 0.0
                val taxes = taxesText.toDoubleOrNull() ?: 0.0

                // 计算实际金额
                val actualAmount = payableAmount - taxes

                // 更新实际金额 EditText
                isUpdatingActualAmount = true // 设置标志为 true
                binding.actualAmount.setText(actualAmount.toString())
                isUpdatingActualAmount = false // 更新完成后，重置标志
            }
        }

        // 获取所有 EditText 控件并设置 TextWatcher
        val editTexts: List<EditText> =
            listOf(binding.payableAmount, binding.taxes, binding.actualAmount)
        editTexts.forEach { editText: EditText ->
            editText.addTextChangedListener(textWatcher)
        }
    }
}
