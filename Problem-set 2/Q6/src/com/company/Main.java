package com.company;

public class Main {

    public static void main(String[] args) {

        int weekday = 5;
        boolean holiday = false;

        if(weekday>=1&&weekday<6&&holiday==false){
            System.out.println("Wake up at 7:00");
        } else {
            System.out.println("Sleep in!");
        }

    }
}
