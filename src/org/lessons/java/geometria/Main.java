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
        int baseUtente = scan.nextInt();
        int altezzaUtente =scan.nextInt();


        Rettangolo r = new Rettangolo(baseUtente, altezzaUtente);
    }
}
