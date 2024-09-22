package com.lytton.common.utils

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

/**
 * @program: News
 * @description: 偏好设置工具类, 是否登录, 是否显示引导界面, 用户ID
 * @author: LyttonYang
 * @create: 2024-09-04 23:19
 */
class DefaultPreferenceUtil(context: Context) {
    //保存上下文
    private var context: Context = context.applicationContext

    //获取系统默认偏好设置， 在设置界面保存的值就可以这样获取
    private val preference: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.context)
    
    companion object {
        @SuppressLint("StaticFieldLeak")
        private var instance: DefaultPreferenceUtil? = null
        
        private const val TERMS_SERVICE = "TERMS_SERVICE"
        
        /**
         * 单例模式
         */
        @Synchronized
        fun getInstance(context: Context): DefaultPreferenceUtil {
            if (instance == null) {
                instance = DefaultPreferenceUtil(context)
            } 
            return instance!!
        }
    }

    //region 用户协议
    //是否同意了用户条款
    val isAcceptTermServiceAgreement: Boolean
        get() = preference.getBoolean(TERMS_SERVICE, false)

    /**
     * 同意隐私条款的方法
     */
    fun setAcceptTermServiceAgreement() {
        preference.edit().putBoolean(TERMS_SERVICE, true).apply()
    }
    //endregion
    
}