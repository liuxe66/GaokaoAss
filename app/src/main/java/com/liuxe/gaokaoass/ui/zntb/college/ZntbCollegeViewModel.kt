package com.liuxe.gaokaoass.ui.zntb.college

import androidx.lifecycle.MutableLiveData
import com.liuxe.gaokaoass.base.BaseCodeViewModel
import com.liuxe.gaokaoass.bean.ZntbCollegesBean
import com.liuxe.gaokaoass.http.RetrofitClient

class ZntbCollegeViewModel : BaseCodeViewModel() {
    var zntbCollegesResponse = MutableLiveData<List<ZntbCollegesBean.CollegesBean>>()
    var zntbResponse:MutableLiveData<ZntbCollegesBean> = MutableLiveData()
    var colleges :ArrayList<ZntbCollegesBean.CollegesBean> = ArrayList()
    var page:Int = 1
    fun getZntbCollege(
        location: String, aos: String, score: Int,  tab: Int,
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
                1,
                tab,
                city,
                type,
                tags,
                ranks
            )
        }) {
            zntbResponse.value = it.data
            colleges.clear()
            colleges.addAll(it.data.colleges)
            zntbCollegesResponse.value = colleges
            if (it.data.colleges.isNotEmpty()){
                page = 2
            }
        }
    }

    fun getZntbNextCollege(
        location: String, aos: String, score: Int,  tab: Int,
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
                page,
                tab,
                city,
                type,
                tags,
                ranks
            )
        }) {
            colleges.addAll(it.data.colleges)
            zntbCollegesResponse.value = colleges
            if (it.data.colleges.isNotEmpty()){
                page++
            }
        }
    }
}