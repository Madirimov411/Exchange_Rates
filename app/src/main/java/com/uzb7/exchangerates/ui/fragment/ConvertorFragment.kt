package com.uzb7.exchangerates.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.uzb7.exchangerates.R
import com.uzb7.exchangerates.databinding.FragmentConvertorBinding
import com.uzb7.moviedb.utils.viewBinding

class ConvertorFragment : Fragment(R.layout.fragment_convertor) {
    private val binding by viewBinding { FragmentConvertorBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        binding.apply {

        }
    }

}