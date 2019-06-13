package com.example.mvptest.view.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mvptest.R
import com.example.mvptest.model.Item
import com.example.mvptest.util.ViewTypes
import com.example.mvptest.view.viewholder.*

class ItemDataAdapter(var itemList: ArrayList<Any>) : RecyclerView.Adapter<BaseViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): BaseViewHolder {
        lateinit var baseViewHolder: BaseViewHolder
        var viewItem: View = LayoutInflater.from(viewGroup?.context).inflate(viewType, viewGroup, false)
        if (viewType == R.layout.item_big_view_with_bottom_message) {
            baseViewHolder = BigViewBottomMessageViewHolder(viewItem)
        } else if (viewType == R.layout.item_header_view) {
            baseViewHolder = HeaderViewHolder(viewItem)
        } else if (viewType == R.layout.item_header_icon_with_text_view) {
            baseViewHolder = HeaderIconWithTextViewHolder(viewItem)
        } else if (viewType == R.layout.item_text_with_title_view) {
            baseViewHolder = ShortDescriptionViewHolder(viewItem)
        } else if (viewType == R.layout.item_text_with_left_icon_small_view) {
            baseViewHolder = SmallViewLeftIconViewHolder(viewItem)
        } else if (viewType == R.layout.item_text_with_right_icon_small_view) {
            baseViewHolder = SmallViewRightIconViewHolder(viewItem)
        }else if (viewType == R.layout.item_banner_view) {
            baseViewHolder = BannerViewHolder(viewItem)
        }
        return baseViewHolder
    }

    override fun getItemCount(): Int {
        return itemList?.size
    }

    override fun onBindViewHolder(viewHolder: BaseViewHolder, position: Int) {

        if (viewHolder is BigViewBottomMessageViewHolder) {
            (viewHolder as BigViewBottomMessageViewHolder).bind(itemList?.get(position))
        } else if (viewHolder is HeaderIconWithTextViewHolder) {
            (viewHolder as HeaderIconWithTextViewHolder).bind(itemList?.get(position))
        } else if (viewHolder is HeaderViewHolder) {
            (viewHolder as HeaderViewHolder).bind(itemList?.get(position))
        } else if (viewHolder is ShortDescriptionViewHolder) {
            (viewHolder as ShortDescriptionViewHolder).bind(itemList?.get(position))
        } else if (viewHolder is SmallViewLeftIconViewHolder) {
            (viewHolder as SmallViewLeftIconViewHolder).bind(itemList?.get(position))
        } else if (viewHolder is SmallViewRightIconViewHolder) {
            (viewHolder as SmallViewRightIconViewHolder).bind(itemList?.get(position))
        } else if (viewHolder is BannerViewHolder) {
            (viewHolder as BannerViewHolder).bind(itemList?.get(position))
        }
    }

    override fun getItemViewType(position: Int): Int {

        return getViewType(itemList?.get(position))
    }

    private fun getViewType(itemBase: Any): Int {
        var viewTypes: Int = -1
        if (itemBase is Item) {
            val item: Item = itemBase as Item
            if (item.type.equals(ViewTypes.BIG_VIEW_OVERLAP_WITH_BOTTOM_MESSAGE, true)) {
                viewTypes = R.layout.item_big_view_with_bottom_message
            } else if (item.type.equals(ViewTypes.HEADER, true)) {
                viewTypes = R.layout.item_header_view
            } else if (item.type.equals(ViewTypes.HEADER_ICON_WITH_TEXT, true)) {
                viewTypes = R.layout.item_header_icon_with_text_view
            } else if (item.type.equals(ViewTypes.SHORT_VIEW_TEXT_WITH_TITLE, true)) {
                viewTypes = R.layout.item_text_with_title_view
            } else if (item.type.equals(ViewTypes.SHORT_VIEW_WITH_LEFT_ICON, true)) {
                viewTypes = R.layout.item_text_with_left_icon_small_view
            } else if (item.type.equals(ViewTypes.SHORT_VIEW_WITH_RIGHT_ICON, true)) {
                viewTypes = R.layout.item_text_with_right_icon_small_view
            } else if (item.type.equals(ViewTypes.BANNER_VIEW, true)) {
                viewTypes = R.layout.item_banner_view
            }
        }

        return viewTypes
    }

    fun updateList(list: ArrayList<Any>) {
        itemList.clear()
        itemList = list
        notifyItemRangeInserted(0, list?.size)
    }
}