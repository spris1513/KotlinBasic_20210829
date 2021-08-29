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

//       한 사용자의 나이를 17살이라고 저장.
        val userAge = 8

//       이사람이 성인인가? 나이가 20살 이상인가?
        if(userAge >= 20) {
//            if ( ) 내부의 질문 결과가 true일때만 실행됨.
            Log.d("if문 예시", "성인이 맞습니다.")
        }

        else if ( userAge >= 17){
//            20살 미만 + 17살 이상인 경우.
            Log.d("if문 예시","고등학생입니다.")
        }
        else if( userAge  >= 14 ){
            Log.d("if문 예시","중학생입니다.")
        }
        else {
            Log.d("if문 예시","초등학생 or 미취학아동입니다.")
        }





//        본인의 이름을 변수(myName)에 담고, 로그로 출력
        var myName = "이진호"  // 자료형은 String로 자동으로 세팅됨.
        myName = "김다은"
        Log.d("이름출력-변수활용", myName)


//        자기소개 버튼이 눌리면 → "저는 ??? 입니다." 토스트로 출력.
        IntBtn.setOnClickListener {

            Toast.makeText(this, "저는 이진호 입니다.", Toast.LENGTH_SHORT).show()

        }

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