package com.example.chapter2;

public class Function_Practice {
    public static double average(int a,int b,int c) {
        return (a + b + c) / 3.0;
    }
    public static double averagepluc(float a,float b,float c)
    {
        double d=(a+b+c)/3.0;
        return d+1;
    }

    public static void main(String[] args) {
        System.out.println(average(1,2,3));
        System.out.println(averagepluc(1,2,3));
    }
}
