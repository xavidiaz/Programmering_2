package Uppgifter_14;

import javax.swing.*;

public class BilTest3 {
    public static void main(String[] arg) {

        Bil[] bil; // Deklarera fältvariabeln
        bil = new Bil[3]; // Skapa utrymet för fältet
//        for(Bil i:bil)
//            bil[i] = new Bil();
        for(int i=0; i< bil.length; i++)  // Skapa ny objekt i fältet
            bil[i] = new Bil();

        bil[0].regNr = "ABC123";
        bil[0].fabrikat = "Citroen XSara Picasso";
        bil[0].årsmodell = 2003;
        bil[0].tjänstevikt = 1360;
        bil[0].effekt = 115;
        bil[1].regNr = "XYZ001";
        bil[1].fabrikat = "Renault Espace";
        bil[1].årsmodell = 2004;
        bil[1].tjänstevikt = 1760;
        bil[1].effekt = 120;
        for(int i=0; i<2; i++){
            JOptionPane.showMessageDialog(null, bil[0].regNr + "\n" + bil[0].fabrikat +
                                                " " + bil[i].årsmodell +
                                                "\ntjänstevikt: " + bil[i].tjänstevikt +
                                                "\nmotoreffekt: " + bil[i].effekt);
        }
    }
}
