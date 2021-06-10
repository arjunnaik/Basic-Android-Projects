package com.example.a072braintrainer1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView secView,scoreView,questionView,correctView,textView6,textView7;
    Button startButton,button,button2,button3,button4;
    int rand,crr=0,all=0;
    public void clickButton(View view)
    {
        if (view.getTag().toString().equals(Integer.toString(rand)))
        {
            correctView.setText("CORRECT");
            crr++;
        }
        else {
            correctView.setText("  WRONG");
        }
        all++;
        scoreView.setText(String.format("%02d/%02d",crr,all));
        generate();
    }
    public void generate()
    {   Random random=new Random();
        int num1=random.nextInt(50),num2=random.nextInt(50);
        questionView.setText(String.format("%02d + %02d = ?",num1,num2));
        int a[]=new int[4];
        rand=random.nextInt(4);
        for (int i=0; i<4; i++)
        {
            if (i==rand)
            {
                a[rand]=num1+num2;
            }
            else
            {
                a[i]=random.nextInt(100);
                if (a[i]==num1+num2)
                {
                    i--;
                }

            }
        }
        button.setText(String.format("%02d",a[0]));
        button2.setText(String.format("%02d",a[1]));
        button3.setText(String.format("%02d",a[2]));
        button4.setText(String.format("%02d",a[3]));





    }
    public void startButton(final View view)
    {
        startButton.setVisibility(view.INVISIBLE);
        secView.setVisibility(view.VISIBLE);
        scoreView.setVisibility(view.VISIBLE);
        questionView.setVisibility(view.VISIBLE);
        button.setVisibility(view.VISIBLE);
        button2.setVisibility(view.VISIBLE);
        button3.setVisibility(view.VISIBLE);
        button4.setVisibility(view.VISIBLE);
        correctView.setVisibility(view.VISIBLE);
        scoreView.setText(String.format("%02d/%02d",crr,all));




        new CountDownTimer(30100,1000)
        {
            @Override
            public void onTick(long millisUntilFinished) {
                secView.setText(String.format("%02ds",(millisUntilFinished/1000)));
            }


            @Override
            public void onFinish() {
                Runtime.getRuntime().exit(0);
            }
        }.start();
        generate();


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        secView = findViewById(R.id.secView);
        scoreView = findViewById(R.id.scoreView);
        questionView = findViewById(R.id.questionView);
        startButton = findViewById(R.id.startButton);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button1);
        button3=findViewById(R.id.button2);
        button4=findViewById(R.id.button3);
        correctView=findViewById(R.id.correctView);


    }
}