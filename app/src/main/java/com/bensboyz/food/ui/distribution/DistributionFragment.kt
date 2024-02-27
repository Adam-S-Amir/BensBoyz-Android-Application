package com.bensboyz.food.ui.distribution

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.GridView
import androidx.fragment.app.Fragment
import com.bensboyz.food.ImageAdapter
import com.bensboyz.food.R
import com.bensboyz.food.SingleView
import com.bensboyz.food.databinding.FragmentDistributionBinding

class DistributionFragment : Fragment() {
    private var _binding: FragmentDistributionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDistributionBinding.inflate(inflater, container, false)
        val root = binding.root

        val gridView: GridView = root.findViewById(R.id.gridView)
        gridView.adapter = ImageAdapter(requireContext())

        gridView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            // Send intent to SingleViewActivity
            val i = Intent(requireContext(), SingleView::class.java)
            // Pass image index
            i.putExtra("id", position)
            startActivity(i)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
