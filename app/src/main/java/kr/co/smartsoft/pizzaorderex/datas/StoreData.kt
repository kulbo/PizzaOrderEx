package kr.co.smartsoft.pizzaorderex.datas

import java.io.Serializable

class StoreData(
    val name:String,
    val rating:Double,
    val phoneNum:String,    // 010 0이 없어짐
    val logoImageURL:String,
) : Serializable {
}