package com.smortify.michael.projekte.oop.O21ticketautomat.automat.ticket;

public class Ticket {
    private int id;
    private int AusgabeZeit;
    private int BezahlZeit;

    public Ticket(int id, int ausgabeZeit, int bezahlZeit) {
        this.id = id;
        AusgabeZeit = ausgabeZeit;
        BezahlZeit = bezahlZeit;
    }
}
