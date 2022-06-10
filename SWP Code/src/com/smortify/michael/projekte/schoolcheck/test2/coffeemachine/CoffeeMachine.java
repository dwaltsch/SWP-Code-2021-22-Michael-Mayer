package com.smortify.michael.projekte.schoolcheck.test2.coffeemachine;

import com.smortify.michael.projekte.schoolcheck.test2.coffeemachine.Wassertank.Wassertank;
import com.smortify.michael.projekte.schoolcheck.test2.coffeemachine.kaffeebehälter.KaffeBehaelter;
import com.smortify.michael.projekte.schoolcheck.test2.coffeemachine.steuerung.Steuerung;

import java.util.Scanner;

public class CoffeeMachine {
    KaffeBehaelter coffeecontainer = new KaffeBehaelter(200, 500);
    Wassertank wassertank = new Wassertank(1000, 1000);
    Steuerung steuerung = new Steuerung(1, 40); // default value assumed here
    private boolean isOn = false;
    private boolean bootmenu = true;
    public CoffeeMachine() {
    }

    public void startMenu() throws InterruptedException {
        while (bootmenu) {
            System.out.println("Welcome to the coffe machine boot menu what would you like to do?");
            System.out.println("1. Turn on the machine");
            System.out.println("2. Set me a coffee size");
            System.out.println("3. Change coffee intensity");
            System.out.println("4. Refill the water");
            System.out.println("5. Refill the beans");
            System.out.println("6. Make some coffee");
            System.out.println("7. Turn of the machine");

            Scanner scanner = new Scanner(System.in);
            int auswahl = scanner.nextInt();

            if (auswahl == 1) {
                if (isOn) {
                    System.out.println("it is already on");
                } else {
                    isOn = true;
                    System.out.println("Now entering Coffee Machine Mode");
                }
            }

            if (auswahl == 2) {
                System.out.println("How big would you like your coffee?");
                int coffeesize = scanner.nextInt();
                if (40 <= coffeesize && coffeesize <= 200) {
                    steuerung.setKaffeegroesse(coffeesize);
                } else {
                    System.out.println("That is too much coffee for this type of machine choose a value between 40 and 200 ml please");
                    //todo do was im else o noch macha
                }
                steuerung.Hardwaredelay();
            }

            if (auswahl == 3) {
                System.out.println("How intense would you like to have your coffee?");
                System.out.println("Options range from 1 (for the English) to 10 (Heart Attack Levels of coffee)");
                int intensity = scanner.nextInt();
                System.out.println(intensity);
                if (0 <= intensity && intensity <= 10) {
                    steuerung.setStaerke(intensity);
                } else {
                    System.out.println("Please choose a valid coffe value");
                    //todo do was im else o noch macha
                }
                steuerung.Hardwaredelay();
            }

            if (auswahl == 4) {
                wassertank.refillTank();
                System.out.println("Watertank refilled current amount in tank is " + wassertank.getFillamount() + " ml");
                //todo irgendwie kut es do ins else inne i hab bei gott keine ahnung weshalb
            }

            if (auswahl == 5) {
                coffeecontainer.refillCoffee();
                System.out.println("Coffee refilled currently there are " + coffeecontainer.getCoffeeamount() + " Beans in there");
            }

            if (auswahl == 6) {
                if (isOn && wassertank.getFillamount() >= steuerung.getKaffeegroesse() && coffeecontainer.getCoffeeamount() >= steuerung.getStaerke()) {
                    System.out.println("Lets make some coffe");

                    for (int i = 0; i < steuerung.getStaerke(); i++) {
                        coffeecontainer.setCoffeeamount(coffeecontainer.getCoffeeamount() - 1);
                        System.out.println("mrrrrrrrrrrrrrrrrrrrrrrrrrtttt");
                    }

                    System.out.println("nnnnnnnjeeeeeeeeeeeeeeeeeeeeeeeeeeetrrrrrrrrrrrrrrrrrrr");
                    steuerung.Hardwaredelay();

                    for (int i = 0; i < steuerung.getKaffeegroesse(); i++) {
                        wassertank.setFillamount(wassertank.getFillamount() - 1);
                        System.out.println("brrrrrrrrrrrrrrrrrrrrrrrrrrrt");
                    }
                    System.out.println("---------------------------------");
                    System.out.println("Enjoy your fresh coffee");
                    System.out.println("There is " + wassertank.getFillamount() + " ml of water and " + coffeecontainer.getCoffeeamount() + " beans left in the machine");
                }
                if (!isOn) {
                    System.out.println("Your coffee machine is off");
                }
            }

            if (auswahl == 7) {
                isOn = false;
                bootmenu = false;
            } else if (auswahl < 0 || auswahl > 7) {
                System.out.println("Menu item not found please try another one");
                steuerung.Hardwaredelay();
            }


        }
    }

}
