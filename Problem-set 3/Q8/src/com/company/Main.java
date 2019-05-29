package com.company;

public class Main {

    public static int genRandomNumb(int x){
        int numb =  (int)(Math.random()*x+1);
        return numb;
    }

    public static int monopoly(){
        int numb1 = genRandomNumb(6);
        int numb2 = genRandomNumb(6);
        int result = numb1+numb2;
        if (result==12){
            result+=genRandomNumb(6);
            result+=genRandomNumb(6);
            return result;
        } else {
            return result;
        }
    }

    public static void main(String[] args) {

    }
}
