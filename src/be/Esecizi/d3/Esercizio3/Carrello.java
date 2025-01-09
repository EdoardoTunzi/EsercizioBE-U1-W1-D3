package be.Esecizi.d3.Esercizio3;

public class Carrello {
    private Cliente clienteAssociato;
    private Articolo[] articoli;
    private double totCostArticoli;

    public Carrello(Cliente clienteAssociato, Articolo[] articoli, double totCostArticoli) {
        this.clienteAssociato = clienteAssociato;
        this.articoli = articoli;
        this.totCostArticoli = totCostArticoli;
    }
}
