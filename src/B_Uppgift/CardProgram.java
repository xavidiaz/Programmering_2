package B_Uppgift;

import java.util.Scanner;

public class CardProgram {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Card    C;
        Deck    deck = new Deck();

        System.out.println("Enter number of cards to be dealt: ");
        int numberCards = scan.nextInt();

        System.out.println("Cards drawn: ");
        for(int i=0; i<numberCards; i++)
        {
            C = deck.drawRandomCard();
            System.out.println(C.toString());
        }

        //C = deck.toString();
        //System.out.println(cards.toString());
        // System.out.println(C.toString());


    }
}
