package com.liuxe.gaokaoass.http

import com.liuxe.gaokaoass.base.BaseCodeResponse
import com.liuxe.gaokaoass.base.BaseStatusResponse
import com.liuxe.gaokaoass.bean.ZntbCollegesBean
import com.liuxe.gaokaoass.bean.ZntbHomeBean
import retrofit2.http.GET
import retrofit2.http.Query


interface Api {
    companion object {
        const val BASE_URL = "https://quark.sm.cn/api/"
    }

    //智能填报志愿列表
    //https://quark.sm.cn/api/rest?format=json&method=QuarkGaoKao2020.getRecColleges
    // &year=2020&location=%E6%B2%B3%E5%8D%97&aos=%E7%90%86%E7%A7%91&score=582
    @GET("rest?format=json&method=QuarkGaoKao2020.getRecColleges")
    suspend fun getZntbHome(
        @Query("location") location: String,
        @Query("aos") aos: String,
        @Query("score") score: Int,
        @Query("year") year: String = "2020"
    ): BaseStatusResponse<ZntbHomeBean>

    //智能填报志愿筛选院校列表
    //https://quark.sm.cn/api/rest?format=json&method=QuarkGaoKao2020.collegeRecDetail
    // &location=%E6%B2%B3%E5%8D%97&aos=%E7%90%86%E7%A7%91&score=582&tab=1&page=1&year=2020&city=&type=&tags=&ranks=
    @GET("rest?format=json&method=QuarkGaoKao2020.collegeRecDetail")
    suspend fun getZntbCollege(
        @Query("location") location: String,
        @Query("aos") aos: String,
        @Query("score") score: Int,
        @Query("page") page: Int,
        @Query("tab") tab: Int,
        @Query("city") city: String = "",
        @Query("type") type: String = "",
        @Query("tags") tags: String = "",
        @Query("ranks") ranks: String = "",
        @Query("year") year: String = "2020"
    ): BaseCodeResponse<ZntbCollegesBean>

}