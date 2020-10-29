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
import java.util.Arrays;

/**
 * KVAR
 *
 * Ett s.k. anagram får man om man utgår från ett ord eller en
 * mening och kastar om bokstäverna så att ett nytt ord eller en nymening framträder. Av ordet metodanrop kan man t.ex. bilda
 * anagrammet peta ond orm. Skriv en metod 'arAnagram' som undersöker om en text innehålller ett anagram av en annatext. Det bå
 * texterna ges som parametrar till metoden. Resultatet  skall ha
 * typen 'boolean'.
 */

public class otta_slut_10 {
    public static void main(String[] arg) {
    String
            iText = JOptionPane.showInputDialog("Text: "),
            iAnagram = JOptionPane.showInputDialog("Anagram: ");
        if(arAnagram(iText, iAnagram ))
            JOptionPane.showMessageDialog(null,
                    "Ja, det är en annagram");
        else
            JOptionPane.showMessageDialog(null,
                    "Nej, det är inte annagram");
    }

    private static boolean arAnagram(String iText, String iAnagram) {
        System.out.println(iAnagram);
        char[] a= iText.toCharArray();
        Arrays.sort(a);
        System.out.println(a);
        return iAnagram.equals(Arrays.toString(a));
    }


}

