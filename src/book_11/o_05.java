package book_11;

import javax.swing.*;

/**
 * Skriv ett proggram som skapar två fält med heltal. Det första fältet skall heta
 * a och ha 100 komponenter. Initiera fältet så att den första komponenten
 * innehåller värdet 0, den andra värdet 1 oxh. Använd en for-sats. Det andra
 * fältet skall heta b och ha längden 20. Du behöver inte initiera detta fält.
 * Skriv en for-sats som kopierar komponenterna med index nummer 50 till
 * 54 i a till platserna 10 till 14 i b. Använd sedan metoden System.arraycopy för
 * att kopiera komponenterna med index 95 till 99 i a till platserna 5
 * till 9 i b. Lögg sist i programmet in for-sats- som skriver ut hela fältet b.
 */
public class o_05 {
    public static void main (String[] args){
        // fältet a 100 komponenter
        int [] a = new int[100];

        // UTFÖRAS
        for(int i = 0; i < a.length; i++){
            a[i]=i;
        }

//        // EJ UTFÖRAS
//        for (int i : a)
//            a[i]=i;

        // fältet b 20 komponenter
        int [] b = new int[20];

        // kopierar komponenterna med index nummer 50 till
        // 54 i a till platserna 10 till 14 i b.
        for(int i=50; i<55; i++){
            b[i-40] = a[i];
        }

        // kopierar komponenterna med index nummer 95 till
        // 99 i a till platserna 5 till 9 i b.
        System.arraycopy(a, 95, b, 5, 5);

printArray(b);
    }
    public static void printArray(int[] arr){
        for (int j : arr)
            System.out.println(j);
    }
}

