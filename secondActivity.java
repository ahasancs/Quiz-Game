package com.example.devnet.QuizGame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondActivity extends AppCompatActivity {

    Button mStartButton;
    Button mSportButton;
    Button mSceinceButton;
    Button mhistoryButton;
    Button mmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);

        mStartButton = (Button)findViewById(R.id.b_gen);
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(secondActivity.this,GeneralActivity.class));
            }
        });

        mSportButton = (Button)findViewById(R.id.b_sport);
        mSportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(secondActivity.this,SportActivity.class));
            }
        });


        mSceinceButton = (Button)findViewById(R.id.b_science);
        mSceinceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(secondActivity.this,SceinceActivity.class));
            }
        });
        mhistoryButton = (Button)findViewById(R.id.b_history);
        mhistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(secondActivity.this,HActivity.class));
            }
        });

        mmButton = (Button)findViewById(R.id.b_math);
        mmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(secondActivity.this,MActivity.class));
            }
        });

        mmButton = (Button)findViewById(R.id.b_back1);
        mmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(secondActivity.this,MainActivity.class));
            }
        });


    }
}
