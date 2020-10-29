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
 * Skriv en metod som beräkna vad en vara kostar, inklusive
 * moms. Som parametrar skall metoden få dels priset exklusive
 * moms och dels momssatsen utryck i procent.
 */

public class otta_slut_02 {
    public static void main(String[] arg) {
        int
                iNeto = 0,
                iMomms = 0;
        try{
        iNeto = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                        "Skriv här neto pris: ")
        );

        } catch (Exception e){
            JOptionPane.showMessageDialog(null,
                    "Ingen tal");
        }
        try{
        iMomms = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                        "Skriv här momms procent: ")
        );
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,
                    "Ingen tal");
        }

        JOptionPane.showMessageDialog(null,
                "Total blir: " + total(iNeto, iMomms));
    }
    public static double total(double iNeto, double iMomms){
        return iNeto * ((iMomms/100)+1);
    }
}