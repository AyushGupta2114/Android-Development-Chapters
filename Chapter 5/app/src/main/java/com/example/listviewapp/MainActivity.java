package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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
        // listener on ArrayAdapter lis view
//        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, "You clicked on :"+i, Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}