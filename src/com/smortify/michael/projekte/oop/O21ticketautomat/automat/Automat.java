package com.smortify.michael.projekte.oop.O21ticketautomat.automat;

import com.smortify.michael.projekte.oop.O21ticketautomat.automat.geldausgabe.GeldAusgabe;
import com.smortify.michael.projekte.oop.O21ticketautomat.automat.printer.Printer;
import com.smortify.michael.projekte.oop.O21ticketautomat.automat.ticket.Ticket;
import com.smortify.michael.projekte.oop.O21ticketautomat.automat.ticketscanner.Ticketscanner;
import com.smortify.michael.projekte.oop.O21ticketautomat.controller.Controller;

public class Automat {
    GeldAusgabe geldAusgabe;
    Printer printer;
    Ticketscanner ticketscanner;
    Controller controller;

    public void getTicket(){
        Ticket ticket = new Ticket(1,10,0);
    };

    public void insertTicket(){
        controller.getPrice();
    };
    public void insertMoney(double insertedMoney){

    };

}
