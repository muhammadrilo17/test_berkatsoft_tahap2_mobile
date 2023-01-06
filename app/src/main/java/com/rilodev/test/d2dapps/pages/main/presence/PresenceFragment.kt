package com.rilodev.test.d2dapps.pages.main.presence

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rilodev.test.d2dapps.core.ui.baseview.BaseViewFragment
import com.rilodev.test.d2dapps.databinding.FragmentPresenceBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PresenceFragment : BaseViewFragment() {
    private var _binding: FragmentPresenceBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPresenceBinding.inflate(inflater, container, false)
        return binding.root
    }
}