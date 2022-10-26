package com.example.detailscontact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Contact o1 =new Contact(1,"8765705001","Harry");
    Contact o2 =new Contact(1,"9898989898","parry");
    Contact o3 =new Contact(1,"4252233333","carry");
    Contact o4 =new Contact(1,"7887878787","Hbarry");
    Contact o5 =new Contact(1,"9898989898","thor");
    Contact o6 =new Contact(1,"89898545454","Ayush");
    Contact o7 =new Contact(1,"87878754545","caption");
    Contact o8 =new Contact(1,"45424545415","Iron man");
    Contact o9 =new Contact(1,"57542575755","mark zuker");
    Contact o10 =new Contact(1,"5454875454","elon musk");
    Contact o11 =new Contact(1,"9898989898","diana prince");

    Contact [] contacts ={o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}