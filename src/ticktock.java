import java.util.Random;
import java.util.Scanner;

public class ticktock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("");
        System.out.println("Härzlich Wihlkommah beih TickTockZehen");
        System.out.println("");
        System.out.println("****************************");
        boolean gwunna = false;
        char[][] spfeld = new char[3][3];
        spfeld[0][0] = 1;
        spfeld[1][1] = 1;
        int cplay = 1;

        while (!gwunna){
            System.out.println("Entehr your choice Player " + cplay);
            String sep = "|";
            for (int i = 0; i < spfeld.length; i++) {
                int r1 = spfeld[i][0];
                int r2 = spfeld[i][1];
                int r3 = spfeld[i][2];

                System.out.println(sep + r1 + sep + r2 + sep + r3 + sep);
            }
            String auswahl = scanner.nextLine();
            String[] auswal = auswahl.split(",");

            if (cplay == 1){
                spfeld[Integer.parseInt(auswal[0])][Integer.parseInt(auswal[1])] = 1;
                cplay = 2;
            }
            else if (cplay == 2){
                spfeld[Integer.parseInt(auswal[0])][Integer.parseInt(auswal[1])] = 2;
                cplay = 1;
            }
            if((spfeld[0][0] + spfeld[0][1] + spfeld[0][2]) == 3){
                gwunna = true;
            }
        }
        if(gwunna == true){
            if(cplay == 1){
                cplay = 2;
            }
            else{
                cplay = 1;
            }
        }
        System.out.println("Gratuliere Spieler Nr " + cplay);

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
