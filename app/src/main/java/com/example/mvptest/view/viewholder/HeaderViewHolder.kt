package com.example.mvptest.view.viewholder

import android.support.constraint.ConstraintLayout
import android.text.TextUtils
import android.view.View
import android.widget.TextView
import com.example.mvptest.R
import com.example.mvptest.model.BaseModel
import com.example.mvptest.model.Item

class HeaderViewHolder(itemView: View) : BaseViewHolder(itemView) {

    //get view from component
    val title: TextView = itemView.findViewById(R.id.tv_title)
    val container: ConstraintLayout = itemView.findViewById(R.id.cl_container)

    override fun bind(itemBase: Any) {
        if (itemBase is Item) {
            var item: Item = itemBase as Item
            if (!TextUtils.isEmpty(item?.title)) {
                title.setText(item?.title)
                title.visibility = View.VISIBLE
                container.visibility = View.VISIBLE
            } else {
                title.visibility = View.GONE
                container.visibility = View.GONE
            }
        }
    }
}