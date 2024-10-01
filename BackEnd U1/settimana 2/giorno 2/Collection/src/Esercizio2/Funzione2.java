package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;

public interface Funzione2 {


    public static ArrayList<Integer> lista(ArrayList<Integer> originalList) {

        ArrayList<Integer> newList = new ArrayList<>(originalList);

        ArrayList<Integer> reversedList = new ArrayList<>(originalList);
        Collections.reverse(reversedList);

        newList.addAll(reversedList);

        return newList;
    }
}
