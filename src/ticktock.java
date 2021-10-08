import java.util.Random;
import java.util.Scanner;

public class ticktock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("Härzlich Wihlkommah beih TickTockZehen");
        System.out.println("****************************");
        int[][] spfeld = new int[3][3];
        String sep = "/";
        for (int i = 0; i < spfeld.length; i++) {
            System.out.println(spfeld[i][0]+ sep);
            for (int b = 0; b < spfeld.length; b++) {
                System.out.println(spfeld[0][b]+ sep);
            }
        }
















        /* System.out.println("Rädy Player One?");
        String input = scanner.nextLine();
        if(input == "yes"){
            System.out.println("nope");
        }
        else if (input == "nö"){
            System.out.println("perfekt aufgehts");
        }
        else if (input == "der film war scheiße"){
            System.out.println("jop");
        } */

    }
}
