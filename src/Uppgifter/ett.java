package Uppgifter;

import javax.swing.*;

/**
 * Skapa en klassmetod som räknar hur många gånger ett visst tecken finns i en sträng.
 * Om man t.ex. har variabeln test av typen String och vill veta hur många gånger bokstaven ’t’ förekommer i texten kan man skriva
 *       String test = "Lite test text.";
 *       int antal = antalTecken(test, 't');
 * Skriv ett testprogram och testkör din klassmetod med olika strängar.
 * Ta även några skärmbilder och klistra in i Google-dokumentet.
 */
public class ett {
    public static final String  rubrik = "Räknar anta gånger ett visst tecken finns i en sträng";

public static void main(String[] args){
    String iText = JOptionPane.showInputDialog(null,
            "Skriv text här:",
            rubrik, JOptionPane.INFORMATION_MESSAGE);
    String iBokstaven = JOptionPane.showInputDialog(null,
            "Skriv bokstaven här:",
            rubrik, JOptionPane.INFORMATION_MESSAGE);

rakna(iText,iBokstaven);
}
public static void rakna(String text, String iBokstaven){
    int nBokstaver = 0;

        if(!text.contains(iBokstaven))
            JOptionPane.showMessageDialog(null,
                    "Finns inga " + iBokstaven+ " i stäng",
                    rubrik, JOptionPane.INFORMATION_MESSAGE);
        else{
            int indexBokstave = 0;
            while(indexBokstave < text.lastIndexOf(iBokstaven)){
                indexBokstave = text.indexOf(iBokstaven, indexBokstave);
                indexBokstave++;
                nBokstaver++;
            }
            JOptionPane.showMessageDialog(null,
                    "Bokstaven '" + iBokstaven + "' förekommer i texten " + nBokstaver + " gånger.",
                    rubrik, JOptionPane.INFORMATION_MESSAGE);
        }
}
}
