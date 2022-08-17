package com.example.chapter2;

import java.util.concurrent.locks.Condition;

public class MyClass {
    public static void main(String[] args) {
        System.out.print("hello ayush");
        System.out.println("hello life");
        String name = "This is my name";
        System.out.println(name.substring(1,3));
        int a=75;
        int b=4;
        System.out.println(name);
        System.out.println(a+b);
        boolean isTrue=false;
        System.out.println(a);
        // Use this to print name
//        if-else Condition
        ClassEx t1=new ClassEx();
        t1.method1();
        ClassEx2 t2=new ClassEx2();
        t2.method1();
        t2.method2();
    }
}