package com.koreanair.samplemobilequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Quiz3ReceiveIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3_receive_intent);

        Intent intent = getIntent();
        String strID = intent.getStringExtra("id");
        String strPW = intent.getStringExtra("pw");

        ((TextView)findViewById(R.id.tv_username)).setText(strID);
        ((TextView)findViewById(R.id.tv_pwd)).setText(strPW);
    }
}
