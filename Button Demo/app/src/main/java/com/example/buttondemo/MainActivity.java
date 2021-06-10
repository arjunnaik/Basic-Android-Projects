package com.example.buttondemo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public void clickButton(View view) {
        EditText editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        EditText editTextTextPassword = findViewById(R.id.editTextTextPassword);

        Toast.makeText(this, "UserName : " + editTextTextPersonName.getText(), Toast.LENGTH_SHORT).show();
        Log.i("Username", editTextTextPersonName.getText().toString());
        Log.i("Password", editTextTextPassword.getText().toString());
      
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}