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

import org.apache.commons.lang3.ArrayUtils;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.io.*;

/**
 * Redogör övning 10.4 använd fildialogruta istället.
 */
public class tio_06 {
    private static String [] namnet;
    public static void main(String[] args) throws IOException {
        // läser in ett antal namn från Inputruta, ett namn i taget
        System.out.println("las in");
        lasIn();
        System.out.println("Valj fil");
        String filNamn = valjFil();
        System.out.println("Las filnamn");
        lasFil(filNamn);
        System.out.println("print fil");
        printFil(namnet, filNamn);
    }
    public static void lasIn(){
        while (true){
            String namn = JOptionPane.showInputDialog(null, // ta value från dialogruta
                    "Skriv ett namn i tag: ");
            if(namn == null) // är filen slut
                break; // Yes
            namnet = ArrayUtils.addAll(namnet, namn); // push nytt namn i array
        }
    }
    public static String[] printArray(String[] arrData){
        for (String strTemp : arrData)
            System.out.println(strTemp); // ett namn på varje rad, skall läggas till sist om filen finns redan
        return arrData;
    }

    public static void printFil(String[] arrData, String filnamn) throws IOException {
        // File utström
        PrintWriter utstrom = new PrintWriter(new FileWriter(filnamn));
        for (String rad : arrData)
            utstrom.println(rad);
        utstrom.close();
    }
    public static void lasFil(String filnamn) {
        // Skapa en ström från filens
        //File file;
        try {
            BufferedReader instrom = new BufferedReader(new FileReader(filnamn));
            while (true) {
                String rad = instrom.readLine(); // läs namnet
                if (rad == null) // är filen slut?
                    break; // ja!
                namnet = ArrayUtils.addAll(namnet, rad); // push nytt namn i array

            }
        } catch (Exception ignored) {
        }
    }
    public static String valjFil() throws HeadlessException{
        JFileChooser oFil = new JFileChooser();
        System.out.println(oFil);
        int fonster = oFil.showOpenDialog(null);
        System.out.println("här");
        if(fonster !=JFileChooser.APPROVE_OPTION){
            JOptionPane.showMessageDialog(null,
                    "ingen fil valdes.");
            System.exit(0);
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "fil valdes.");
        }

        return oFil.getSelectedFile().getAbsolutePath();
    }

}







