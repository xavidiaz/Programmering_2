package Uppgifter;


import java.io.*;

/**
 * 6. Hur skriver man till en textfil i Java?
 * Visa ett exempel (källkod)
 *
 *  Man kan göra prescis med samma kod för att skriva ut
 *  i kommandofönster. Man utföras programmet från kommando fönster.
 *
 *  - java
 *  - metod path.
 *  - '>' tecken. Det vill säga att ska läsa in.
 *  - fil att läsa path.
 *
 *  'java sex.java > texfilnamn'
 *
 *  */

public class sex {
    public static void main(String[] args) throws IOException {
        String text = "text att sparas i filen";
        System.out.print(text);

    }
}

