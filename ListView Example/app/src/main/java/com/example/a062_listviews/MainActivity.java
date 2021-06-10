package com.example.a062_listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listView);
        final ArrayList<String> fruit = new ArrayList<String>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kivi");
        fruit.add("Grapes");
        fruit.add("Dragon");
        fruit.add("Pineapple");
        fruit.add("Stawberry");
        fruit.add("Watermelon");
        fruit.add("Cherry");
        fruit.add("Coconut");
        fruit.add("Lemon");
        fruit.add("Sweet Lime");
        fruit.add("Plum");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,fruit);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, fruit.get(position), Toast.LENGTH_SHORT).show();
            }
        });



    }
}