package Uppgifter;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * 3. Standardklassen Scanner är en användbar klass som finns i paketet Java.util.
 * Skriv exempel (källkod) där du visar några viktiga metoder från denna klass.
 *
 * Skanner klass bryter inmatningen i tokens med hjälp av ett avgränsningsmönster, matchar det vita utrymmet eller annan bokstav.
 * De resulterande tokens kan sedan konverteras till olika typervärde med hjälp av andra metoder.
 *
 *
 * Man kan göra det med:
 * - Klass 'InputStream' -> superklassen för en ingångsström av byte.
 * - klass 'BufferedReader' -> Läser byte-strömmar från ett teckeninmatningsflöde, buffrar tecken.
 *   - metoden readLine() -> Läser en textrad.
 * - klass 'InputStreamReader' -> bryggan från byte-strömmar till teckenströmmar.
 * - Klass 'System' med metoden 'in' Ingångsströmmen "standard".
 * - Klass 'String' -> för att spara ingån som text.
 *
 * - klass IOException kan använda man för att hantera  misslyckade eller avbrutna I/O-operationer.
 */
public class tre {
    public static void main(String[] args) throws IOException {
        Locale locale = new Locale("sv", "SE"); // Specificera språk och geografisk region.
        Scanner heltal = new Scanner(System.in); // läsa ett nummer från System.in:

        while (heltal.hasNext()) { // Returnerar sant om den här skannern har en annan token i inmatningen.
            int i = heltal.nextInt(); // Skannar nästa symbol för ingången som ett int.
        }

        heltal.close(); // Stängt heltal skannern om det ännu inte har stängts.

    }
}
