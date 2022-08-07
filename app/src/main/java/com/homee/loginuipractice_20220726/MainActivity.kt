package com.homee.loginuipractice_20220726

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailTxt.text = "아이디 아니다"

        //기초 이벤트 처리(setOnClickListener > 클릭 이벤트 처리)

        signUpBtn.setOnClickListener {
            //버튼이 눌릴때마다 실행시켜줄 코드를 이 중괄호 안에 작성
            Toast.makeText(this, "회원가입 버튼 클릭", Toast.LENGTH_SHORT).show()
        }

        loginBtn.setOnClickListener {
            Log.d("로그인 버튼","클릭")
        }
    }
}