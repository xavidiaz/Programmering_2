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

/**
 * Skriv ett proggram som liknar programmet Spar Personer, men istället för
 * att lägga till nya personer skall programmet ta bort personer från resultatfilen.
 * Namnet på varje person som skall tas bort skall läsas från en dialogruta.
 * Använd en variabel av typen File och metoden create TempFile nar du skapar den temporära filen.
 */
public class tio_07 {
    static BufferedReader instrom;
    static String filnamn;
    /**
     * Öpna fil dialogruta
     *
     * @return
     */
    public static BufferedReader oFil() throws IOException {
        JFileChooser oFil = new JFileChooser();
        int fonster = oFil.showOpenDialog(null);
        if (fonster != JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(null,
                    "ingen fil valdes.");
            System.exit(0);
        }
        filnamn = oFil.getSelectedFile().getAbsolutePath();

        // Skapa ström från filen.
        instrom = new BufferedReader(new FileReader(filnamn));
        return instrom;
    }

    public static String[] lasStrom(BufferedReader instrom) throws IOException {
        String [] rader = null;
        while (true) {
            String rad = instrom.readLine();
            if (rad == null) // är filen slut?
                break; // ja
            rader = ArrayUtils.addAll(rader, rad);
        }
        return rader;
    }

    public static void tillKommandoFonster(String[]... z) {
        for (String[] i : z) {           // per rad
            System.out.print(Arrays.toString(i));
        }
    }
    public static void tillDialogRuta(String[]... z) {
           for (String[] i : z) {           // per rad
               JOptionPane.showMessageDialog(null,
                       i);
           }
       }
       public static void tumFil(String fil) throws IOException {
           // File utström
           PrintWriter utstrom = new PrintWriter(new FileWriter(String.valueOf(fil)));
           utstrom.println("");
       }

    public static void main(String[] args) throws IOException {
        tillDialogRuta(lasStrom(oFil()));
        tumFil(filnamn);

    }
}







