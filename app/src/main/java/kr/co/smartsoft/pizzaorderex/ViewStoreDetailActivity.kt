package kr.co.smartsoft.pizzaorderex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

    }
}