package Esercizio2;

import java.util.ArrayList;
import static Esercizio2.Funzione2.lista;
import static Esercizio2.Funzione3.stampaElementi;
public class Main2 {
    public static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti numeri casuali vuoi generare?");
        int num = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> numeriOrdinati = randomNumGenerator(num);
        System.out.println("Numeri casuali unici ordinati: " + numeriOrdinati);
        */


        ArrayList<Integer> listaOriginale = new ArrayList<>();
        listaOriginale.add(1);
        listaOriginale.add(2);
        listaOriginale.add(3);
        listaOriginale.add(4);
        listaOriginale.add(5);

        ArrayList<Integer> listaRisultato = lista(listaOriginale);
        System.out.println("Lista con l'ordine inverso: " + listaRisultato);

        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.add("F");

        stampaElementi(lista, true);
        stampaElementi(lista, false);
    }




}
