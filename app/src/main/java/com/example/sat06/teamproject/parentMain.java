package com.example.sat06.teamproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class parentMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_main);
    }

    public void onClick(View view) {//자녀 위치 찾기 버튼 클릭시 지도가 뜨면됨.
        Intent intent = new Intent(parentMain.this, mapMain.class );
        startActivity(intent);
    }
}
