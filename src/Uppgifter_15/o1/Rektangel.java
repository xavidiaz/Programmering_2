package Uppgifter_15.o1;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.io.EOFException;

public class Rektangel {
    double hojd;
    double bred;

    int count = 0;
    double tmp = 0;

    // instasiera bred & hojd

    public void options(){
        String[] options = {"OK", "Avbrytt", "Beräkna"};
        bred = JOptionPane.showOptionDialog(null, "Returns the position of your choice on the array",
                                             "Click a button",
                                             JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        System.out.println(bred);


    }

    public void setBred()  {
        count = 0;
        tmp   = 0;
        while (true) {
            try {
                bred = Double.parseDouble(JOptionPane.showInputDialog(null, "Skriv in Bred:"));
                tmp = bred;
                if (bred == tmp)
                    break;
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Det är bara tillåta positiva tal");
                bred = Double.parseDouble(JOptionPane.showInputDialog(null, "Skriv in Bred:"));
                if (++count == 3)
                    System.out.println("Antalet maximala repetitioner överskridits");
                break;
            }
        }
    }
    public void setHojd(){
         count = 0;
         tmp = 0;
        while(true) {
            try {
                hojd = Double.parseDouble(JOptionPane.showInputDialog(null, "Skriv in Hojd:"));
                tmp = hojd;
                JOptionPane.showMessageDialog(null,"Det är bara tillåta positiva tal");
                if (++count == 3) System.out.println("Antalet maximala repetitioner överskridits");
                if(hojd == tmp)
                    break;
            } catch (Exception e) {
                    break;
            }
        }
       }

    public double omk() {
        return 2 * hojd +  2* bred;
    }
    public double area() {
        return hojd * bred;
    }
}
