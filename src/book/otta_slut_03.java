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
 * Skriv en metod med namnet 'arEttPrimtal' som får ett heltal (>0)
 * som parametr och som returnerar ett värde av typen 'boolean'.
 */

public class otta_slut_03 {
    public static void main(String[] arg) {
        int iTal = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Talet?"));
        if (arEttPrimtal(iTal))
            JOptionPane.showMessageDialog(null,
                    "Det är en primtal.");
        else
            JOptionPane.showMessageDialog(null,
                    "Det är inte en primtal.");
    }

    public static boolean arEttPrimtal(int tal) {
        boolean ja= true;
        for (int k = 2; k < tal; k++) {
            if (tal % k == 0)
                ja = false;
        }
        return ja;
    }
}

