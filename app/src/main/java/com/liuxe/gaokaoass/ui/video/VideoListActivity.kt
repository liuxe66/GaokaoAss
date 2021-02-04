package com.liuxe.gaokaoass.ui.video

import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import cn.jzvd.Jzvd
import cn.jzvd.JzvdStd
import com.google.gson.Gson
import com.liuxe.gaokaoass.R
import com.liuxe.gaokaoass.base.BaseActivity
import com.liuxe.gaokaoass.bean.VideoBean
import com.liuxe.gaokaoass.utils.JsonUtils
import com.liuxe.gaokaoass.widget.video.MyJzvdStd
import kotlinx.android.synthetic.main.activity_video_list.*

class VideoListActivity : BaseActivity() {

    override fun getLayout() = R.layout.activity_video_list

    override fun init(savedInstanceState: Bundle?) {
        initTitleBar(toolbar,"志愿填报视频解读")
        val videoList = JsonUtils.getJson(this, "video.json")
        val videoBean = Gson().fromJson(videoList, VideoBean::class.java)

        val adapter = VideoListAdapter(videoBean.data)
        recycler_video.layoutManager = LinearLayoutManager(this)
        recycler_video.adapter = adapter

        adapter.setOnItemClickListener { adapter, view, position ->
//            val video = Intent(this,VideoPlayerActivity::class.java)
//            video.putExtra("videoUrl",videoBean.data[position].url)
//            video.putExtra("videoTitle",videoBean.data[position].title)
//            startActivity(video)

            MyJzvdStd.startFullscreenDirectly(
                this,
                MyJzvdStd::class.java,
                videoBean.data[position].url,
                videoBean.data[position].title
            )
        }
    }

    override fun onBackPressedSupport() {
        if (Jzvd.backPress()) {
            return
        }
        super.onBackPressedSupport()
    }

    override fun onPause() {
        super.onPause()
        Jzvd.releaseAllVideos()
    }
}