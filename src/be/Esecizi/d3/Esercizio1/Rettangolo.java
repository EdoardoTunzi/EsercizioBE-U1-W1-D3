package be.Esecizi.d3.Esercizio1;

public class Rettangolo {
     private double altezza;
     private double larghezza;

     public Rettangolo(double altezza, double larghezza) {
         this.altezza = altezza;
         this.larghezza = larghezza;
     }

     public void stampaRettangolo(Rettangolo rettangoloObj) {
         double area = rettangoloObj.larghezza * rettangoloObj.altezza;
         double perimetro = 2 * (rettangoloObj.larghezza + rettangoloObj.altezza);
         System.out.println("Il perimetro equivale a " + perimetro + " e l'area è di: " + area);
     }

    public void stampaDueRettangoli(Rettangolo rett1, Rettangolo rett2) {
        double area1 = rett1.larghezza * rett1.altezza;
        double area2 = rett2.larghezza * rett2.altezza;
        double perimetro1 = 2 * (rett1.larghezza + rett1.altezza);
        double perimetro2 = 2 * (rett2.larghezza + rett2.altezza);
        double sumArea = area1 + area2;
        double sumPerim = perimetro1 + perimetro2;
        System.out.println("Il perimetro del primo rettangolo equivale a " + perimetro1 + " e l'area è di: " + area1);
        System.out.println("Il perimetro del secondo rettangolo equivale a " + perimetro2 + " e l'area è di: " + area2);
        System.out.println("Il perimetri sommati sono: " + sumPerim + " e l'aree sommate equivalgono a: " + sumArea);
    }
}
