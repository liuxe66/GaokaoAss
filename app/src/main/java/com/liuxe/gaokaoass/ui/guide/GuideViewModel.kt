package com.liuxe.gaokaoass.ui.guide

import androidx.lifecycle.MutableLiveData
import com.liuxe.gaokaoass.base.BaseStatusViewModel
import com.liuxe.gaokaoass.bean.GuideBean
import com.liuxe.gaokaoass.bean.GuidePolicyBean
import com.liuxe.gaokaoass.http.RetrofitClient
import com.liuxe.gaokaoass.utils.Preference

class GuideViewModel : BaseStatusViewModel() {

    //政策
    var guidePolicyList: ArrayList<List<GuidePolicyBean.SectionBean>> = ArrayList()
    var guidePolicyResponse: MutableLiveData<ArrayList<List<GuidePolicyBean.SectionBean>>> =
        MutableLiveData()

    //faq
    var guideFaqResponse :MutableLiveData<List<GuideBean>> = MutableLiveData()

    //名词
    var guideGlossaryResponse:MutableLiveData<List<GuideBean>> = MutableLiveData()

    var location:String by Preference(Preference.LOCATION,"")

    fun getGuidePolicy() {
        request({
            RetrofitClient.service.getGuidePolicy(location)
        }) {
            guidePolicyList.add(it.data.section1)
            guidePolicyList.add(it.data.section2)
            guidePolicyList.add(it.data.section3)
            guidePolicyList.add(it.data.section4)
            guidePolicyList.add(it.data.section5)
            guidePolicyResponse.value = guidePolicyList
        }
    }

    fun getGuideFaq() {
        request({
            RetrofitClient.service.getGuideFaq()
        }) {
            guideFaqResponse.value = it.data
        }
    }

    fun getGuideGlossary() {
        request({
            RetrofitClient.service.getGuideGlossary()
        }) {
            guideGlossaryResponse.value = it.data
        }
    }
}