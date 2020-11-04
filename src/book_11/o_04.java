package book_11;

import javax.swing.*;

/**
 * Man behöver eggentligen inte två fält i proggrammen Mobil2.
 * Det räcker med fältet namn. ändra iprogrammet så att det bara
 * anvvänder ett fält.
 */
public class o_04 {
    public static void main (String[] args){
        String [] namn = new String[10]; // fält for namnet
//        double [] namn = new double[100]; // fält för namner

        // läs in namn och namner
        int n = 0;  // index
        int namnKort = 1;
        while (true){
            namn[n] = JOptionPane.showInputDialog(
                    "Namn för kort n° " + namnKort + "?"
            );
            if(namn[n] == null)
                break;
            String s = JOptionPane.showInputDialog("pris/min för " + namnKort + "?");
            if(s ==null)
                break;
            namn[++n] = s;
            n++; //  öka antalet
            namnKort++;
        }
        for (String i:
             namn) {
            System.out.println(i);
        }
        // beräkna det lägsta namnet
        int billigast = 1;  // index för billigaste
        for(int i=3; i<n; i = i+2)
            if(Integer.parseInt(namn[i]) < Integer.parseInt(namn[billigast]))
                JOptionPane.showMessageDialog(null,
                                              namn[(n-1)] + " är det billigast.\n" +
                                              "Det kostar " + namn[n] + " / minut");
            else {
                JOptionPane.showMessageDialog(
                        null,
                        namn[0] + " är det billigast.\n" +
                        "Det kostar " + namn[1] + " / minut"
                );
            }

        }

}

