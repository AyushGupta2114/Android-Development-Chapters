package com.example.chapter2;

import java.util.ArrayList;

public class ArraysPractice {
    public static void main(String[] args) {
        int harry[]={1,2,3,4,5,6};
        System.out.println(harry[1]);
        System.out.println(harry[2]);
        "harry".length();
        ArrayList p =new ArrayList();
        p.add(3);
        p.add("55");
        p.add(23);
        for(Object o:p)
        {
            System.out.println("object is :"+o);
        }
    }
}
