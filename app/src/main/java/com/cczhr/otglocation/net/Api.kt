package com.cczhr.otglocation.net

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Streaming
import retrofit2.http.Url


/**
 * @author cczhr
 * @description
 * @since 2021/6/10 10:06
 */
interface Api {
    @GET("repos/iGhibli/iOS-DeviceSupport/contents/DeviceSupport")
    suspend fun getDeviceSupport(): DeviceSupportBean?

    @Streaming
    @GET
     fun get(@Url fileUrl: String): Call<ResponseBody>
}