import be.Esecizi.d3.Esercizio1.Rettangolo;
import be.Esecizi.d3.Esercizio2.SIM;

public class Main {
    public static void main(String[] args) {
        //Esercizio1
       Rettangolo ret1 = new Rettangolo(13.2,34.5);
       Rettangolo ret2 = new Rettangolo(22.2,48.5);
       ret1.stampaRettangolo(ret1);
       ret2.stampaDueRettangoli(ret1, ret2);

       //Esercizio2
        SIM sim1 = new SIM("3456021981");
        sim1.addCredit(25);
        sim1.addCall("3:23", "3326594789");
        sim1.printInfoSim();
    }
}