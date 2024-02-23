package com.bensboyz.food.ui.distribution

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bensboyz.food.databinding.FragmentDistributionBinding

class DistributionFragment : Fragment() {

    private var _binding: FragmentDistributionBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val distributionViewModel =
            ViewModelProvider(this).get(DistributionViewModel::class.java)

        _binding = FragmentDistributionBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDistribution
        distributionViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}