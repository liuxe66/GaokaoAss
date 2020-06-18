package com.liuxe.gaokaoass.ui.guide.fragment

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMFragment
import com.liuxe.gaokaoass.bean.GuideBean
import com.liuxe.gaokaoass.ui.guide.GuideViewModel
import com.liuxe.gaokaoass.ui.guide.adapter.GuideFAQAdapter
import com.liuxe.gaokaoass.ui.guide.adapter.GuidePolicyAdapter
import kotlinx.android.synthetic.main.fragment_guide.*

/**
 * FAQ
 */
class GuideFaqFragment:BaseVMFragment() {
    override fun getLayoutId()= R.layout.fragment_guide

    lateinit var viewModel: GuideViewModel
    override fun init(savedInstanceState: Bundle?) {
        viewModel = createViewModel()
        viewModel.getGuideFaq()
        viewModel.guideFaqResponse.observe(this, Observer {
            recycler_guide.layoutManager = LinearLayoutManager(requireActivity())
            recycler_guide.adapter = GuideFAQAdapter(it as MutableList<GuideBean>)
        })
    }
}