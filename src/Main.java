import be.Esecizi.d3.Esercizio1.Rettangolo;

public class Main {
    public static void main(String[] args) {
        //Esercizio1
       Rettangolo ret1 = new Rettangolo(13.2,34.5);
       Rettangolo ret2 = new Rettangolo(22.2,48.5);
       ret1.stampaRettangolo(ret1);
       ret2.stampaDueRettangoli(ret1, ret2);
    }
}