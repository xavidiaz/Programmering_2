package B_Uppgift;

import javax.swing.*;
import java.util.ArrayList;

public class Main2 {
    // Fönster rubrik
    static String rubrik = "kortspel Tjugoett";

    // total poäng
    static int total = 0; // spelare
    static int totalHuset = 0; //  huset

    static int varv = 0; // räkna varv.

    // Närvarade kortet
    static String nkortet = ""; // spelare
    static String nHuskortet = ""; // huset

    // källa ico image
    static ImageIcon icon = new ImageIcon("src/B_Uppgift/blackjack-card.jpg");

    // Initiera Objekt Deck
    static Deck    deck = new Deck();

    // Kortet Array
    static ArrayList <Card> kort = new ArrayList<Card>(); // Spelare
    static ArrayList <Card> kortHuset = new ArrayList<Card>(); // Huset

    // KÖRNING
    public static void main(String[] args){
        while (total <= 21){ // spelas tills blir 21 eller avbrott
        int oneCard = JOptionPane.showConfirmDialog(null,
                                                    "<html><b>Ett kort till?</b></html" + nkortet +
                                                    "\n<html><b>" + total + "</b> poäng.</html>",
                                                    rubrik, JOptionPane.YES_NO_OPTION,
                                                    JOptionPane.INFORMATION_MESSAGE, icon);

            if (oneCard == 1) // Inga flera kort till
                break;
            else {
                System.out.println("ett kort till"); // ett kort till

                // Nästan random kort
                Card varKort = deck.drawRandomCard();
                // addera resultat till array varvKort
                kort.add(varKort);
                // addera resultat till nKoret (Dialogruta meddelande)
                nkortet +=  "\n" + kort.get(varv);
                System.out.println(kort);

                tolkaKort(varv++); // tolkning av kort + öka ett varv

                System.out.println(total);
            }
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

    private static void tolkaKort(int varv) {
        String str = kort.get(varv).toString();  // Card värde till Sting
        int mellanslag =  str.indexOf(" "); // index av första mellanslag

        try{ // om det är heltal
            int kortVarde = Integer.parseInt(str.substring(0, mellanslag));
            total += kortVarde; // summa kortsvärde poäng
        } catch (NumberFormatException e) { // Om det är king, Queen eller Jack.
            String kortVarde = str.substring(0, mellanslag);
            if (kortVarde.equals("king") || kortVarde.equals("Queen") || kortVarde.equals("Jack")){
                total += 10; // summa tio poäng
            } else if(kortVarde.equals("Ace")){
                total++; // summa en poäng
            } else {
                int skillnad = 21 - total; // skillnad till 21
                if(skillnad > 10){
                    total += 10; // summa tio poäng, maximal värde på Jack
                } else {
                    total += skillnad; // summa tills 21, Black Jack
                }
            }
        }
        // varv++; // ökning av varv
    }

}
