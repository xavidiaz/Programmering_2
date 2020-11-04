package Uppgifter_3;

import java.util.Random;
import java.util.Scanner;

/**
 *  Skapa ett program som simulerar tärningskast!
 *
 * A) Skriv en klassmetod som skapar en array med 100 platser.
 * Kalla metoden dice()
 * Fyll arrayen med slumptal mellan 1 och 6.
 * Returnera arrayen.
 */

public class o5 {
    public static void main (String[] args){

        // skapa Scanner object
        Scanner input = new Scanner(System.in);
        int antal     = 0;
        try{
            // Meddelande
            System.out.println("Tärningskast \nSkrin in antal kast:");

            // Läsa input
            antal = Integer.parseInt(input.nextLine());
            System.out.println("Det blir:");

            // Om text inlagg är inte heltal
        } catch (Exception ignore){
            System.out.println("Felt värdet! Du skulle skriva ett heltal");
        }


        // Kalla metoden dice() och skriva Ut
        skrivUt(dice(antal));

    }

    /**
     * Simulera random tärningskaster.
     * @param antal tärningskaster
     * @return array med log av kaster
     */
    private static int[] dice(int antal) {
        // skapa array
        int [] arr = new int[antal];

        // Instaniera Random klass
        Random rand = new Random();

        // Itererar för att simulera flera tärningskast
        for(int i=0; i<antal; i++){
            // tärningskastet
            int tarn1 = rand.nextInt(5)+1;
            int tarn2 = rand.nextInt(5)+1;
            // Spara i array
            arr[i] = tarn1 + tarn2;
        }

        return arr;
    }

    /**
     * Skriva ut array
     * @param arr att skriva ut
     */
    private static void skrivUt(int[] arr) {
        for(int i:arr)
            System.out.print(i + ", ");
    }

}
