package be.Esecizi.d3.Esercizio2;

import java.util.ArrayList;

public class SIM {
    private String numeroTel;
    private int credito = 0;
    private ArrayList<String> listaChiamate;

    public SIM(String numeroTel) {
        this.numeroTel = numeroTel;
        this.listaChiamate = new ArrayList<>();
    }

    public void addCall(String call) {
        this.listaChiamate.add(call);
    }
    public void addCredit(int amount) {
        this.credito += amount;
    }

    public void printInfoSim() {
        System.out.println("Il numero di telefono e: " + numeroTel);
        System.out.println("Credito residuo: " + credito + "euro");
        System.out.println("Lista chiamate: " + listaChiamate);
    }
}
