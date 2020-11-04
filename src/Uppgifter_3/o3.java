package Uppgifter_3;

/**
 * Du kan kopiera arrayer i Java på många olika sätt.
 * Skriv några exempel (källkod)
 */

public class o3 {
    public static void main (String[] args){
        double [] arr3 = {1.4, 3.4, 54.4};
        double [] arr1 = new double[5];
        double [] arr2 = new double[5];

        System.out.println("\nExempel ett:");
        kopyArray(arr3, 1, arr1, 2);
        skrivUt(arr1);

        System.out.println("\nExempel tva: ");
        System.arraycopy(arr3, 0, arr2, 0, 3);
        skrivUt(arr2);
    }

    private static void skrivUt(double[] arr) {
        for(double i:arr)
            System.out.println(i);
    }

    private static void kopyArray(double[] fran, int indexF, double[] till, int antal) {
        for(int i=indexF; i<=antal; i++)
            till[i] = fran[i];
    }

}
