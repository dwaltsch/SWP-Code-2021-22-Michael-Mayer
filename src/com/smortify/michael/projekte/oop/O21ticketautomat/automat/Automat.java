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
    Ticket ticket;
    private int ticketid = 0;

    public void getTicket() {
        ticketid = new Ticket(ticketid, 10, 0);
        ticketid++;
    }

    ;

    public void insertTicket(Ticket ticket) {
        controller.getPrice(this.ticket);
    }

    ;

    public void insertMoney(double insertedMoney) {

    }

    ;

}
