package com.example.devnet.QuizGame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SportResult extends AppCompatActivity {

    TextView mGrade, mFinalScore;
    Button mRetryButton, mbackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_result);

        mGrade =(TextView)findViewById(R.id.grade);
        mFinalScore =(TextView)findViewById(R.id.outof);
        mRetryButton = (Button)findViewById(R.id.retry);

        Bundle bundle =getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        mFinalScore.setText("Your sport quiz score is " + score + " out of " + SportQuiz.questions.length);

        if (score>=15){

            mGrade.setText("Outstanding!");
        }else if (score>=10){
            mGrade.setText("Good Work!");
        }else if(score>=5){
            mGrade.setText("Good Effort!");

        }else {
            mGrade.setText("Low Score! Play again!");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SportResult.this, SportActivity.class));
                SportResult.this.finish();
            }
        });

        mbackButton = (Button)findViewById(R.id.b_back);
        mbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SportResult.this,secondActivity.class));

            }
        });


    }
}
