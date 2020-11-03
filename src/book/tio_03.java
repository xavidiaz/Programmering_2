/*
 * This is free and unencumbered software released into the public domain.
 *
 * Anyone is free to copy, modify, publish, use, compile, sell, or
 * distribute this software, either in source code form or as a compiled
 * binary, for any purpose, commercial or non-commercial, and by any
 * means.
 *
 * In jurisdictions that recognize copyright laws, the author or authors
 * of this software dedicate any and all copyright interest in the
 * software to the public domain. We make this dedication for the benefit
 * of the public at large and to the detriment of our heirs and
 * successors. We intend this dedication to be an overt act of
 * relinquishment in perpetuity of all present and future rights to this
 * software under copyright law.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * For more information, please refer to <http://unlicense.org>
 *
 */

package book;

import org.apache.commons.lang3.ArrayUtils;

import javax.swing.*;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;


/**
 * Skriv en ny version av programmet Betyg. I den nya version
 * skalll utskriften av de godkända eleverna inte göras i kommandlfönstret
 * utan till en ny fil. (Den nya filen skall alltså efter programmets sllut ara
 * innehålla namnen på de godkända elleverna.) Namnet på den nya filen
 * skall, liksom namnet på indatafilen, läsasin från kommandoraden.
 */
public class tio_03 {
    public static void  main (String[] args) throws IOException {
        // Skapa en ström från kommandofönstret
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // Läs filens namn från kommandofönstret
        System.out.print("Filens namn?"); System.out.flush();
        String filnamn = input.readLine();
        
        // Skapa en ström från filens
        File file;
        BufferedReader instrom = new BufferedReader(new FileReader(filnamn));

        // File utström
        PrintWriter utstrom = new PrintWriter(new FileWriter("godkanda_elever.txt"));

        // Läs filen och skriv ut de godkända eleverna
        while (true){
            String rad1 = instrom.readLine(); // läs namnet
            if (rad1 == null) // är filen slut?
                break; // ja!
            String rad2 = instrom.readLine(); // läs poängen
            int poang = Integer.parseInt(rad2);
            if(poang >= 50)  // godkänd?
                utstrom.println(rad1 + " " + poang);
        }
        utstrom.close();
    }
}







