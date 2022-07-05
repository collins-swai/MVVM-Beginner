package com.swai.mvvm_architecture_android_beginners.data.api

import com.swai.mvvm_architecture_android_beginners.data.model.User
import io.reactivex.Single

class ApiServiceImpl : ApiService {
    override fun getUsers(): Single<List<User>> {
        return AndroidNetworking.get("https://5e510330f2c0d300147c034c.mockapi.io/users")
            .build()
            .getObjectListSingle(User::class.java)
    }
}