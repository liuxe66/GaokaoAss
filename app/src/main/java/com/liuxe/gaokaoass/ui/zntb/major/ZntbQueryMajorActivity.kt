package com.liuxe.gaokaoass.ui.zntb.major

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseVMActivity
import com.liuxe.gaokaoass.bean.QueryMajorBean
import kotlinx.android.synthetic.main.activity_zntb_query_major.*

class ZntbQueryMajorActivity : BaseVMActivity() {

    override fun getLayout() = R.layout.activity_zntb_query_major
    lateinit var viewModel: ZntbQueryViewModel
    var adapter:ZntbQueryMajorAdapter? = null
    override fun init(savedInstanceState: Bundle?) {
        viewModel = createViewModel()

        tv_cancle.setOnClickListener {
            finish()
        }

        et_major.addTextChangedListener(object :TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                viewModel.queryMajor(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

        })

        viewModel.majorListReaponse.observe(this, Observer {
            recycler_major.layoutManager = LinearLayoutManager(this)
            adapter = ZntbQueryMajorAdapter(it as MutableList<QueryMajorBean.MajorListBean>)
            recycler_major.adapter = adapter

            adapter?.setOnItemClickListener { adapter, view, position ->
                val intent = Intent(this,ZntbMajorCollegeActivity::class.java)
                intent.putExtra("major",it[position].name)
                intent.putExtra("batch",it[position].batch)
                startActivity(intent)
            }
        })


    }
}