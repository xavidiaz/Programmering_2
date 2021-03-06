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
import java.io.InputStreamReader;

/**
 * Skriv ett program som läser in ett godtyckligt antal tal från kommandofönstret.
 * Programmet får anta att varje talskrivs in på en egen rad. Användaren skall skrivva teckenkombinationen för 'end-of-file' för att markera när
 * hen inte tänker skivva in fler tal. Programmet skall som abslutning
 * skrivva ut det stösta av de inlästa talen.
 */
public class nio_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (true){
            System.out.print("Tal 1: "); System.out.flush();
            s = input.readLine();
            if(s == null)
                break;
            int tal1 = Integer.parseInt(s);
            System.out.print("Tal 2: "); System.out.flush();
            s = input.readLine();
            if(s == null)
                break;
            int tal2 = Integer.parseInt(s);
            System.out.print("Tal 3: "); System.out.flush();
            s = input.readLine();
            if(s == null)
                break;
            int tal3 = Integer.parseInt(s);

        }
            System.out.println("Sista tal: " + s);
    }
}

