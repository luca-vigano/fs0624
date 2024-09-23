public class Main3 {

    public static void main(String[] args) {

        perimetroRettangolo(12, 21);
        pariDispari(24);
        perimetroTriangolo(10, 12, 11);

    }

    public static double perimetroRettangolo(double l1, double l2) {
        return l1 + l2 + l2 + l2;
    }

    public static double pariDispari(int num) {
        return num % 2 == 0 ? 0 : 1;
    }

    public static double perimetroTriangolo(double l1, double l2, double l3) {
        double semiperimetro = (l1 + l2 + l3) / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - l1) * (semiperimetro - l2) * (semiperimetro - l3));
    }
}
