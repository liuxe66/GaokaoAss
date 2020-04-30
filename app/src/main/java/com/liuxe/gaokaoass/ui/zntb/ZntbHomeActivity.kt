package com.liuxe.gaokaoass.ui.zntb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMActivity
import com.liuxe.gaokaoass.utils.Preference

class ZntbHomeActivity : BaseVMActivity() {
    override fun getLayout() = R.layout.activity_zntb_home

    var mZntbHomeViewModel:ZntbHomeViewModel? = null
    var subject:String by Preference(Preference.SUBJECT,"")
    var location:String by Preference(Preference.LOCATION,"")
    var score:String by Preference(Preference.SCORE,"")

    override fun init(savedInstanceState: Bundle?) {
        mZntbHomeViewModel = createViewModel()
        mZntbHomeViewModel?.getWeatherInfo("json","QuarkGaoKao.getRecColleges",location,subject,score,"2019")
    }

}
