package com.example.smartfinance.presentation.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ListViewModel : ViewModel() {
    private val _items = MutableStateFlow((1..50).map { "Item $it" })
    val items: StateFlow<List<String>> = _items
}