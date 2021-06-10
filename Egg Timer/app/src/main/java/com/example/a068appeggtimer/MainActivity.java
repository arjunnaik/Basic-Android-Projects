package com.example.a068appeggtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    TextView textViewMin,textViewSec;
    SeekBar seekBar;
    int k,b=0;
    CountDownTimer countDownTimer;
    void setAlaram(int a)
    {
        textViewMin = findViewById(R.id.textViewMin);
        textViewSec = findViewById(R.id.textViewSec);
        textViewMin.setText(String.format("%02d",a/60));
        textViewSec.setText(String.format("%02d",a%60));

    }
    public void play()
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.air);
        mediaPlayer.start();
    }
    public void ok(View view){
        Button button = findViewById(R.id.button);
        if (b==0)
        {
            b=1;
            button.setText("STOP");
        }
        else {
            b=0;
            button.setText("START");
        }
        if (button.getText()=="STOP")
        {
            k=seekBar.getProgress();
             countDownTimer = new CountDownTimer(seekBar.getProgress()*1000, 1000) {

                @Override
                public void onTick(long millisUntilFinished) {

                    setAlaram(--k);
                }

                @Override
                public void onFinish() {
                    play();
                }
            }.start();
        }
        else
        {
            countDownTimer.cancel();
            seekBar.setProgress(90);
            setAlaram(90);
        }


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBar);

        seekBar.setMax(600);
        seekBar.setProgress(90);
        setAlaram(90);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                countDownTimer.cancel();
                b=0;
                setAlaram(progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}