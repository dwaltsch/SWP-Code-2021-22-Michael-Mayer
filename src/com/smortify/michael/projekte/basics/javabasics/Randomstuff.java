package com.smortify.michael.projekte.basics.javabasics;

import java.util.Random;

public class Randomstuff {
    public static void main(String[] args) {
        Random random = new Random();
        boolean istrue = false;
        int b = 0;
        while (!istrue) {
            int randomNumber = random.nextInt(20) + 10;
            System.out.println(randomNumber);
            b = b + randomNumber;
            if (randomNumber == 15) {
                istrue = true;
                System.out.println(b);
                break;
            } else if (randomNumber == 25) {
                istrue = true;
                System.out.println(b);
                break;
            } else {
                istrue = false;
            }
        }

    }
}
