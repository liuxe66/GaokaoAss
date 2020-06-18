package com.liuxe.gaokaoass.ui.zntb.major

import androidx.lifecycle.MutableLiveData
import com.liuxe.gaokaoass.base.BaseCodeViewModel
import com.liuxe.gaokaoass.bean.ZntbMajorCollegeBean
import com.liuxe.gaokaoass.http.RetrofitClient
import com.liuxe.gaokaoass.utils.Preference

class ZntbMajorCollegeViewModel:BaseCodeViewModel() {

    var subject: String by Preference(Preference.SUBJECT, "")
    var location: String by Preference(Preference.LOCATION, "")
    var score: Int by Preference(Preference.SCORE, 0)

    var majorCollegeBean:MutableLiveData<ZntbMajorCollegeBean> = MutableLiveData()

    var majorCollegeResponse:MutableLiveData<List<ZntbMajorCollegeBean.CollegesBean>> = MutableLiveData()

    fun getZntbMajorCollege(
        major:String,batch:String,
        city: String = "",
        type: String = "",
        tags: String = "",
        ranks: String = ""
    ) {
        request({
            RetrofitClient.service.getZntbMajorCollege(
                location,
                subject,
                score,
                major,
                batch,
                city,
                type,
                tags,
                ranks
            )
        }) {
            majorCollegeBean.value = it.data
            majorCollegeResponse.value = it.data.colleges
        }
    }
}