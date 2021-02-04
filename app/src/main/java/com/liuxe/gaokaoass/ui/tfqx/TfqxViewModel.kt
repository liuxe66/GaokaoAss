package com.liuxe.gaokaoass.ui.tfqx

import androidx.lifecycle.MutableLiveData
import com.liuxe.gaokaoass.base.BaseStatusViewModel
import com.liuxe.gaokaoass.bean.ExamineeBean
import com.liuxe.gaokaoass.http.RetrofitClient
import com.liuxe.gaokaoass.utils.Preference

class TfqxViewModel:BaseStatusViewModel() {

    var subject: String by Preference(Preference.SUBJECT, "")
    var location: String by Preference(Preference.LOCATION, "")
    var score: Int by Preference(Preference.SCORE, 0)

    var tfqxData:MutableLiveData<ExamineeBean> = MutableLiveData()

    fun getExamineeGo(){
        request({
            RetrofitClient.service.getExamineeGo(subject,"2020",location,score,subject)
        }){
            tfqxData.value = it.data
        }
    }
}