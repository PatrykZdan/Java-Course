package com.company;

public class Main {

    public static int counter = 0;

    public static int diceRoll(int sides) {

        double randomNumber = Math.random() * sides;
        randomNumber = randomNumber + 1;
        return (int) randomNumber;

    }

    public static int monopolyRoll() {
        counter++;
        int roll1 = diceRoll(6);
        int roll2 = diceRoll(6);
        if (roll1 != roll2) {
            return roll1 + roll2;
        } else {
            return roll1 + roll2 + monopolyRoll();
        }

    }


    public static void main(String[] args) {

        System.out.println(monopolyRoll());

    }
}
