package B_Uppgift;

public class Card {
    private int type, value;
    private String[] cardType = {"Clubs", "Spades", "Diamonds", "Hearts"};
    private String[] cardValue = {"Ace", "King", "Queen", "Jack", "10",
                                  "9", "8", "7", "6", "5", "4", "3", "2"};

    public Card(int types, int values)
    {
        type = types;
        value = values;
    }

    public String toString()
    {
        String finalCard = cardValue[value] + " of " + cardType[type];

        return finalCard;
    }
}
