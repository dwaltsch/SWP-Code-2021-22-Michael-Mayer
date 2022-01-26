package com.smortify.michael.projekte.basics.javabasics;

public class Loops {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 101; i++) {
            System.out.println(i);
            a = a + i;
            System.out.println(a);
        }

// one needs to be commented out

        int b = 0;
        for (int i = 2; i < 1001; i = i + 2) {
            System.out.println(i);
            b = b + i;
            System.out.println(b);
        }
    }
}
