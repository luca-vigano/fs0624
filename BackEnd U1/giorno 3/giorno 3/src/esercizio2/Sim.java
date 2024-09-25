package esercizio2;

public class Sim {

    private String numero;
    private double credito;
    private Chiamata[] chiamata;


    public Sim(String numero) {
        this.numero = numero;
        this.credito= 0;
        this.chiamata= new Chiamata[5];
    }

    public void stampaDatiSim () {
        System.out.println("Sim numero: " + this.numero);
        System.out.println("Sim credito: " + this.credito);
        System.out.println("Lista chiamate: " + this.credito);
        for(int i=0; i<this.chiamata.length; i++) {
            if(this.chiamata[i] != null){
            System.out.println("            " + this.chiamata[i].getNumeroChiamata());
        }}
    }

}
