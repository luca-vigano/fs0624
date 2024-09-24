import java.util.Scanner;

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
        String input = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Scrivi una stringa");
            input = scanner.nextLine();
            String[] caratteri = input.split("");
            System.out.println(String.join(",", caratteri));
        } while (!input.equals(":q"));
        scanner.close();
        System.out.println("Exit");



        System.out.println("ESERCIZIO 5");

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire un numero seguito dal tasto Invio");
        int inputNumber = scan.nextInt();
        countDown(inputNumber);
        scan.close();


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


    public static void countDown (int num) {
        System.out.println("Conto alla rovescia da " + num + " a 0");

        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }

    }

}