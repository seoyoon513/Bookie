package com.syoon.bookie.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.syoon.bookie.R
import com.syoon.bookie.common.ViewModelFactory
import com.syoon.bookie.ui.BestSellerViewModel
import com.syoon.bookie.ui.SearchBookViewModel

class HomeFragment: Fragment() {

    private val viewModel: BestSellerViewModel by viewModels { ViewModelFactory(requireContext()) }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.items.observe(viewLifecycleOwner) {
            Log.d("HomeFragment", "items=$it")
        }
    }
}