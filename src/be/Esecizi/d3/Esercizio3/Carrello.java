package be.Esecizi.d3.Esercizio3;

public class Carrello {
    private String clienteAssociato;
    private Articolo[] articoli;
    private double totCostArticoli;

    public Carrello(String clienteAssociato, Articolo[] articoli, double totCostArticoli) {
        this.clienteAssociato = clienteAssociato;
        this.articoli = articoli;
        this.totCostArticoli = totCostArticoli;
    }
}
