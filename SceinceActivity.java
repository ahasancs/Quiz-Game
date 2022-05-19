package com.example.devnet.QuizGame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



public class SceinceActivity extends AppCompatActivity {

    private TextView mScoreView, mQusetion;
    private ImageView mImageView;
    private Button mTrueButton, mFalseButton;

    private boolean mAnswer;
    private int mScore =0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sceince_quiz);

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

                    if (mQuestionNumber == SQuiz.questions.length) {

                        Intent i = new Intent(SceinceActivity.this, SResult.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        SceinceActivity.this.finish();
                        startActivity(i);


                    } else {
                        updateQuestion();
                    }

                }
                else{
                    if (mQuestionNumber == SQuiz.questions.length) {

                        Intent i = new Intent(SceinceActivity.this, SResult.class);
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

                    if (mQuestionNumber == SQuiz.questions.length) {

                        Intent i = new Intent(SceinceActivity.this, SResult.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        SceinceActivity.this.finish();
                        startActivity(i);


                    } else {
                        updateQuestion();
                    }

                }
                else{
                    if (mQuestionNumber == SQuiz.questions.length) {

                        Intent i = new Intent(SceinceActivity.this, SResult.class);
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
        mImageView.setImageResource(SQuiz.images[mQuestionNumber]);
        mQusetion.setText(SQuiz.questions[mQuestionNumber]);
        mAnswer = SQuiz.answers[mQuestionNumber];
        mQuestionNumber++;
    }
    public void updateScore(int point){

        mScoreView.setText(""+ mScore);
    }

}
