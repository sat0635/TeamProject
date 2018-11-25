package com.example.sat06.teamproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class SignUp extends AppCompatActivity {
    private RadioButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btn = (RadioButton)findViewById(R.id.radioParent);
    }

    public void onClick(View view) {

        Intent intent;

        if(btn.isChecked()){ // 라디오버튼에서 보호자로 체크되어있다면 보호자 페이지로
            intent = new Intent(SignUp.this, parentMain.class);
            startActivity(intent);
        }
        else{
            intent = new Intent(SignUp.this, childMain.class);
            startActivity(intent);
        }
    }
}
