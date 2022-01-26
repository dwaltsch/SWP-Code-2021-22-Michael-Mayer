package com.smortify.michael.projekte.oop.O21ticketautomat.controller;

import com.smortify.michael.projekte.oop.O21ticketautomat.automat.geldausgabe.GeldAusgabe;
import com.smortify.michael.projekte.oop.O21ticketautomat.automat.ticket.Ticket;

import java.util.Random;

public class Controller {
    GeldAusgabe geldAusgabe;
    double price;

    {
        price = 0;
    }

    public double getPrice(Ticket ticket) {
        //Wenn das Ticket eingeschoben wird (insertTicket(Ticket)) wird kann über getPrice() der aktuelle Preis berechnet werden.
        //Wenn getPrice() aufgerufen wird ohne Ticket kommt ein Fehler.
        Random random = new Random();
        int currenttime = random.nextInt(6) + 1;
        price = price + 0.5;// Standardgebühr
        price = price + price * (currenttime - ticket.getAusgabeZeit());
        System.out.println("The current price is: " + price);
        ticket.setBezahlZeit(currenttime);
        return price;

    }

    public void insertMoney(double amountofMoney, Ticket ticket) {
        double pricetopay = getPrice(ticket);
        double returnmoney = amountofMoney - pricetopay;
        if (returnmoney < 0) {
            System.out.println("Bitte werfens nochmal " + returnmoney + " € nach");
        } else {
            System.out.println("Vielen Dank für ihre Spende");
            geldAusgabe.outputmoney(returnmoney);
        }
    }
}
