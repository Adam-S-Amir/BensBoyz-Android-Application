package com.bensboyz.food

import android.content.Context
import android.util.Pair
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.BaseAdapter
import android.widget.ImageView

class ImageAdapter(private val context: Context) : BaseAdapter() {

    val mThumbIdsandText: ArrayList<Pair<Int, String>> = arrayListOf(
        Pair(R.drawable.lemongarlic, "GET OUT OF MY SWAMP!"),
        Pair(R.drawable.southernseasoning, "WHAT ARE YOU DOING IN MY HOUSE?"),
        Pair(R.drawable.sweetheat, "There Were Strong Gases Seepin' Outta My Butt That Day!")
    )

    override fun getCount(): Int {
        return mThumbIdsandText.size
    }

    override fun getItem(position: Int): Any {
        return mThumbIdsandText[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val imageView: ImageView = if (convertView == null) {
            ImageView(context)
        } else {
            convertView as ImageView
        }

        imageView.setImageResource(mThumbIdsandText[position].first)
        imageView.scaleType = ImageView.ScaleType.CENTER_CROP
        imageView.layoutParams = AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 300)

        return imageView
    }
}
