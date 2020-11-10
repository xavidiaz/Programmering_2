package B_Uppgift;

// Card class
public class Card {
    private int type, value;
    // ArrayList med olika kortet
    private String[] cardType = {"Clubs", "Spades", "Diamonds", "Hearts"};
    private String[] cardValue = {"Ace", "King", "Queen", "Jack", "10",
                                  "9", "8", "7", "6", "5", "4", "3", "2"};

    // metoder

    // Instansieras kort typ och värde
    public Card(int types, int values) {
        type = types;
        value = values;
    }

    // returnera den valda kort
    public String toString() {
        return cardValue[value] + " of " + cardType[type];
    }
}
