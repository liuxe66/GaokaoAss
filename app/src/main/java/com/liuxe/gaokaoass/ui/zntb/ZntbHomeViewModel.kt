package com.liuxe.gaokaoass.ui.zntb

import androidx.lifecycle.MutableLiveData
import com.liuxe.gaokaoass.base.BaseResponse
import com.liuxe.gaokaoass.base.BaseViewModel
import com.liuxe.gaokaoass.bean.ZntbHomeBean
import com.liuxe.gaokaoass.http.RetrofitClient

class ZntbHomeViewModel : BaseViewModel() {
    var zntbHomeResponse = MutableLiveData<BaseResponse<ZntbHomeBean>>()


    fun getWeatherInfo(format: String, method: String, location: String, aos: String, score: String, year: String
    ) {
        request({
            RetrofitClient.service.getZntbHome(format,method,location,aos,score, year)
        }) {
            zntbHomeResponse.value = it
        }
    }
}