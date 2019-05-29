package com.company;

public class Main {

    public static double calculateTip(double x){
        double y=x*0.15;
        return y;
    }

    public static void main(String[] args) {

        System.out.println(calculateTip(10));

    }
}
