package com.example.timetable_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar3);
        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayList<String> nums = new ArrayList<String>();

        seekBar.setMax(100);
        seekBar.setProgress(50);

        for (int i=1; i<=100; i++)
        {
            nums.add(Integer.toString(i));
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nums);
        listView.setAdapter(arrayAdapter);

    }
}