package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti numeri casuali vuoi generare?");
        int num = Integer.parseInt(scanner.nextLine());
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        while (uniqueNumbers.size() < num) {
            int randomNumber = (int) (Math.random() * 100) + 1;
            uniqueNumbers.add(randomNumber);
        }

        ArrayList<Integer> sortedNumbers = new ArrayList<>(uniqueNumbers);

        Collections.sort(sortedNumbers);
        System.out.println("Numeri casuali unici ordinati: " + sortedNumbers);

    }
}
