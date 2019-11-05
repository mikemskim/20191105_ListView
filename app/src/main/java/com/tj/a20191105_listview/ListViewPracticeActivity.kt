package com.tj.a20191105_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tj.a20191105_listview.data.PostData

class ListViewPracticeActivity : AppCompatActivity() {

    var postList = ArrayList<PostData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_practice)

        addPosts()
    }

    fun addPosts() {
        postList.add(PostData("1번째 글입니다.", "내용을 1번째 적습니다."))
        postList.add(PostData("2번째 글입니다.", "내용을 2번째 적습니다."))
        postList.add(PostData("3번째 글입니다.", "내용을 3번째 적습니다."))
        postList.add(PostData("4번째 글입니다.", "내용을 4번째 적습니다."))
        postList.add(PostData("5번째 글입니다.", "내용을 5번째 적습니다."))
        postList.add(PostData("6번째 글입니다.", "내용을 6번째 적습니다."))
        postList.add(PostData("7번째 글입니다.", "내용을 7번째 적습니다."))
        postList.add(PostData("8번째 글입니다.", "내용을 8번째 적습니다."))
        postList.add(PostData("9번째 글입니다.", "내용을 9번째 적습니다."))
        postList.add(PostData("10번째 글입니다.", "내용을 10번째 적습니다."))
    }
}
