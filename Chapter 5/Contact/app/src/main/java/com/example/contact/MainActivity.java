package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Contact o1 = new Contact(1,"9898989898","Ayush");
    Contact o2 = new Contact(1,"9898989898","Ayush");
    Contact o3 = new Contact(1,"9898989898","Ayush");
    Contact o4 = new Contact(1,"9898989898","Ayush");
    Contact o5 = new Contact(1,"9898989898","Ayush");
    Contact o6 = new Contact(1,"9898989898","Ayush");
    Contact o7 = new Contact(1,"9898989898","Ayush");
    Contact o8 = new Contact(1,"9898989898","Ayush");
    Contact o9 = new Contact(1,"9898989898","Ayush");

    Contact[] contacts = {o1,o2,o3,o4,o5,o6,o7,o8,o9};
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad = new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);

    }
}
