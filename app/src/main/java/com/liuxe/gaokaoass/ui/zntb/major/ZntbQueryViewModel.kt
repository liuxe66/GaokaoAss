package com.liuxe.gaokaoass.ui.zntb.major

import androidx.lifecycle.MutableLiveData
import com.liuxe.gaokaoass.base.BaseCodeViewModel
import com.liuxe.gaokaoass.bean.QueryMajorBean
import com.liuxe.gaokaoass.http.RetrofitClient

class ZntbQueryViewModel:BaseCodeViewModel() {

    var majorListReaponse:MutableLiveData<List<QueryMajorBean.MajorListBean>> = MutableLiveData()

    fun queryMajor(query:String){
        request({
            RetrofitClient.service.queryMajor(query)
        }){
            if (it.data.status_code == 200){
                majorListReaponse.value = it.data.major_list
            } else {
                majorListReaponse.value = ArrayList()
            }
        }
    }
}