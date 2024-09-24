public class Main {
    public static void main(String[] args) {

        System.out.println(pariDispari("ciao!"));


        System.out.println(isBisestile(2020));
        System.out.println(isBisestile(1900));
        System.out.println(isBisestile(2000));
        System.out.println(isBisestile(2021));

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

}