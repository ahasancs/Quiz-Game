package com.example.devnet.QuizGame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by devnet on 11/1/2017.
 */

public class contact extends AppCompatActivity {

      Button mbButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contruct_w);

        mbButton = (Button)findViewById(R.id.back);
        mbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(contact.this,MainActivity.class));
            }
        });


    }
}
