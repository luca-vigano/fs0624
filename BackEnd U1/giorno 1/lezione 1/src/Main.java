import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("esercizio 1");
        int resMoliplica = moltiplica(5, 3);
        System.out.println("risultato moltiplicazione: " + resMoliplica);

        String resConcatena = concatena("pippo", 35);
        System.out.println(resConcatena);

        String[] arr = {"pippo", "pluto", "paperino", "topolino", "ziopaperone"};
        String[] newArr = inserisciInArray(arr, "minnie");
        System.out.println(Arrays.toString(newArr));
    }

    public static int moltiplica(int x, int y) {
        return x * y;
    }

    public static String concatena(String name, int age) {
        return "Ciao" + name + "ho" + age + "anni";
    }

    public static String[] inserisciInArray(String[] arr, String str) {
        String[] arrStr = new String[6];
        arrStr[0] = arr[0];
        arrStr[1] = arr[1];
        arrStr[2] = str;
        arrStr[3] = arr[2];
        arrStr[4] = arr[3];
        arrStr[5] = arr[4];

        return arrStr;
    }


}