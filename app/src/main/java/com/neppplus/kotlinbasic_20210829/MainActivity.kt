package com.neppplus.kotlinbasic_20210829

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toastBtn.setOnClickListener {
//            토스트 - "반갑습니다." 문장 띄우기

            Toast.makeText(this, "반갑습니다.", Toast.LENGTH_SHORT).show()
        }

        LogBtn.setOnClickListener {

//            중괄호 내부에 코드는, LogBtn 버튼이 클릭 될 때마다 작동

            Log.d("메인화면", "로그 버튼 눌림")

        }

        secondLogBtn.setOnClickListener {
//            두번째 버튼이 눌리면 할일을 따로 지정.
            Log.e("메인화면", "두번째 로그 버튼 눌림")
        }

    }
}