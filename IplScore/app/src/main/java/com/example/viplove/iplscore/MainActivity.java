package com.example.viplove.iplscore;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score=0;
    int score2=0;
    public void six(View view){
        score=score+6;
        display(score);
    }
    public void four(View view){
        score=score+4;
        display(score);
    }
    public void three(View view){
        score=score+3;
        display(score);
    }
    public void two(View view){
        score=score+2;
        display(score);
    }
    public void one(View view){
        score=score+1;
        display(score);
    }
    public void wide(View view){
        score=score+1;
        display(score);
    }
    private void display(int number){
        TextView t=(TextView)findViewById(R.id.ab);
        t.setText(""+number);
    }
    public void six1(View view){
        score2=score2+6;
        display2(score2);
    }
    public void four1(View view){
        score2=score2+4;
        display2(score2);
    }
    public void three1(View view){
        score2=score2+3;
        display2(score2);
    }
    public void two1(View view){
        score2=score2+2;
        display2(score2);
    }
    public void one1(View view){
        score2=score2+1;
        display2(score2);
    }
    public void wide1(View view){
        score2=score2+1;
        display2(score2);
    }
    public void reset(View view){
        score=0;
        score2=0;
        display(score);
        display2(score2);
    }
    private void display2(int number){
        TextView t=(TextView)findViewById(R.id.text2);
        t.setText(""+number);
    }


}
