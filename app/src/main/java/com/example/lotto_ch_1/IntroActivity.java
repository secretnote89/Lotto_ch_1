package com.example.lotto_ch_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class IntroActivity extends AppCompatActivity {

    TextView introTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        introTextView = findViewById(R.id.introTextView);

        //introTextView.setBackgroundColor(R.color.purple_200);

    }
}