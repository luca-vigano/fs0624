package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;

public interface Funzione3 {

    public static void stampaElementi(ArrayList<String> lista, boolean b) {
        if (b) {
            System.out.println("Elementi alle posizioni pari:");
            for (int i = 0; i < lista.size(); i += 2) {
                System.out.println(lista.get(i));
            }
        } else {
            System.out.println("Elementi alle posizioni dispari:");
            for (int i = 1; i < lista.size(); i += 2) {
                System.out.println(lista.get(i));
            }
        }
    }
}
