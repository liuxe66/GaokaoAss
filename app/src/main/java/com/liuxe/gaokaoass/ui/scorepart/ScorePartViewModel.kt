package com.liuxe.gaokaoass.ui.scorepart

import androidx.lifecycle.MutableLiveData
import com.liuxe.gaokaoass.base.BaseStatusViewModel
import com.liuxe.gaokaoass.bean.ScorePartBean
import com.liuxe.gaokaoass.http.RetrofitClient

class ScorePartViewModel:BaseStatusViewModel() {

    var scorePartResponse:MutableLiveData<ScorePartBean> = MutableLiveData()

    fun getScoreRank(aos:String,year: String,location:String){
        request({
            RetrofitClient.service.getScoreRank(aos,year,location)
        }) {
            scorePartResponse.value = it.data
        }
    }

}