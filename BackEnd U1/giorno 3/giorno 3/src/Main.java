import esercizio1.Rettangolo;
import esercizio2.Sim;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Stampa rettangolo ");
        Rettangolo r1 = new Rettangolo(20, 5.7);
        stampaRettangolo(r1);
        System.out.println("Stampa due rettangoli");
        Rettangolo r2 = new Rettangolo(12, 40.2);
        stampaDueRettangoli(r1, r2);
    }

    public static void stampaRettangolo(Rettangolo rettangolo) {
        System.out.println("Perimetro rettangolo: " + rettangolo.perimetro());
        System.out.println("Area rettangolo: " + rettangolo.area());
    }

    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {

        System.out.println("esercizio1.Rettangolo 1: ");
        stampaRettangolo(rettangolo1);

        System.out.println("esercizio1.Rettangolo 2: ");
        stampaRettangolo(rettangolo2);

        double sommaAree = rettangolo1.area() + rettangolo2.area();
        double sommaPerimetri = rettangolo1.perimetro() + rettangolo2.perimetro();

        System.out.println("Somma perimetri: ");
        System.out.println(sommaPerimetri);

        System.out.println("Somma aree: ");
        System.out.println(sommaAree);

    }


    Sim s1 = new Sim("333-33333333");



}