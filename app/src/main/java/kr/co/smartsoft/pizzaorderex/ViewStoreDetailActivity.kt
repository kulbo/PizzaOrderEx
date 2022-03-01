package kr.co.smartsoft.pizzaorderex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_view_store_detail.*
import kotlinx.android.synthetic.main.store_list_item.*
import kotlinx.android.synthetic.main.store_list_item.imgLogo
import kotlinx.android.synthetic.main.store_list_item.txtStoreName
import kr.co.smartsoft.pizzaorderex.datas.StoreData

class ViewStoreDetailActivity : AppCompatActivity() {

    lateinit var mStoreData : StoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        mStoreData = intent.getSerializableExtra("store") as StoreData
        setupEvents()
        setValues()
    }

    fun setupEvents() {

    }

    fun setValues() {
        Glide.with(this).load(mStoreData.logoImageURL).into(imgLogo)

        txtStoreName.text = mStoreData.name
        txtPhoneNum.text = mStoreData.phoneNum

        detailRatingBar.rating = mStoreData.rating.toFloat()
        txtRating.text = "(${mStoreData.rating})"
    }
}