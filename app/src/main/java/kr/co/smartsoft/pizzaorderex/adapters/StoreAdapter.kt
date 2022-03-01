package kr.co.smartsoft.pizzaorderex.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.co.smartsoft.pizzaorderex.R
import kr.co.smartsoft.pizzaorderex.datas.StoreData

class StoreAdapter(
    val mContext:Context,
    resId: Int,
    val mList:ArrayList<StoreData>
) : ArrayAdapter<StoreData>(mContext, resId, mList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.store_list_item, null)
        }

        val row = tempRow!!

        return row
    }
}