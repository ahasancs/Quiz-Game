package com.example.devnet.QuizGame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by devnet on 11/1/2017.
 */

public class SResult extends AppCompatActivity {

    TextView mGrade, mFinalScore;
    Button mRetryButton, mbackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        mGrade =(TextView)findViewById(R.id.grade);
        mFinalScore =(TextView)findViewById(R.id.outof);
        mRetryButton = (Button)findViewById(R.id.retry);

        Bundle bundle =getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        mFinalScore.setText("You scored " + score + " out of " + SQuiz.questions.length);

        if (score>=15){

            mGrade.setText("Outstanding");
        }else if (score>=10){
            mGrade.setText("Good Work");
        }else if(score>=5){
            mGrade.setText("Good Effort");

        }else {
            mGrade.setText("Low Score! Play again!");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SResult.this, SceinceActivity.class));
                SResult.this.finish();
            }
        });

        mbackButton = (Button)findViewById(R.id.b_home1);
        mbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SResult.this,secondActivity.class));

            }
        });


    }
}
