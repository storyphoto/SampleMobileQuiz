package com.koreanair.samplemobilequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Quiz3SendIntentActivity extends AppCompatActivity implements View.OnClickListener {

    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3_send_intent);

        button6 = (Button)findViewById(R.id.button_6);
        button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //TODO: Quiz3. 사용자의 입력을 다음 창으로 전달하기
        Intent intent = new Intent(this, Quiz3ReceiveIntentActivity.class);
        intent.putExtra("id", ((EditText)findViewById(R.id.txtID)).getText().toString());
        intent.putExtra("pw", ((EditText)findViewById(R.id.txtPW)).getText().toString());
        startActivity(intent);
    }
}
