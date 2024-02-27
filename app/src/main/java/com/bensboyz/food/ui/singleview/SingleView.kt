package com.bensboyz.food.ui.singleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bensboyz.food.ImageAdapter
import com.bensboyz.food.R
import com.bensboyz.food.databinding.FragmentSingleViewBinding

class SingleView : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_single_view, container, false)
        val position = arguments?.getInt("id")

        val imageAdapter = ImageAdapter(requireContext())
        val imageView: ImageView = root.findViewById(R.id.SingleView)
        position?.let {
            imageView.setImageResource(imageAdapter.mThumbIdsandText.getOrNull(it)?.first ?: 0)
        }

        val txtView: TextView = root.findViewById(R.id.txtView)
        position?.let {
            txtView.text = imageAdapter.mThumbIdsandText.getOrNull(it)?.second
        }

        return root
    }
}
