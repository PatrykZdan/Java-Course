package com.company;

public class Main {

    public static void printInReverse(String[] stringArray) {

        int counter = stringArray.length;

        while (counter>0){
            System.out.println(stringArray[counter-1]);
            counter--;
        }

    }

    public static void main(String[] args) {
        String[] arr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
	    printInReverse(arr);
    }

}