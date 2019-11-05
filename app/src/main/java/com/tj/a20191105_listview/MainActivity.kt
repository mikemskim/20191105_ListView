package com.tj.a20191105_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tj.a20191105_listview.adapters.RoomDataAdapter
import com.tj.a20191105_listview.data.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var roomList = ArrayList<RoomData>()
    var roomAdapter:RoomDataAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addRooms()

        roomAdapter = RoomDataAdapter(this, R.layout.room_list_item, roomList)

        roomListView.adapter = roomAdapter
    }

    fun addRooms() {
        var room1 = RoomData()
        room1.price = 8000
        room1.address = "마포구 서교동"
        room1.floor = 1

        var room2 = RoomData()
        room2.address = "마포구 서교동"
        room2.floor = 3
        room2.price = 28500

        var room3 = RoomData()
        room3.price = 12000
        room3.address = "마포구 성산동"
        room3.floor = 5

        var room4 = RoomData(12000, "마포구 망원1동", 3)

        roomList.add(room1)
        roomList.add(room2)
        roomList.add(room3)
        roomList.add(room4)

        roomList.add(RoomData(15000, "마포구 망원동", 2))
        roomList.add(RoomData("은평구 불광동"))
    }

    fun addRoom(price:Int, address:String, floor:Int) {
        var room = RoomData()
        room.price = price
        room.address = address
        room.floor = floor
        roomList.add(room)
    }

    fun sum(num1:Int, num2:Int) :Int {
        return num1+num2
    }

    // 코틀린에서는 아래와 같이 표현도 가능
    fun sum2(num1:Int, num2:Int) = num1+num2


}
