package com.example.authenticationsystem.data

import kotlinx.coroutines.flow.Flow
import com.example.authenticationsystem.util.Resource
import com.google.firebase.AuthResult

interface AuthRepository {
    fun loginUser(email:String, password:String): Flow<Resource>
}