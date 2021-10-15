package com.smortify.michael.projekte;

import java.util.Random;

public class whln {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isgud = false;
        int b = 0;
        while(!isgud){
            int randomNumber = random.nextInt(20)+10;
            System.out.println(randomNumber);
            b = b + randomNumber;
            if(randomNumber == 15){
                isgud = true;
                System.out.println(b);
                break;
            }
            else if (randomNumber == 25){
                isgud = true;
                System.out.println(b);
                break;
            }
            else {
                isgud = false;
            }
        }

    }
}
