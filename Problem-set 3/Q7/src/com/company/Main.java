package com.company;

public class Main {

    public static double fahrenheitToCelsius(double f){
        double c = (f-32)*5/9;
        return c;
    }

    public static void printTemperature(double temp){
        System.out.println("F: "+temp+", C: "+fahrenheitToCelsius(temp));
    }

    public static void main(String[] args) {
	printTemperature(50);
    }
}
