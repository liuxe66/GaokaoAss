package com.liuxe.gaokaoass.ui.main.banner

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.liuxe.gaokaoass.R
import com.zhpan.bannerview.BannerViewPager
import com.zhpan.bannerview.utils.BannerUtils
import com.zhpan.indicator.enums.IndicatorStyle

class TestActivity : AppCompatActivity() {


    private lateinit var bannerView:BannerViewPager<BannerData,NetViewHolder>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        bannerView.apply {
            adapter = BannerAdapter()
            setAutoPlay(true)
            setIndicatorStyle(IndicatorStyle.ROUND_RECT)
            setIndicatorSliderGap(getResources().getDimensionPixelOffset(R.dimen.dp_4))
            registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    BannerUtils.log("position:$position")
                }
            })
        }.create()

    }
}
