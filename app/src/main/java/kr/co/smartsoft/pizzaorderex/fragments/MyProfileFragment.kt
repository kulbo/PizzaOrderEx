package kr.co.smartsoft.pizzaorderex.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_my_profile.*
import kr.co.smartsoft.pizzaorderex.EditNicknameActivity
import kr.co.smartsoft.pizzaorderex.R

class MyProfileFragment : Fragment() {
    val REQ_CODE_NICKNAME = 2000

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setEvents()
        setValues()
    }

    fun setEvents() {
        btnEditNickname.setOnClickListener {
            val myIntent = Intent(requireContext(), EditNicknameActivity::class.java)

            startActivityForResult(myIntent, REQ_CODE_NICKNAME)


        }
    }

    fun setValues() {

    }
}