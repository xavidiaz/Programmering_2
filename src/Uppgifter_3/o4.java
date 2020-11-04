package Uppgifter_3;

/**
 * Varför får man inte använda operatorn == vid jämförelse av två arrayer?
 * Hur måste man göra för att jämföra om två arrayer innehåller samma data?
 * Förklara och visa ett exempel.
 *
 * Eftersom man kopiera referens till fältet, ej innehåle med värdet.
 * Man måste iterera i själva arrayer för att kopieras till annat array.
 */

public class o4 {
    public static void main (String[] args){
        double [] arr3 = {1.4, 3.4, 54.4};
        double [] arr1 = new double[5];

        // Rätt
        System.out.println("\nRätt kopierad:");
        kopyArray(arr3, 1, arr1, 2);
        // Nu när man ändra arr1 ändra också arr3
        arr1[1] = 8;
        System.out.println("\nArray 3: ");
        skrivUt(arr3);
        System.out.println("\nArray 1: ");
        skrivUt(arr1);

        System.out.println("\nFelt! När man ändra arr1 ändra också arr3 ocho kopiera inte bara den önskade värden");
        // Felt
        arr1 = arr3;
        // Nu när man ändra arr1 ändra också arr3
        arr1[1] = 8;
        System.out.println("\nArray 3: ");
        skrivUt(arr3);
        System.out.println("\nArray 1: ");
        skrivUt(arr1);
    }

    // Rätt
    private static void kopyArray(double[] fran, int indexF, double[] till, int antal) {
        for(int i=indexF; i<=antal; i++)
            till[i] = fran[i];
    }

    private static void skrivUt(double[] arr) {
        for(double i:arr)
            System.out.println(i);
    }
}
