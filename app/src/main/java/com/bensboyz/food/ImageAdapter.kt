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
        Pair(R.drawable.lemongarlic, "Lemon Garlic"),
        Pair(R.drawable.southernseasoning, "Southern Seasoning"),
        Pair(R.drawable.sweetheat, "Sweet Heat"),
        Pair(R.drawable.redsauce, "Uncle Will's Red Sauce"),
        Pair(R.drawable.tangysauce, "Isaiah's Island Tangy Sauce'"),
        Pair(R.drawable.bangsauce, "Bens Bang Sauce"),
        Pair(R.drawable.pineapplelemonade, "Mama Ella's Pineapple Lemonade"),
        Pair(R.drawable.strawberrylemonade, "Mama Ella's Strawberry Lemonade"),
        Pair(R.drawable.peachlemonade, "Mama Ella's Peach Lemonade")
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
        imageView.scaleType = ImageView.ScaleType.FIT_CENTER
        imageView.layoutParams = AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 700)

        return imageView
    }
}
