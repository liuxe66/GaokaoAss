package com.liuxe.gaokaoass.http

import com.liuxe.gaokaoass.base.BaseCodeResponse
import com.liuxe.gaokaoass.base.BaseStatusResponse
import com.liuxe.gaokaoass.bean.*
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

    //填报指南 政策解读
    //https://quark.sm.cn/api/rest?format=json&method=QuarkGaoKao.getGuidePolicy&location=%E5%B1%B1%E8%A5%BF
    @GET("rest?format=json&method=QuarkGaoKao.getGuidePolicy")
    suspend fun getGuidePolicy(
        @Query("location") location:String
    ):BaseStatusResponse<GuidePolicyBean>

    //填报指南 FAQ
    //https://quark.sm.cn/api/rest?format=json&method=QuarkGaoKao2020.getGuideFaq
    @GET("rest?format=json&method=QuarkGaoKao2020.getGuideFaq")
    suspend fun getGuideFaq(
    ):BaseStatusResponse<List<GuideBean>>

    //填报指南
    //https://quark.sm.cn/api/rest?format=json&method=QuarkGaoKao.getGuideGlossary
    @GET("rest?format=json&method=QuarkGaoKao.getGuideGlossary")
    suspend fun getGuideGlossary(
    ):BaseStatusResponse<List<GuideBean>>

    //查找专业
    //https://quark.sm.cn/api/rest?format=json&method=QuarkGaoKao2020.majorSearch&query=%E5%9C%9F%E6%9C%A8
    @GET("rest?format=json&method=QuarkGaoKao2020.majorSearch")
    suspend fun queryMajor(
        @Query("query") query:String
    ):BaseCodeResponse<QueryMajorBean>

    //专业优先 智能选校
    //https://quark.sm.cn/api/rest?format=json&method=QuarkGaoKao2020.majorCollegeRec&location=%E6%B2%B3%E5%8D%97&aos=%E7%90%86%E7%A7%91&score=582&major=%E5%9C%9F%E6%9C%A8%E5%B7%A5%E7%A8%8B&batch=%E6%9C%AC%E7%A7%91&year=2020&city=&type=&tags=&ranks=
    @GET("rest?format=json&method=QuarkGaoKao2020.majorCollegeRec")
    suspend fun getZntbMajorCollege(
        @Query("location") location: String,
        @Query("aos") aos: String,
        @Query("score") score: Int,
        @Query("major") major: String,
        @Query("batch") batch: String,
        @Query("city") city: String = "",
        @Query("type") type: String = "",
        @Query("tags") tags: String = "",
        @Query("ranks") ranks: String = "",
        @Query("year") year: String = "2020"
    ): BaseCodeResponse<ZntbMajorCollegeBean>
}