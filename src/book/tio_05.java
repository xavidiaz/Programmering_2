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

/**
 * Redogör övning 10.1 använd fildialogruta istället.
 */
public class tio_05 {
    static String rubrik = "Beräkning av kommentarer procent.";
    public static void main(String[] arg) throws IOException {

        JFileChooser oFil = new JFileChooser();
        int fonster = oFil.showOpenDialog(null);
        if(fonster !=JFileChooser.APPROVE_OPTION){
            JOptionPane.showMessageDialog(null,
                    "ingen fil valdes.");
            System.exit(0);
        }
        String filnamn = oFil.getSelectedFile().getAbsolutePath();

        // Skapa ström från filen.
        BufferedReader instrom = new BufferedReader(new FileReader(filnamn));
        // läsa filen
        int comment = 0,
                nRad = 0;
        while (true){
            String rad = instrom.readLine();
            if(rad == null) // är filen slut?
                break; // ja
            nRad++;
            // undersöka vilka rader i filen som innehåller kommenrtarer
            if (rad.contains("//")) {   // lättar efter kommenrtar
                comment++;
            }
        }
        // Beräkna hur många procent av raderna i fillen som innehåller kommentarer
        int procent = Integer.parseInt(String.valueOf(100 * comment/nRad));

        // visa resultatet i en dialogruta
        JOptionPane.showMessageDialog(null,
                procent + "% rader innehåller kommentarer.",
                rubrik, JOptionPane.INFORMATION_MESSAGE
        );
    }
}







