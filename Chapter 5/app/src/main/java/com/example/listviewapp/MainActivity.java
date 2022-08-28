package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    String arr[]={"This is ","Item","Item2","Another item"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=findViewById(R.id.listview);
//        ArrayAdapter ad= new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
//        listview.setAdapter(ad);
//        using built in array adapter
        AyushAdapter ad = new AyushAdapter(this,R.layout.my_ayush_layout,arr);
        listview.setAdapter(ad);
    }
}