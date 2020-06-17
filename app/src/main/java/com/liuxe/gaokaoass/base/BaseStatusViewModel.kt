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
open class BaseStatusViewModel : BaseViewModel(), LifecycleObserver {


    /**
     * 用来包裹协程的错误信息
     */
    private suspend fun <T> tryCatch(tryBlock: suspend CoroutineScope.() -> BaseStatusResponse<T>): BaseStatusResponse<T> {
        return coroutineScope {
            try {
                return@coroutineScope tryBlock()
            } catch (e: Throwable) {
                e.printStackTrace()
                val message = ExceptionHandle.handleException(e)?.message
                val response = BaseStatusResponse<T>()
                response.msg = message
                response.status = -1
                return@coroutineScope response
            }
        }
    }


    private fun <T> runOnIo(
        request: suspend CoroutineScope.() -> BaseStatusResponse<T>,
        success: ((info: BaseStatusResponse<T>) -> Unit),
        error: ((info: BaseStatusResponse<T>) -> Unit)
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
        request: suspend CoroutineScope.() -> BaseStatusResponse<T>,
        success: ((info: BaseStatusResponse<T>) -> Unit)
    ) {
        runOnIo(request, success, {})
    }
}


