package B_Uppgift;

import javax.swing.*;
import java.util.ArrayList;

public class Main2 {
    // Fönster rubrik
    static String rubrik = "kortspel Tjugoett";

    // total poäng
    static int total = 0; // spelare
    static int totalHuset = 0; //  huset

    // Närvarade kortet
    static String nkortet = ""; // spelare
    static String nHuskortet = ""; // huset

    // källa ico image
    static ImageIcon icon = new ImageIcon("src/B_Uppgift/blackjack-card.jpg");


    public static void main(String[] args){
        while (total <= 21){ // spelas tills blir 21 eller avbrott
        int oneCard = JOptionPane.showConfirmDialog(null,
                                                    "<html><b>Ett kort till?</b></html" + nkortet +
                                                    "\n<html><b>" + total + "</b> poäng.</html>",
                                                    rubrik, JOptionPane.YES_NO_OPTION,
                                                    JOptionPane.INFORMATION_MESSAGE, icon);
        total = total + 10;
        // Inga flera kort till
            if (oneCard == 1)
                break;
        }

        if(total >21){ // över poäng huset vinner
        JOptionPane.showMessageDialog(null,
                                      "<html><b>" + total + "</b> poäng." +
                                      "<br><b>Spelet är över</b>," +
                                      "<br><br><b>Huset vinner</b>" +
                                      "<br> <em>Lycka till nästa gång!</em></html>",
                                      rubrik,
                                      JOptionPane.INFORMATION_MESSAGE, icon);

        } else { // tid för huset börja spela
            String meddelande;
            total = 21;
            totalHuset = 20;

            if(totalHuset >= total && totalHuset <= 21){ // Samma poäng elle lika huset vinner
                meddelande = "huset vinner";
            } else {
                meddelande = "Grattis!\n<html>du vann.";
            }

            // Dialog ruta med vinnare
            System.out.println("Under 21");
            // Dialogruta med resultat och vinnare.
            JOptionPane.showMessageDialog(null,
                                          "<html><b>Spelare: </b>" + nkortet +
                                          "\n<html><b>" + total + "</b> poäng." +
                                          "\n\n<html><b>Huset: </b>" + nHuskortet +
                                          "\n<html><b>" + totalHuset + "</b> poäng." +
                                          "\n\n<html><b>" + meddelande + "</b>",
                                          rubrik, JOptionPane.INFORMATION_MESSAGE, icon);
        }

    }

    }
