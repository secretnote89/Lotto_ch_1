package com.example.lotto_ch_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView resultTextView;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        str = intent.getExtras().getString("result");
        Log.d("resultStr", str);

        resultTextView = findViewById(R.id.resultTextView);
        resultTextView.setText(str);
        resultTextView.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.black));
    }
}