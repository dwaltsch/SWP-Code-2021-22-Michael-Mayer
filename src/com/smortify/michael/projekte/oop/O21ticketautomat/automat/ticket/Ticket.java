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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAusgabeZeit() {
        return AusgabeZeit;
    }

    public void setAusgabeZeit(int ausgabeZeit) {
        AusgabeZeit = ausgabeZeit;
    }

    public int getBezahlZeit() {
        return BezahlZeit;
    }

    public void setBezahlZeit(int bezahlZeit) {
        BezahlZeit = bezahlZeit;
    }
}
