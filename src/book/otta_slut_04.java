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
 * Skas betala tyra olika typer av skatt:
 *  - moms 25% ,
 *  - egenavgifter 28,97%,
 *  - statlig skatt 0%, 20%, 25%.
 *  - kommunalskatt 32 %.
 *
 * Skriv kklass Skatt som innehåller dekllarationer av konstanterna:
 */

public class otta_slut_04 {
    public static void main(String[] arg) {

    }

}

class Skatt{
    public static final double MOMS = 1.25;
    public static final double EGEN_AVG = 1.32;
    public static final int STAT_LAG = 0;
    public static final double STAT_MEDEL = 1.20;
    public static final double STAT_HOG = 1.25;
    public static final double LAG = 1;
    public static final int MEDEL = 2;

    public static void main(String[] arg){
        String s = JOptionPane.showInputDialog("Kommunalskatt i procent?");
        if (s == null)
            System.exit(0);
        double kommunal = Double.parseDouble(s);
        s = JOptionPane.showInputDialog("Inkomstnivå (1, 2 eller 3)?");
        if (s == null)
            System.exit(0);
        int niva = Integer.parseInt(s);
        s = JOptionPane.showInputDialog("Önskat belopp?");
        if (s == null)
            System.exit(0);
        double x = Double.parseDouble(s);
        int total = Integer.parseInt(String.valueOf(Math.round(raknaMoms(x, kommunal, niva))));
        JOptionPane.showMessageDialog(null,"Summa att ta är: " + total);
    }

    private static double raknaMoms(double x, double kommunal, int niva){
        // beräkna skatteprocenten p
        double p;
        if (niva == LAG)
            p = kommunal + STAT_LAG;
        else if (niva == MEDEL)
            p = kommunal + STAT_MEDEL;
        else  // antag hög niva
            p = kommunal + STAT_HOG;
        // beräkna lönen före skatt
        double lon = x/(1-0.01*p);
        // lägg till arbetsgivaravgift
        double total = lon + lon*0.01*EGEN_AVG;
        // lägg till moms
        return total + total*0.01*MOMS;
    }

}

