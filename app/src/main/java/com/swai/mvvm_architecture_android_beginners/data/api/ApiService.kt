package com.swai.mvvm_architecture_android_beginners.data.api

import com.swai.mvvm_architecture_android_beginners.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}