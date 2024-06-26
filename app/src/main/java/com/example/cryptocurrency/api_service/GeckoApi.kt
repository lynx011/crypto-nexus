package com.example.cryptocurrency.api_service
import com.example.cryptocurrency.model.model6.NftsModel
import com.example.cryptocurrency.utils.ApiResponse
import retrofit2.Response
import retrofit2.http.GET

interface GeckoApi {

    @GET("nfts/list")
    suspend fun getNft() : Response<NftsModel>

}