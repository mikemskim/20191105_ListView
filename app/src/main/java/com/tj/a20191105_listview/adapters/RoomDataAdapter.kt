package com.tj.a20191105_listview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.tj.a20191105_listview.R
import com.tj.a20191105_listview.data.RoomData

class RoomDataAdapter (context: Context, resource:Int, list:ArrayList<RoomData>)
    : ArrayAdapter<RoomData>(context, resource, list){

    var mContext:Context? = null
    var mList:ArrayList<RoomData>? = null
    var inf:LayoutInflater? = null

    init {
        mContext = context
        mList = list
        inf = LayoutInflater.from(mContext)
    }

    // 한줄을 그릴때 마다 호출함 Position이 0부터
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var row = convertView
        if (row == null) {
            row = inf?.inflate(R.layout.room_list_item, null)
        }
        return row!!
    }
}