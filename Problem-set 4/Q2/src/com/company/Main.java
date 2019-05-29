package com.company;

public class Main {

    public static int factorial(int x){
        int result = 1;
        int counter = 1;
        while (counter <= x){
            result*=counter;
            counter++;
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
