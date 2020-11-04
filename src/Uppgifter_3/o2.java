package Uppgifter_3;

/**
 * Hur indexeras en array?
 * Förklara och skriv exempel (källkod).
 *
 * Indexering börjar alltid på 0, det första värdet får index 0. Andra värdet får index 1 och så vidare.
 * Index värdet plaseras mellan [...] – hakparentes.
 */

public class o2 {
    public static void main (String[] args){
        int [] arr1 = {5, 4, 3};
        System.out.println(arr1[0]); // Det blir 5
        System.out.println(arr1[1]); // Det blir 4
        System.out.println(arr1[3]); // Det blir 3
    }
}
