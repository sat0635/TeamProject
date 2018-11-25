package com.example.sat06.teamproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class childMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_main);
    }

    public void onClick(View view) {//긴급 요청 버튼 클릭시, 보호자에게 notification이 가고 112에 연락가능하도록 하면됨.
    }
}
