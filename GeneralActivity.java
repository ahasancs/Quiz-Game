package com.example.devnet.QuizGame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GeneralActivity extends AppCompatActivity {

    private TextView mScoreView, mQusetion;
    private ImageView mImageView;
    private Button mTrueButton, mFalseButton;

    private boolean mAnswer;
    private int mScore =0;
    private int mQuestionNumber =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView =(TextView) findViewById(R.id.points);
        mImageView = (ImageView)findViewById(R.id.imageView);
        mQusetion = (TextView)findViewById(R.id.question);
        mTrueButton = (Button)findViewById(R.id.trueButton);
        mFalseButton =(Button)findViewById(R.id.falseButton);

        updateQuestion();

        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mAnswer == true) {

                    mScore++;
                    updateScore(mScore);

                    if (mQuestionNumber == GeneralQuiz.questions.length) {

                        Intent i = new Intent(GeneralActivity.this, GeneralResult.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        GeneralActivity.this.finish();
                        startActivity(i);


                    } else {
                        updateQuestion();
                    }

                }
                else{
                    if (mQuestionNumber == GeneralQuiz.questions.length) {

                        Intent i = new Intent(GeneralActivity.this, GeneralResult.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        startActivity(i);


                    } else {
                        updateQuestion();
                    }
                }

            }

        });

        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mAnswer == false) {

                    mScore++;
                    updateScore(mScore);

                    if (mQuestionNumber == GeneralQuiz.questions.length) {

                        Intent i = new Intent(GeneralActivity.this, GeneralResult.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        GeneralActivity.this.finish();
                        startActivity(i);


                    } else {
                        updateQuestion();
                    }

                }
                else{
                    if (mQuestionNumber == GeneralQuiz.questions.length) {

                        Intent i = new Intent(GeneralActivity.this, GeneralResult.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        startActivity(i);


                    } else {
                        updateQuestion();
                    }
                }

            }

        });

    }
    private void updateQuestion() {
        mImageView.setImageResource(GeneralQuiz.images[mQuestionNumber]);
        mQusetion.setText(GeneralQuiz.questions[mQuestionNumber]);
        mAnswer = GeneralQuiz.answers[mQuestionNumber];
        mQuestionNumber++;
    }
    public void updateScore(int point){

        mScoreView.setText("" + mScore);
    }
}
