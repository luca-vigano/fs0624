package Esercizio3;

import java.util.HashMap;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        Rubrica rubrica = new Rubrica();


        System.out.println("Inserisci un comando ");

        boolean attivo = true;
        while (attivo) {
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Aggiungi contatto");
            System.out.println("2. Elimina contatto");
            System.out.println("3. Stampa rubrica");
            System.out.println("4. Esci");


            int comando = Integer.parseInt(scanner.nextLine());
            switch (comando){
                case 1:
                    rubrica.aggiungiContatto();
                    break;
                case 2:
                    rubrica.eliminaContatto();
                    break;
                case 3:
                    rubrica.stampaRubrica();
                    break;
                case 4:
                    attivo=false;
                    break;
                default:
                    System.out.println("Comando non valido");
            }
        }

    }
}
