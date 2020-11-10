package B_Uppgift;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    // Deklarera ArrayList för kortet
    private ArrayList <Card> cards;

    // Deck method
    public Deck()
    {
        // Initiera ArrayList för kortet
        cards = new ArrayList<Card>();

        // a lopp är de olika typkot
        for(int a =0; a<4; a++) // sviter, 4 styckar
        {
            // b loop är kortet från 0 till 12
            for(int b =0; b<=12;b++) // kortet per stycke
            {
                // addera kortet till ArrayList Cards
                cards.add(new Card(a,b));
            }
        }
    }

    // drawRandomCard method,
    // välja en random kort av ArrayList cards och samtidigt radera från index
    public Card drawRandomCard()
    {
        Random generator = new Random();
        int    index     = generator.nextInt(cards.size());
        return cards.remove(index);
    }

}
