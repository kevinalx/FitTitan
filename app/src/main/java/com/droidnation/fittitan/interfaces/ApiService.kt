package com.droidnation.fittitan.interfaces

import com.droidnation.fittitan.models.Usuario
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/login")
    fun login(@Query("username") username:String, @Query("password") password:String): Call<List<Usuario>>
}