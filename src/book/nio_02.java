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
import java.util.Scanner;

import static book.otta_4.nfak;

/**
 * Konstruera ut ett program som skriver ut en tabell. På varje rad i tabellen skall
 * det stå ett heltal n och dess fakultetsvärde n!. Programmet skall skriva ut en tabell
 * för varje heltalsvärde i intarvalllet n1 till n2. de två heltalen n1 och  n2
 * skall läsas in från dialogrutor i början av programmet.}
 */
public class nio_02 {
    public static void main(String[] x) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("n?"));
        System.out.println("n!");
        nfak(n);
    }

        public static void nfak(int n) {
            double r = 1;
            for (int i = 2; i <= n; i++){
            r = r * i;
                System.out.print(i + "\t" + r + "\n");
            }
    }
}

