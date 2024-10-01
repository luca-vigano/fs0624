package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public interface Generator{

    public static ArrayList<Integer> randomNumGenerator(int num) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        while (uniqueNumbers.size() < num) {
            int randomNumber = (int) (Math.random() * 100) + 1;
            uniqueNumbers.add(randomNumber);
        }

        ArrayList<Integer> sortedNumbers = new ArrayList<>(uniqueNumbers);

        Collections.sort(sortedNumbers);

        return sortedNumbers;
    }

}
