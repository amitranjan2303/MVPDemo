package com.example.mvptest.view.viewholder

import android.support.constraint.ConstraintLayout
import android.text.TextUtils
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.mvptest.R
import com.example.mvptest.model.Item
import com.squareup.picasso.Picasso

class BannerViewHolder(itemView: View) : BaseViewHolder(itemView) {

    //get view from component
    //val title: TextView = itemView.findViewById(R.id.tv_title)
    val container: ConstraintLayout = itemView.findViewById(R.id.cl_container)
    val imageView: ImageView = itemView.findViewById(R.id.iv_banner)

    override fun bind(itemBase: Any) {
        if (itemBase is Item) {
            var item: Item = itemBase as Item
            if (!TextUtils.isEmpty(item?.iconUrl)) {
                imageView?.visibility = View.VISIBLE
                container?.visibility = View.VISIBLE
                Picasso.get().load(item.iconUrl).into(imageView);
            } else {
                imageView?.visibility = View.GONE
                container?.visibility = View.GONE
            }
        }
    }
}