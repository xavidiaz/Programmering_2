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
 * // Filen CirkelMain.java
 *
 * import javax.swing.*;
 *
 * public class CirkelMain {
 *   public static void main (String[] arg) {
 *     String s;
 *     s = JOptionPane.showInputDialog("Radien?");
 *     double r = Double.parseDouble(s);
 *     double omkr = 2 * 3.1415926536 * r;
 *     double area = 3.1415926536 * r * r;
 *     JOptionPane.showMessageDialog(null,
 *                 "Omkrets: " + omkr + "\nArea: " + area);
 *   }
 * }
 *
 * Fron Övning 3.3. Beräkningen av omkrets och arean ska göras i två separata metoder vilka skall
 * placeras i en egen klass med nammet Cirkel.
 */
public class otta_01 {
    public static void main(String[] arg) {
        String s;
        s = JOptionPane.showInputDialog("Radien?");
        double r = Double.parseDouble(s);
        double omkr = omkr(r);
        double area = area(r);
        JOptionPane.showMessageDialog(null,
                "Omkrets: " + omkr + "\nArea: " + area);
    }
    public static double omkr(double r){
        return  2 * 3.1415926536 * r;
    }
    public static double area(double r){
        return 3.1415926536 * r * r;
    }
}
