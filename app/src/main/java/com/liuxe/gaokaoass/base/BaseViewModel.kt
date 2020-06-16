package com.liuxe.gaokaoass.base

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.liuxe.energyweather.http.ExceptionHandle
import com.orhanobut.logger.Logger
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


    /**
     * 用来包裹协程的错误信息
     */
    private suspend fun <T> tryCatch(tryBlock: suspend CoroutineScope.() -> BaseResponse<T>): BaseResponse<T> {
        return coroutineScope {
            try {
                return@coroutineScope tryBlock()
            } catch (e: Throwable) {
                e.printStackTrace()
                Logger.e(e.message + "======")
                val message = ExceptionHandle.handleException(e)?.message
                val response = BaseResponse<T>()
                response.msg = message
                response.status = -1
                return@coroutineScope response
            }
        }
    }


    private fun <T> runOnIo(
        request: suspend CoroutineScope.() -> BaseResponse<T>,
        success: ((info: BaseResponse<T>) -> Unit),
        error: ((info: BaseResponse<T>) -> Unit)
    ) {
        viewModelScope.launch {
            val response = withContext(Dispatchers.IO) {
                tryCatch(request)
            }
            if (response.status == 0) {
                success.invoke(response)
            } else {
                mException.value = Throwable(response.msg)
                error.invoke(response)
            }
        }
    }

    fun <T> request(
        request: suspend CoroutineScope.() -> BaseResponse<T>,
        success: ((info: BaseResponse<T>) -> Unit)
    ) {
        runOnIo(request, success, {})
    }
}


