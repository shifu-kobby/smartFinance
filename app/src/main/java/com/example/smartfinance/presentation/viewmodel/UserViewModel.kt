package com.example.smartfinance.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.smartfinance.domain.model.User
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class UserViewModel: ViewModel() {
    // StateFlow to hold UI state
    private val _user = MutableStateFlow(User(name = "John", age = 25))
    // Why StateFlow? → It is lifecycle-aware and better suited for Jetpack Compose than LiveData
    val user: StateFlow<User> = _user

    // Function to update user state
    fun updateUser(name: String, age: Int) {
        _user.value = User(name, age)
    }
}