package com.example.a043_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random random = new Random();
    int rand = random.nextInt(5);
    public void clickButtonFunction(View view)
    {
        EditText takeNumber = findViewById(R.id.takeNumber);
        int num = Integer.parseInt(takeNumber.getText().toString());


        if(rand==num)
        {
            Toast.makeText(this, "Great! You Are Correct", Toast.LENGTH_LONG).show();
        }
        else if (rand>num)
        {
            Toast.makeText(this, "Higher!", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Lower!", Toast.LENGTH_LONG).show();
        }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.realativelayout);

    }
}