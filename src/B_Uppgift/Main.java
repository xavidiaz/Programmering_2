package B_Uppgift;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // Rubrik
        String rubrik = "kortspel Tjugoett";

        // Initiera Objekt Deck
        Deck    deck = new Deck();

        // Kortet Array spelare
        ArrayList <Card> kort = new ArrayList<Card>();
        int varv = 0; // räkna varv.
        int total = 0; // summa av kortet

        // Kortet Array hem
        ArrayList <Card> kortHem = new ArrayList<Card>();
        int totalHem = 0; // summa av kortet hem

        // String med närvarande kortet
        String nkortet = ""; // Spelare
        String nHemkortet = ""; // Hem

        // String vem vann
        String vinnare = "";

        // källa ico image
        ImageIcon icon = new ImageIcon("src/B_Uppgift/blackjack-card.jpg");

        // SPELAREN

        // kör så länge vill ha flera kort eller total blir över 21
        while (total <= 21){ // Stopp loop spel slut

        // Dialogruta "Ett kort till?"
        int oneCard = JOptionPane.showConfirmDialog(null,
                                                    "<html><b>Ett kort till?</b></html" + nkortet +
                                                    "\n<html><b>" + total + "</b> poäng.</html>",
                                                    rubrik, JOptionPane.YES_NO_OPTION,
                                                    JOptionPane.INFORMATION_MESSAGE, icon);
        // Ett kort till.
        if (oneCard != 0 || total <= 21){
            // Nästan random kort
            Card varKort = deck.drawRandomCard();
            // addera resultat till array varvKort
            kort.add(varKort);
            // addera resultat till nKoret (Dialogruta meddelande)
                nkortet +=  "\n" + kort.get(varv);

            String z = kort.get(varv).toString();  // Card värde till Sting
            int mellanslag =  z.indexOf(" "); // index av första mellanslag

            try{ // om det är heltal
            int kortVarde = Integer.parseInt(z.substring(0, mellanslag));
            total += kortVarde; // summa kortsvärde poäng
            } catch (NumberFormatException e) { // Om det är king, Queen eller Jack.
                String kortVarde = z.substring(0, mellanslag);
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
            varv++; // ökning av varv

        }
//        else {
            // total blev över 21 poäng, avbryt programmet
//            System.out.println("Inga flera kort");
//            System.exit(0); // avbryt programmet
//        }
        }
                System.out.println(total);
            if(total >21){
                // Dialogruta med resultat och vinnare.
                JOptionPane.showMessageDialog(null,
                                              "<html><b>Spelare: </b></html>" + nkortet +
                                              "\n<html><b>" + total + "</b> poäng.</html>" +
                                              "Spelet är över, <br> Lycka till nästa gång!",
                                              rubrik, JOptionPane.INFORMATION_MESSAGE);
                System.exit(0); // avbryt programmet
//                JOptionPane.showMessageDialog(null,
//                                              "<html><b>Spelare: </b></html>" + nkortet +
//                                              "\n<html><b>" + total + "</b> poäng.</html>" +
//                                              "Spelet är över, <br> Lycka till nästa gång!",
//                                              rubrik, JOptionPane.INFORMATION_MESSAGE, icon
//                );
                System.out.println("here");
            }

        // HEM

        // Ett kort till tills hem får fler poäng än spelare eller mer än 17
        while(total > totalHem && totalHem < 18) {
            // Nästan random kort
            Card varKort = deck.drawRandomCard();
            // addera resultat till array varvKort
            kort.add(varKort);
            // addera resultat till nHemkortet (Dialogruta meddelande)
            nHemkortet += "\n" + kort.get(varv);

            String z          = kort.get(varv).toString();  // Card värde till Sting
            int    mellanslag = z.indexOf(" "); // index av första mellanslag

            try { // om det är heltal
                int kortVarde = Integer.parseInt(z.substring(0, mellanslag));
                totalHem += kortVarde; // summa kortsvärde poäng
            } catch (NumberFormatException e) { // Om det är king, Queen eller Jack.
                String kortVarde = z.substring(0, mellanslag);
                if (kortVarde.equals("king") || kortVarde.equals("Queen") || kortVarde.equals("Jack")) {
                    totalHem += 10; // summa tio poäng
                } else if (kortVarde.equals("Ace")) {
                    totalHem++; // summa en poäng
                } else {
                    int skillnad = 21 - totalHem; // skillnad till 21
                    if (skillnad > 10) {
                        totalHem += 10; // summa tio poäng, maximal värde på Jack
                    } else {
                        totalHem += skillnad; // summa tills 21, Black Jack
                    }
                }
            }

            // Olika meddelande beroende av totalt vs totalHem
            if (totalHem > 21 && total <= 21) {
                vinnare = "Hem hade otur <br><b>GRATTIS!</b><br>Du vann!";
            } else if (total == totalHem || total < totalHem) {
                vinnare = "Spelet är över, <br> Lycka till nästa gång!";
            } else {
                vinnare = "GRATTIS!<br>Du vann!";
            }
       }
        // Dialogruta med resultat och vinnare.
        JOptionPane.showMessageDialog(null,
                                      "<html><b>Spelare: </b></html>" + nkortet +
                                      "\n<html><b>" + total + "</b> poäng.</html>" +
                                      "\n\n<html><b>Hem: </html>" + nHemkortet +
                                      "\n<html><b>" + totalHem + "</b> poäng.</html>\n" +
                                      "\n<html><b>" + vinnare + "</b></html>",
                                      rubrik, JOptionPane.INFORMATION_MESSAGE, icon
        );
        }
    }
