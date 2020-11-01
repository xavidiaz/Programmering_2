package Uppgifter;


import java.io.*;

/**
 * 5. Hur läser man från en textfil i Java?
 * Visa ett exempel (källkod)
 *
 * Man kan göra det med:
 * - klass 'BufferedReader' -> Läser byte-strömmar från ett teckeninmatningsflöde, buffrar tecken.
 *   - metoden readLine() -> Läser en textrad.
 *   - klass 'InputStreamReader' -> bryggan från byte-strömmar till teckenströmmar.
 *   - Klass 'System' med metoden 'in' Ingångsströmmen "standard".
 *   - Klass 'String' -> för att spara ingån som text.
 *
 *   - klass IOException kan använda man för att hantera  misslyckade eller avbrutna I/O-operationer.
 *
 *  Programmet utföras från kommandofönster:
 *  - java
 *  - metod path.
 *  - '<' tecken. Det vill säga att ska läsa in.
 *  - fil att läsa path.
 *
 *  'java sex.java < textFilNamn'
 *
 *  */

public class fem {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // läser skrivna text från filen.
        String textInput = input.readLine(); // spara text i variabeln
        System.out.println("\nInehåll av textfilen: '" + textInput + "'\n"); // Skriver ut texten i commandofönster.

        textToFile();
    }
    public static void textToFile()
            throws IOException {
        String str = "Hello";
        BufferedWriter writer = new BufferedWriter(new FileWriter("Hello.txt"));
        writer.write(str);

        writer.close();
    }

}

