package Uppgifter;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 4. Hur formaterar man utskrifter i Java?
 *  Skriv ut ett tal med två decimaler i terminalen (kommandotolken).
 *
 *  Man kan göra det med 'System.out.format'.
 *  Först skriver man önskade format, följande variable att formateras.
 */
public class fyra {
    public static void main(String[] args) throws IOException {
        InputStream in;
        System.out.println("Skriv Talet här: "); // meddelande för användare.
        System.out.flush(); // tuma buffer
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine(); // Sparas i variabeln
        float tal = Float.parseFloat(s);
        System.out.format("%.2f", tal);

    }
}
