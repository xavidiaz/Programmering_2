package B_Uppgift;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
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

        // SPELARE
        while (total <= 21){ // spelas tills blir 21 eller avbrott
        int oneCard = JOptionPane.showConfirmDialog(null,
                                                    "<html><b>Ett kort till?</b></html" + nkortet +
                                                    "\n<html><b>" + total + "</b> poäng.</html>",
                                                    rubrik, JOptionPane.YES_NO_OPTION,
                                                    JOptionPane.INFORMATION_MESSAGE, icon);

            if (oneCard == 1) // Inga flera kort till
                break;
            else {

                // Nästan random kort
                Card varKort = deck.drawRandomCard();

                // addera resultat till array varvKort
                kort.add(varKort);
                // addera resultat till nKoret (Dialogruta meddelande)
                nkortet +=  "\n" + kort.get(varv);

                tolkaKort(); // tolkning av kort + öka ett varv
                varv++; // åka varv
            }
        }

        // HUSET
        // Nyt kort so länge huset int får högre total eller över 17
            varv = 0; // nollställ räkna varv.
        while (totalHuset <= 17 && totalHuset < total){
            // Nästan random kort
            Card varKort = deck.drawRandomCard();

            // addera resultat till array varvKort
            kortHuset.add(varKort);
            // addera resultat till nHemkortet (Dialogruta meddelande)
            nHuskortet += "\n" + kortHuset.get(varv);

            tolkaKortH(); // tolkning av kort + öka ett varv
            varv++; // åka varv
        }

        // DIALOGRUTA VINNARE
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

            if(totalHuset >= total && totalHuset <= 21){ // Samma poäng elle lika huset vinner
                meddelande = "huset vinner";
            } else {
                meddelande = "Grattis!\n<html>du vann.";
            }

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

    private static void tolkaKort() {
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
    private static void tolkaKortH() {
        String str = kortHuset.get(varv).toString();  // Card värde till Sting
        int mellanslag =  str.indexOf(" "); // index av första mellanslag

        try{ // om det är heltal
            int kortVarde = Integer.parseInt(str.substring(0, mellanslag));
            totalHuset += kortVarde; // summa kortsvärde poäng
        } catch (NumberFormatException e) { // Om det är king, Queen eller Jack.
            String kortVarde = str.substring(0, mellanslag);
            if (kortVarde.equals("king") || kortVarde.equals("Queen") || kortVarde.equals("Jack")){
                totalHuset += 10; // summa tio poäng
            } else if(kortVarde.equals("Ace")){
                totalHuset++; // summa en poäng
            } else {
                int skillnad = 21 - totalHuset; // skillnad till 21
                if(skillnad > 10){
                    totalHuset += 10; // summa tio poäng, maximal värde på Jack
                } else {
                    totalHuset += skillnad; // summa tills 21, Black Jack
                }
            }
        }
    }
}
