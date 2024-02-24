package com.example.myapplication.Screens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class SignupScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);

//        TextView termsTextView = findViewById(R.id.termsTextView);
//        LinearLayout checkboxLayout = findViewById(R.id.checkboxLayout);
//        TextView hideTextView = findViewById(R.id.hideTextView);
//
//        // Xử lý sự kiện khi người dùng nhấn vào TextView hiển thị điều khoản sử dụng
//        termsTextView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Hiển thị hoặc ẩn layout chứa danh sách các checkbox
//                if (checkboxLayout.getVisibility() == View.VISIBLE) {
//                    checkboxLayout.setVisibility(View.GONE);
//                    hideTextView.setVisibility(View.GONE);
//                } else {
//                    checkboxLayout.setVisibility(View.VISIBLE);
//                    hideTextView.setVisibility(View.VISIBLE);
//                }
//            }
//        });
//
//        // Xử lý sự kiện khi người dùng nhấn vào TextView ẩn danh sách checkbox
//        hideTextView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Ẩn layout chứa danh sách các checkbox và hiển thị lại TextView điều khoản sử dụng
//                checkboxLayout.setVisibility(View.GONE);
//                hideTextView.setVisibility(View.GONE);
//            }
//        });
        //Xử lý button to LoginScreen
        Button buttonToLoginScreen = findViewById(R.id.button_to_loginscreen);

        buttonToLoginScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang màn hình LoginScreen
                Intent intent = new Intent(SignupScreen.this, LoginScreen.class);
                startActivity(intent);
            }
        });


    }
}
