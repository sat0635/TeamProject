package com.example.sat06.teamproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {//첫화면에서 번호를 받아서 로그인을 하는 형식임. 카카오톡처럼 처음에 등록해놓고 나중에 필요없다면 바꿔야 함.
        Intent intent = new Intent(MainActivity.this, SignUp.class );
        startActivity(intent);
    }
}
