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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Skriv ett program som läser in en test som innehålller vövarspråk.
 * Programmet skall översätta det inlästa fövarspårket tillbbaka till vanligt språk.
 */
public class nio_09_2 {
    public static void main(String[] args) throws IOException {

        InputStream in;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String kons = "bcdfghklmnpqrstvxzBCDFGHKLMNPQRSTVXZ";
        while (true) {
            String s1 = input.readLine(); // läs nästa rad
            if (s1 == null)
                break; // end-of-file
            String s2 = ""; // rad som skall skrivas ut

            // löp iggenom alla tecken på den inlästa raden
            for (int i = 0; i < s1.length(); i++) {
                String c = s1.substring(i, i + 2);
                for (int j = 0; j < s1.length(); j++) {
                    char bokstav = kons.charAt(j);
                    String bokstavS = Character.toString(bokstav);
                    String jamnTill = bokstavS + 'o' + bokstavS;
                    if (c.equals(jamnTill))
                        s2 = bokstavS;
                }
                System.out.println(s2);

            }
        }

    }
}
