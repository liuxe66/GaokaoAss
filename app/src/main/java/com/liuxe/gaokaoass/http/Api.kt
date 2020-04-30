package com.liuxe.gaokaoass.http

import com.liuxe.gaokaoass.base.BaseResponse
import com.liuxe.gaokaoass.bean.ZntbHomeBean
import retrofit2.http.GET
import retrofit2.http.Query


interface Api {
    companion object {
        const val BASE_URL = "https://quark.sm.cn/api/"
    }

    //https://quark.sm.cn/api/rest?format=json&method=QuarkGaoKao.getRecColleges&location=河南
    //&aos=理科&score=521&year=2019
    @GET("rest")
    suspend fun getZntbHome(@Query("format") format:String,
                            @Query("method") method:String,
                            @Query("location") location:String,
                            @Query("aos") aos:String,
                            @Query("score") score:String,
                            @Query("year") year:String) : BaseResponse<ZntbHomeBean>

//    https://quark.sm.cn/api/rest?format=json&method=QuarkGaoKao.getRecColleges&location=陕西
//    &aos=理科&score=521&year=2019&shock=3&city=陕西&type=&tags=211&ranks=本科二批
    @GET("rest")
    suspend fun getZntbCollege(@Query("format")format: String,
                               @Query("method")method: String,
                               @Query("location")location: String,
                               @Query("aos")aos: String,
                               @Query("score")score: String,
                               @Query("shock")shock:String,
                               @Query("city")city:String,
                               @Query("type")type:String,
                               @Query("tags")tags:String,
                               @Query("ranks")ranks:String)

}