package kr.co.smartsoft.pizzaorderex.adapters

import android.content.Context
import android.widget.ArrayAdapter
import kr.co.smartsoft.pizzaorderex.datas.StoreData

class StoreAdapter(
    val mContext:Context,
    resId: Int,
    val mList:ArrayList<StoreData>
) : ArrayAdapter<StoreData>(mContext, resId, mList) {
}