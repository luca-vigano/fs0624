public class Main {
    public static void main(String[] args) {


        System.out.println("ESERCIZIO 1");
        System.out.println(pariDispari("ciao!"));

        System.out.println("ESERCIZIO 2");
        System.out.println(isBisestile(2020));
        System.out.println(isBisestile(1900));

        System.out.println("ESERCIZIO 3");
        System.out.println(str(0));

        System.out.println("ESERCIZIO 4");

    }


    public static String pariDispari (String str) {
        if(str.length() % 2 == 0) {
            return "True";
        } else {
        return "False";
    }}


    public static boolean isBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                if (anno % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static String str (int num) {
        switch (num){
            case 0:
                return "Zero";
            case 1:
                return "Uno";
            case 2:
                return "Due";
            case 3:
                return "Tre";
            default:
                return "inserire un numero tra 0 e 3";
        }
    }
}