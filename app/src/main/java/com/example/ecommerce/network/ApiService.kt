package com.example.ecommerce.network



import com.example.ecommerce.models.AuthResponse
import com.example.ecommerce.models.LoginRequest
import com.example.ecommerce.models.RegisterResponse
import com.example.ecommerce.models.User
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST


interface ApiService {


    @POST("api/auth/login")
    suspend fun login(@Body loginRequest: LoginRequest): Response<AuthResponse>


    @POST("api/auth/register")
    suspend fun register(@Body user: User): Response<RegisterResponse>
}
