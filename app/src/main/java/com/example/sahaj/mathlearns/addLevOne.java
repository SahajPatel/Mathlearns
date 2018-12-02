package com.example.sahaj.mathlearns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class addLevOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_lev_one);
        final TextView Questions =  findViewById(R.id.Questions);
        Questions.setText(Addition.askMe());
        Button Submit = findViewById(R.id.Submit);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText answerText = findViewById(R.id.answerText);
                double submitted = 0;
                TextView correctTextView =  findViewById(R.id.Correct);
                if(answerText.getText().length()==0){
                    correctTextView.setText("Please submit an answer");
                }else{
                    if(answerText.getText().length()!=0) {
                        submitted = Double.parseDouble(answerText.getText().toString());
                }}

                if(Addition.isRight(submitted) == 1){
                    correctTextView.setText("Correct");
                    Questions.setText(Addition.askMe());
                }else {
                    if (Addition.isRight(submitted) == -1) {
                        correctTextView.setText("Try Again");
                    }
                }
            }
        }
        );
    }
}
