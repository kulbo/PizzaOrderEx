package kr.co.smartsoft.pizzaorderex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.smartsoft.pizzaorderex.adapters.MainViewPagerAdapter

class MainActivity : AppCompatActivity() {
    lateinit var mAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setupValues()
    }

    fun setupEvents() {

    }

    fun setupValues() {
        mAdapter = MainViewPagerAdapter(supportFragmentManager)

        mainViewPager.adapter = mAdapter

//        도전과제 - 치킨 가게 목록 추가 시에는 offScreenLimit = 3 설정 해줘야 정상 동작

        mainTabLayout.setupWithViewPager(mainViewPager)
    }
}