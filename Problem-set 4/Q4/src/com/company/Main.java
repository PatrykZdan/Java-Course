package com.company;

public class Main {

    public static int yearsTilOneMillion(double initialBalance) {
        int counter = 0;
        if (initialBalance > 1000000) {
            return 0;
        } else {
            while (initialBalance<1000000){
                initialBalance*=1.05;
                counter++;
            }
            return counter;
        }
    }

    public static void main(String[] args) {
        System.out.println(yearsTilOneMillion(1));
    }
}
