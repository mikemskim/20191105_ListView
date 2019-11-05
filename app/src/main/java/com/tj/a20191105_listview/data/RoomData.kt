package com.tj.a20191105_listview.data

import android.util.Log

class RoomData(price:Int, address:String, floor:Int) {

    var price:Int = 0
    var address:String =""
    var floor:Int = 1 // 음수 : 지하, -1층 : 지하1층, 0층 : 반지하

    init {
        // 기본 생성자를 호출할때 하는 행동 : init
        // this : RoomData 객체가 가진
        // 일반변수 : 파라미터로 들어온 변수
        this.price = price
        this.address = address
        this.floor = floor
    }

    constructor() : this(0,"미입력",0) {
        Log.d("ROOMDATA", "보조생성자(빈칸) 호출")
    }

    constructor(address:String) : this(-1,address, -1) {
        Log.d("ROOMDATA", "보조생성자(주소) 호출")
    }
//    constructor(price:Int, address:String, floor:Int) {
//        this.price = price
//        this.address = address
//        this.floor = floor
//    }



}