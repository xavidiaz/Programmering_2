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

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

import org.apache.commons.lang3.ArrayUtils;



/**
 * I en datasal håller man reda på hur lång tid eleverna använder datorerna
 * genom att skapa en loggfil som innehåller uppgifter om hur lång tid varje
 * användare varit inlogggad. Loggfilen, som är en textfil, innehåller en rad för
 * varje användare. På varje rad finns först användarens inläggningsnamn.
 * Därefter finns ett godtyckligt antal heltal. Varje heltal otsvarar ett inloogningstillfälle.
 * Om filen t.es. innehåler raden: "Kallep 25 40 15" betyder det att användaren
 * "kallep" varit inloggad vi tre olika tillfällen och att
 * han sammanlagt varit inloggad 80 minuter. Din uppgift är nu att skriva ut
 * ett program som läser loggfilen och som undersöker vilken användare som varit inloggad
 * sammanlaggt längst tid. Programmet skall skriva ut
 * användarnamnet för denna användare och hur längge han varit inloggad.
 *
 */
public class tio_02 {
    static String rubrik = "Användarestid.";
    static String [] elever;
    public static void main(String[] arg) throws IOException {
        // läser in ett logfil i dialogruta.
        String filnamn = JOptionPane.showInputDialog(null,
                "Vad heter fillen som skall läsas?",
                rubrik, JOptionPane.INFORMATION_MESSAGE);

        // Skapa ström från filen.
        BufferedReader instrom = new BufferedReader(new FileReader(filnamn));

        // läsa filen
        while (true){
            String rad = instrom.readLine();
            if(rad == null) // är filen slut?
                break; // ja
            berakna(rad);
            }

        sortArray(elever);
        // visa resultatet i en dialogruta
        JOptionPane.showMessageDialog(null,
                printArray(elever),
                rubrik, JOptionPane.INFORMATION_MESSAGE
                );

        }

        public static void berakna(String elev){
            String[] betyg = elev.split(" ");

            int sum = 0;
            for (int i=1; i < betyg.length; i++){
                sum += Integer.parseInt(betyg[i]);
            }
            int avg = sum/betyg.length -1;
            String nyRad = avg + " " + betyg[0];
            elever = ArrayUtils.addAll(elever, nyRad);
        }
        public static void  sortArray(String [] array){
            Arrays.sort(array, Collections.reverseOrder());
    }
        public static String[] printArray(String[] arrData){
            for (String strTemp : arrData)
                System.out.println(strTemp);
            return arrData;
            }
        }







