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

/**
 * Skriv en metod som får en text 's' och ett heltal 'n' som parametrar.
 * Som resultat skall metoden ge en text som alltid har längden 'n'.
 * Om parametern 's' är längre än n tecken skall resultatet innehålla
 * de sista'n' tecknen i 's', annars skall resultatet innehålla texten i 's'
 * Högerjusteread. Man skdall alltså gylla ut med ett länpligt antal blanka
 * tecken först. Om metoden t.ex. tår texten "Java" och heltalet 6 som
 * parametrar så skall den ge resultatet " Java".
 */

public class otta_slut_09 {
    public static void main(String[] arg) {
        String s = JOptionPane.showInputDialog("Text:");
        int n = Integer.parseInt(JOptionPane.showInputDialog("tal:"));

        resultat("text", 5);

    }

    private static void resultat(String s, int n) {
        int sLength = s.length(),
            length = n - sLength;
        StringBuilder mellanslag = new StringBuilder();
        mellanslag.append(" ".repeat(Math.max(0, length)));

        String sTecken = "";
        if(sLength > n){
            sTecken =  s.substring(sLength - 1);

        JOptionPane.showMessageDialog(null,
                "längden: " + sLength + "\tSysta tecken: " + sTecken);
        } else {
            JOptionPane.showMessageDialog(null,
                    "<html><body><div width='200px' align='right'>" + mellanslag + s + "</div></body></html>");
        }
    }


}

