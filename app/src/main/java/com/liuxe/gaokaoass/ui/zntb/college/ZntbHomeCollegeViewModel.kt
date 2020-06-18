package com.liuxe.gaokaoass.ui.zntb.college

import androidx.lifecycle.MutableLiveData
import com.liuxe.gaokaoass.base.BaseStatusResponse
import com.liuxe.gaokaoass.base.BaseStatusViewModel
import com.liuxe.gaokaoass.bean.ZntbHomeBean
import com.liuxe.gaokaoass.http.RetrofitClient

class ZntbHomeCollegeViewModel : BaseStatusViewModel() {
    var zntbHomeResponse = MutableLiveData<BaseStatusResponse<ZntbHomeBean>>()


    fun getZntbHome(location: String, aos: String, score: Int) {
        request({
            RetrofitClient.service.getZntbHome(location,aos,score)
        }) {
            zntbHomeResponse.value = it
        }
    }

}