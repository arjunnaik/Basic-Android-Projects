package com.example.a070showhide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    public void showButton(View view)
    {
        textView = findViewById(R.id.textView);
        //textView.setAlpha(1);
        textView.setVisibility(view.VISIBLE);
    }
    public void hideButton(View view)
    {
        textView = findViewById(R.id.textView);
        //textView.setAlpha(0);
        textView.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}