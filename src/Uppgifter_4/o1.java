package Uppgifter_4;

/**
 * Vad är skillnaden mellan en klass och ett objekt?
 * Förklara utförligt.
 * Visa några exempel (källkod)
 *
 * En klass är en utkast från man kan skapa en instans
 * eller objekt. Klasser är logiska enheter. Man får använda
 * klasser för att sammansatta liknande data. Klasser ta
 * inget yta i minne när skapas dem. Man deklarerar klasser en
 * enda gång.
 *
 * En Objekt är en instans av den valda klass. Objekter är logiska
 * enheter Vilken kan bli ändras med metoder av
 * själva klassen. Objekter ta yta i minne när skapas den. Man
 * kan deklareras så många objekter som man behövs.
 */

class o1 {
    public static void main(String[] args){
        // Instansiera objekter
        // volvo
        Bil volvo = new Bil();
        volvo.color = "vit";
        volvo.year = 2015;

        // sabb
        Bil sabb = new Bil();
        volvo.color = "grå";
        volvo.year = 2013;
    }

    // deklarera klassen Bil
    static class Bil{
    String color;
    int year;
    }
    }
