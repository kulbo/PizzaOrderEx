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

        mainTabLayout.setupWithViewPager(mainViewPager)
    }
}