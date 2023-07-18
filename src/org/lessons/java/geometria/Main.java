package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Creare una classe Main contenente il metodo main(),
        nel quale chiedete all’utente di inserire, da console,
        i valori di base e di altezza con cui istanziare un nuovo Rettangolo.
         Dopo averlo istanziato, stampate a video il perimetro e l’area.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("quanto misura la base del rettangolo ?");
        int baseUtente = scan.nextInt();
        System.out.println("quanto misura l'altezza del rettangolo ?");
        int altezzaUtente =scan.nextInt();


        Rettangolo r = new Rettangolo(baseUtente, altezzaUtente);

        System.out.println("l'area è uguale a: " + r.calcolaArea());
        System.out.println("il perimetro è uguale a: " + r.calcolaPerimetro());

    }
}
