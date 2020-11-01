package Uppgifter;
import java.io.*;

/**
 * 7 .Hur lägger man data i en befintlig textfil?
 * Visa ett exempel (källkod)
 *
 * Man kan läsa text av filen med readLine()
 *
 * */
public class sju {
    public static void main(String[] arg) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // läser skrivna text från filen.
        String textInput = input.readLine(); // spara text i variabeln

        String nyText = arg[0]; // spara argument text i variabeln

        textToFile(textInput, nyText); // metod skriva ut ny fil NyFil.txt
    }
    public static void textToFile(String textInput, String nyText)
            throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("NyFil.txt"));
        writer.write(textInput + " " + nyText);

        writer.close();
    }
}