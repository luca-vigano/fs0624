public class Main {
    public static void main(String[] args) {
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