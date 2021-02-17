package com.example.kotlin.network

import com.example.kotlin.getapi.model.DataModel
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Manoj  Yadav on 16-02-2021.
 */
interface ApiInterface {

    @GET("photos")
    fun getPhotos(): Call<List<DataModel>>
}