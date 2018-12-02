package com.example.sat06.teamproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class childMain extends AppCompatActivity {

    private Socket socket;  //소켓생성
    BufferedReader in;      //서버로부터 온 데이터를 읽는다.
    PrintWriter out;        //서버에 데이터를 전송한다.
    EditText input;         //화면구성
    Button button;          //화면구성
    TextView output;        //화면구성
    String data;            //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_main);

        input = (EditText)findViewById(R.id.edittext1);
        button = (Button)findViewById(R.id.button3);
    }

    public void onClick3(View view){
        String data = input.getText().toString();

    }

    public void onClick(View view) {//긴급 요청 버튼 클릭시, 보호자에게 notification이 가고 112에 연락가능하도록 하면됨.
        int id;
        id = view.getId();
        Intent intent;
        intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:112"));
        startActivity(intent);
    }

    public void onClick2(View view) {//긴급 요청 버튼 클릭시, 보호자에게 notification이 가고 112에 연락가능하도록 하면됨.
        Intent intent = new Intent(childMain.this, mapMain.class );
        startActivity(intent);
    }
}
