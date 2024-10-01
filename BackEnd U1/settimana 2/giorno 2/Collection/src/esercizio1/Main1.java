package esercizio1;


import java.util.HashSet;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire un numero intero > di 0:");
        int num = Integer.parseInt(scanner.nextLine());
        HashSet<String> stringList = new HashSet<>();
        HashSet<String> stringDuplicateList = new HashSet<>();

        for (int i = 0; i < num; i++) {
            System.out.println("Inserire una parola:");
            String word = scanner.nextLine();
            if(!stringList.add(word)){
                stringDuplicateList.add(word);
            }

        }

        System.out.println("Parole inserite: " + stringList);
        System.out.println("Numero parole inserite: " + stringList.size());
        if(!stringDuplicateList.isEmpty()) {
        System.out.println("Parole duplicate: " + stringDuplicateList);

        }
    }
}
