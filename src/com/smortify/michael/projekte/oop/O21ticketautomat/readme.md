Die Firma Ticketbox stellt Parkautomaten her.



Der Automat hat einen Drucker, einen Ticketscanner, eine Geldausgabe und einen Controller. Der Controller merkt sich alle Tickets, berechnet den Preis (1 Cent pro Minute)und gibt dem Drucker die Info, dass er drucken soll



Ein Ticket hat eine Id, einen Ausgabe-timestamp und einen Bezahlt-Timestamp. Wenn beide befüllt sind ist das Ticket bezahlt.



Die Box wirft ein neues Ticket aus wenn man auf einen Knopf drückt (getTicket()). Die Box generiert für das Ticket eine ID und merkt sich alle Tickets.



Wenn das Ticket eingeschoben wird (insertTicket(Ticket)) wird kann über getPrice() der aktuelle Preis berechnet werden. Wenn getPrice() aufgerufen wird ohne Ticket kommt ein Fehler.

Wenn ein Ticket vorhanden ist kann mit insertMoney(double) ein Betrag eingegeben werden. Der Restbetrag wird an die Geldausgabe geschickt. Das Ticket bekommt einen Bezahl-Timestamp und wird ausgeliefert.



Erstelle ein UML Diagramm und programmiere das Beispiel. 

 

 