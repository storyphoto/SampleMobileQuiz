package com.koreanair.samplemobilequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mainTextView;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: 수험자의 성명과 사번(고유번호)으로 변경
        mainTextView = (TextView)findViewById(R.id.main_text);
        mainTextView.setText("0900154 / 김성진");

        //버튼 등록
        button1 = (Button)findViewById(R.id.button_1);
        button2 = (Button)findViewById(R.id.button_2);
        button3 = (Button)findViewById(R.id.button_3);
        button4 = (Button)findViewById(R.id.button_4);
        button5 = (Button)findViewById(R.id.button_5);

        //버튼 이벤트 등록
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==button1){
            Toast.makeText(MainActivity.this, "web view", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Quiz1WebViewActivity.class);
            startActivity(intent);
        }else if(view==button2){
            Toast.makeText(MainActivity.this, "list view", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Quiz2ListViewActivity.class);
            startActivity(intent);
        }else if(view==button3){
            Toast.makeText(MainActivity.this, "send intent", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Quiz3SendIntentActivity.class);
            startActivity(intent);
        }else if(view==button4){
            Toast.makeText(MainActivity.this, "launch app", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Quiz4LaunchAppActivity.class);
            startActivity(intent);
        }else if(view==button5) {
            Toast.makeText(MainActivity.this, "api call", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Quiz5ApiCallActivity.class);
            startActivity(intent);
        }
    }
}
