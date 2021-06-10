package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int c;
    int []stateCounter = {2,2,2,2,2,2,2,2,2};
    public void dropIn(View view)
    {
        ImageView counter = (ImageView) view;
        int state = Integer.parseInt(counter.getTag().toString());

        if (stateCounter[state]==2) {

                if (c == 0)
                {
                    counter.setTranslationY(-2000f);
                    counter.setImageResource(R.drawable.red);
                    stateCounter[state]=c;
                    c = 1;
                    counter.animate().translationYBy(2000f).rotation(360).setDuration(300);
                    if ((stateCounter[0]==0 && stateCounter[1]==0 && stateCounter[2]==0) || (stateCounter[3]==0 && stateCounter[4]==0 && stateCounter[5]==0) || (stateCounter[6]==0 && stateCounter[7]==0 && stateCounter[8]==0) || (stateCounter[0]==0 && stateCounter[3]==0 && stateCounter[6]==0) || (stateCounter[1]==0 && stateCounter[4]==0 && stateCounter[7]==0) || (stateCounter[2]==0 && stateCounter[5]==0 && stateCounter[8]==0) || (stateCounter[0]==0 && stateCounter[4]==0 && stateCounter[8]==0) || (stateCounter[2]==0 && stateCounter[4]==0 && stateCounter[6]==0))
                    {
                        Toast.makeText(this, "Red Wins", Toast.LENGTH_LONG).show();
                        finish();
                        startActivity(getIntent());
                    }


                }
                else
                    {   counter.setTranslationY(2000f);
                        counter.setImageResource(R.drawable.green);
                        stateCounter[state]=c;
                        c = 0;
                        counter.animate().translationYBy(-2000f).rotation(360).setDuration(300);
                        if ((stateCounter[0]==1 && stateCounter[1]==1 && stateCounter[2]==1) || (stateCounter[3]==1 && stateCounter[4]==1 && stateCounter[5]==1) || (stateCounter[6]==1 && stateCounter[7]==1 && stateCounter[8]==1) || (stateCounter[0]==1 && stateCounter[3]==1 && stateCounter[6]==1) || (stateCounter[1]==1 && stateCounter[4]==1 && stateCounter[7]==1) || (stateCounter[2]==1 && stateCounter[5]==1 && stateCounter[8]==1) || (stateCounter[0]==1 && stateCounter[4]==1 && stateCounter[8]==1) || (stateCounter[2]==1 && stateCounter[4]==1 && stateCounter[6]==1))
                        {
                            Toast.makeText(this, "Green Wins", Toast.LENGTH_LONG).show();
                            finish();
                            startActivity(getIntent());

                        }
                    }

        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Random random = new Random();
        c=random.nextInt(2);
        if (c==0)
        {
            Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}