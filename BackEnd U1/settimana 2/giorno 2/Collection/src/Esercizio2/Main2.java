package Esercizio2;

import java.util.ArrayList;
import static Esercizio2.Funzione2.lista;
import static Esercizio2.Funzione3.funzione3;
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

        boolean b =true;
        ArrayList<Integer> pariDispari = funzione3(listaOriginale, b);
        ArrayList<Integer> listaRisultato = lista(listaOriginale);

        System.out.println("Lista con l'ordine inverso: " + listaRisultato);
        System.out.println("Lista con l'ordine inverso: " + pariDispari);
    }




}
