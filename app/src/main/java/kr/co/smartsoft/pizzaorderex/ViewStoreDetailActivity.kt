package kr.co.smartsoft.pizzaorderex

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.normal.TedPermission
import kotlinx.android.synthetic.main.activity_view_store_detail.*
import kotlinx.android.synthetic.main.store_list_item.*
import kotlinx.android.synthetic.main.store_list_item.imgLogo
import kotlinx.android.synthetic.main.store_list_item.txtStoreName
import kr.co.smartsoft.pizzaorderex.datas.StoreData
import java.security.Permission
import java.util.jar.Manifest

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

//        권한 관련 변수를 화면이 만들어질때 한번만 세팅.
        val pl = object : PermissionListener {
            override fun onPermissionGranted() {
                val myUri = Uri.parse("tel:${mStoreData.phoneNum}")
                val myIntent = Intent(Intent.ACTION_CALL, myUri)
                startActivity(myIntent)
            }

            override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                Toast.makeText(this@ViewStoreDetailActivity, "통화 권한이 없습니다.", Toast.LENGTH_SHORT).show()
            }

        }

        btnCall.setOnClickListener {
//          클릭될 때마다 만든 변수를 사용 만 하는 걸로.
            TedPermission.create()
                .setPermissionListener(pl)
                .setPermissions(android.Manifest.permission.CALL_PHONE)
                .check()
        }
    }

    fun setValues() {
        Glide.with(this).load(mStoreData.logoImageURL).into(imgLogo)

        txtStoreName.text = mStoreData.name
        txtPhoneNum.text = mStoreData.phoneNum

        detailRatingBar.rating = mStoreData.rating.toFloat()
        txtRating.text = "(${mStoreData.rating})"
    }
}