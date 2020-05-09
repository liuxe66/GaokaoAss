package com.liuxe.gaokaoass.ui.zntb

import androidx.lifecycle.MutableLiveData
import com.liuxe.gaokaoass.base.BaseResponse
import com.liuxe.gaokaoass.base.BaseViewModel
import com.liuxe.gaokaoass.bean.ZntbCollegesBean
import com.liuxe.gaokaoass.http.RetrofitClient

class ZntbCollegeViewModel : BaseViewModel() {
    var zntbCollegeResponse = MutableLiveData<BaseResponse<ZntbCollegesBean>>()

    fun getZntbCollege(
        location: String, aos: String, score: String, year: String, shock: String,
        city: String = "",
        type: String = "",
        tags: String = "",
        ranks: String = ""
    ) {
        request({
            RetrofitClient.service.getZntbCollege(
                location,
                aos,
                score,
                year,
                shock,
                city,
                type,
                tags,
                ranks
            )
        }) {
            zntbCollegeResponse.value = it
        }
    }
}