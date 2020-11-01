package Uppgifter;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 6. Hur skriver man till en textfil i Java?
 * Visa ett exempel (källkod)
 *
 * I den här version Filewriter klass för att skriva string 'Hello'
 * i en nyt fil 'Hello.txt'
 *
 *  */

public class sexTva {
    public static void main(String[] args) throws IOException {
        String str = "Hello";
        BufferedWriter writer = new BufferedWriter(new FileWriter("Hello.txt")); // Skapa file
        writer.write(str); // Skriv str i file
        writer.close(); //
    }

}
