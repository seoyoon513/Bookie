package com.syoon.bookie.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.syoon.bookie.common.Constant.Companion.API_KEY
import com.syoon.bookie.model.BestSellerDto
import com.syoon.bookie.repository.BestSellerRepository
import kotlinx.coroutines.launch

class BestSellerViewModel(
    private val bestSellerRepository: BestSellerRepository): ViewModel() {

    private val _items = MutableLiveData<List<BestSellerDto>>()
    val items: LiveData<List<BestSellerDto>> = _items

    init {
        fetchBestSellerList()
    }

    private fun fetchBestSellerList() {
        viewModelScope.launch {
            val bestSellers = bestSellerRepository.getBestSellerBooks(API_KEY)
            _items.value = bestSellers
        }

    }
}