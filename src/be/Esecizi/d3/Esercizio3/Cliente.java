package be.Esecizi.d3.Esercizio3;

import java.util.Date;

public class Cliente {
    private String codice;
    private String nome;
    private String cognome;
    private String email;
    private String dataIscrizione;

    public Cliente(String codice, String nome, String cognome, String email, String dataIscrizione) {
        this.codice = codice;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }
}
