package org.lessons.java.geometria;

public class Rettangolo {
    /*una classe Rettangolo con due attributi interi:
    base e altezza.
    Aggiungere un opportuno costruttore con parametri.
    Aggiungere due metodi:
    calcolaArea e calcolaPerimetro che calcolano e restituiscono,
    rispettivamente, l’area e il perimetro del rettangolo.
     */
    int base;
    int altezza;

    Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    int calcolaArea(){
        return base * altezza;
    }

    int calcolaPerimetro(){
        return (base * altezza)*2;
    }
}
