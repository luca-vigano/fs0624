package Esercizio3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Rubrica {

    Scanner scanner = new Scanner(System.in);

    public HashMap<String, Integer> rubrica = new HashMap<>();



    public void eliminaContatto() {
        System.out.println("Inserisci il nome del contatto da eliminare:");
        String nomeContatto = scanner.nextLine();
        if (rubrica.remove(nomeContatto) != null) {
            System.out.println("Contatto rimosso: " + nomeContatto);
        } else {
            System.out.println("Nessun contatto trovato con il nome: " + nomeContatto);
        }
    }


    public void aggiungiContatto() {
        System.out.println("Inserisci il nome del contatto:");
        String nomeContatto = scanner.nextLine();
        System.out.println("Inserisci il numero di telefono del contatto:");
        Integer numeroContatto = Integer.parseInt(scanner.nextLine());
        rubrica.put(nomeContatto, numeroContatto);
        System.out.println("Contatto aggiunto: " + nomeContatto + " - " + numeroContatto);
    }

    public void stampaRubrica() {
        System.out.println("Rubrica:");
        Set <String> nomiRubrica = rubrica.keySet();
        for (String nome :nomiRubrica) {
            System.out.println("Nome contatto: " + nome +  " - numero" + rubrica.get(nome));
        }
    }


}
