package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions={"Java is a person",
    "Java wa introduced in 1233 ?", "Java was created using python ?",
    "java has abstract classes ?"};
    private  boolean[] answers = {false,false,false,true};
    private  int score=0;
    Button yes;
    Button no;
    TextView question;
    private int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yes);
        no=findViewById((R.id.no));
        question=findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index+1==questions.length){
                    Toast.makeText(MainActivity.this, "Your score is "+score, Toast.LENGTH_SHORT).show();
                }
                if(answers[index]==true){
                    score++;}
                question.setText(questions[index++]);
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index+1==questions.length){
                    Toast.makeText(MainActivity.this, "Your score is " +score, Toast.LENGTH_SHORT).show();
                }
                if(answers[index]==false){
                    score--;}
                    question.setText(questions[index++]);
            }
        });


    }
}