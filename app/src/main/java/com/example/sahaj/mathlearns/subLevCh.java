package com.example.sahaj.mathlearns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class subLevCh extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fb);
//        EditText answerText;
//        final TextView Questions = (TextView) findViewById(R.id.Questions);
//        Questions.setText(SubtractionFB.askMes2());
//        Button Submit = (Button) findViewById(R.id.Submit);
//        Submit.setOnClickListener(new View.OnClickListener() {
//                                      @Override
//                                      public void onClick(View v) {
//                                          EditText answerText = (EditText) findViewById(R.id.answerText);
//                                          Integer submitted = 0;
//                                          TextView correctTextView = (TextView) findViewById(R.id.Correct);
//                                          if(answerText.getText().length()==0){
//                                              correctTextView.setText("Please submit an answer");
//                                          }else{
//                                              if(answerText.getText().length()!=0) {
//                                                  submitted = Integer.parseInt(answerText.getText().toString());
//                                              }}
//                                          //    int submitted = Integer.parseInt(answerText.getText().toString());
//                                          Random randomGen  = new Random();
//                                          int num1 = randomGen.nextInt();
//                                          int num2 = randomGen.nextInt();
//                                          int result  = num1 - num2;
//
//                                          if(SubtractionFB.isRight(submitted) == 1){
//                                              correctTextView.setText("Correct");
//                                              Questions.setText(SubtractionFB.askMes2());
//                                          }else {
//                                              if (SubtractionFB.isRight(submitted) == -1) {
//                                                  correctTextView.setText("Try Again");
//                                              }
//                                          }
//                                      }
//                                  }
//        );
//    }
}
