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
 * Skrin en metod som beräkna ett heltals tecken. Som resultat skall metoden ge värdet
 * 1 om talet är störe en 0,
 * värdet 0 om talet är lika med 0 och
 * vardet -1 om talet är mindre en 0.
 */

public class otta_slut_01 {
    public static void main(String[] arg) {
        int iTal = 0;
        try{
        iTal = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                "Skriv hetal"));

        JOptionPane.showMessageDialog(null,
                ntecken(iTal));

        } catch (Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,
                    "Ingen tal");
        }

    }

    public static int ntecken(int tal) {
        int val;
        if (tal > 0) {
            val = 1;
        } else if (tal == 0) {
            val = 0;
        } else {
            val = -1;
        }
        return val;
    }
}