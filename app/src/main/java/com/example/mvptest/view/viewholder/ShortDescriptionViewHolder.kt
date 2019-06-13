package com.example.mvptest.view.viewholder

import android.text.TextUtils
import android.view.View
import android.widget.TextView
import com.example.mvptest.R
import com.example.mvptest.model.BaseModel
import com.example.mvptest.model.Item

class ShortDescriptionViewHolder(itemView: View):BaseViewHolder(itemView) {

    //get view from component
    val title: TextView = itemView.findViewById(R.id.tv_title_text)
    val subTitle: TextView = itemView.findViewById(R.id.tv_sub_title_text)

    override fun bind(itemBase: Any) {
        if (itemBase is Item) {
            var item: Item = itemBase as Item
            if (!TextUtils.isEmpty(item?.title)) {
                title.setText(item?.title)
                title.visibility = View.VISIBLE
            } else {
                title.visibility = View.GONE
            }

            if (!TextUtils.isEmpty(item?.subTitle)) {
                subTitle.setText(item?.subTitle)
                subTitle.visibility = View.VISIBLE
            } else {
                subTitle.visibility = View.GONE
            }
        }
    }

}