package com.example.a057_gridlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void hiButton(View view)
    {
        MediaPlayer hi = MediaPlayer.create(this,R.raw.hi);
        hi.start();
    }
    public void helloButton(View view)
    {
        MediaPlayer hello = MediaPlayer.create(this,R.raw.hello);
        hello.start();
    }
    public void morningButton(View view)
    {
        MediaPlayer morning = MediaPlayer.create(this,R.raw.good_morning);
        morning.start();
    }
    public void afternoonButton(View view)
    {
        MediaPlayer afternoon = MediaPlayer.create(this,R.raw.good_afternoon);
        afternoon.start();
    }
    public void byeButton(View view)
    {
        MediaPlayer bye = MediaPlayer.create(this,R.raw.bye);
        bye.start();
    }
    public void goButton(View view)
    {
        MediaPlayer go = MediaPlayer.create(this,R.raw.go);
        go.start();
    }
    public void indiaButton(View view)
    {
        MediaPlayer india = MediaPlayer.create(this,R.raw.india);
        india.start();
    }
    public void rcbButton(View view)
    {
        MediaPlayer rcb = MediaPlayer.create(this,R.raw.rcb);
        rcb.start();
    }
    public void wonButton(View view)
    {
        MediaPlayer won = MediaPlayer.create(this,R.raw.won);
        won.start();
    }
    public void arjunButton(View view)
    {
        MediaPlayer arjun = MediaPlayer.create(this,R.raw.arjun);
        arjun.start();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}