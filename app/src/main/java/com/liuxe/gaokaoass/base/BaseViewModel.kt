package com.liuxe.gaokaoass.base

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.liuxe.energyweather.http.ExceptionHandle
import kotlinx.coroutines.*

/**
 *
 * @author  Lai
 *
 * @time 2019/9/19 14:41
 * @describe describe
 *
 */
open class BaseViewModel : ViewModel(), LifecycleObserver {

    //异常数据
    val mException: MutableLiveData<Throwable> = MutableLiveData()

}


