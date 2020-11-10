package Uppgifter_4;

/**
 *  Undersök följande klass...
 */

    // Vad blir utskriften när klassen MainClass nedan exekveras?

public class MainClass {

    // 'man' principela metoden vilken utföras koden
    public static void main( String[] args) {

        C theObject = new C(); // Instansiera 'theObject' som objekt av 'C' klassen
        theObject.init(); // instasiera egenskap 'theObject.count' med värdet '1' // theObject.count = 1
        theObject.increment(); // ökar det aktuella värdet av 'theObject.count' med en enhet. // theObject.count = 2
        theObject.increment();  // ökar det aktuella värdet av 'theObject.count' med en enhet. // theObject.count = 3

        // Skriver ut i kommandofönster return värde av 'theObject.count' // 3
        System.out.println(theObject.getCount());

    }
}

// Deklarera klass C
class C {
    // engenskap
private int count;  // deklareras integer count. För att kunna ändras skall behöva man följande metoder eftersom blev deklarerades 'private'.

    // metoder
public void init() {
               count = 1;
               }  // instansiera count med värde '1'
public void increment() {
               count = count + 1;
               } // ökar det aktuella värdet av 'count' med en enhet.
public int getCount() {
               return count;
               }  // returnera 'count' värde.
}
