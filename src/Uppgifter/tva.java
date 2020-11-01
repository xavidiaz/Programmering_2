package Uppgifter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2. Hur läser man från terminalen/kommandotolken i java?
 *
 * Man kan göra det med:
 * - klass 'BufferedReader' -> Läser byte-strömmar från ett teckeninmatningsflöde, buffrar tecken.
 *   - metoden readLine() -> Läser en textrad.
 * - klass 'InputStreamReader' -> bryggan från byte-strömmar till teckenströmmar.
 * - Klass 'System' med metoden 'in' Ingångsströmmen "standard".
 * - Klass 'String' -> för att spara ingån som text.
 *
 * - klass IOException kan använda man för att hantera  misslyckade eller avbrutna I/O-operationer.
 */
public class tva {
    public static void main(String[] args) throws IOException {
        System.out.println("Skriv här: "); // meddelande för användare.
        System.out.flush(); // tuma buffer
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine(); // Sparas i variabeln
    }
}
