package Uppgifter_14;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testPunkt {
    public static void main(String[] args) throws FileNotFoundException {
        Punkt[] pt;
        pt = new Punkt[100];

        // koppla till filen för att läsa
        Scanner filLas = new Scanner(new File("/Users/xavidiaz/code/Programmering2/kurva.txt"));

        int n = 0;  // antal
        while (filLas.hasNext()) {
            pt[n]   = new Punkt();
            pt[n].x = Double.parseDouble(filLas.next());
            pt[n].y = Double.parseDouble(filLas.next());
            n++;
        }

        // Skriv ut
        System.out.println("  x    y    ");
        for (int i = 0; i < 4; i++) {
            System.out.print(pt[i].x + ", " + pt[i].y + "\n");
        }
        // Sok
        int antalHittas = 0;
        String talHittas = "";
        for (int i = 0; i < 4; i++) {
            if (pt[i].x < 0 && pt[i].y < 0) {
                antalHittas++;
                talHittas += pt[i].x + ", " + pt[i].y + "; ";
            }
        }
        if (antalHittas > 0) {
            System.out.println(" Det hitades " + antalHittas + " -> " + talHittas);
        } else {
            System.out.println("Blev inga hittas");

        }
    }

        static void print() {
            JFileChooser fil      = new JFileChooser();
            int          resultat = fil.showOpenDialog(null);

            if (resultat != JFileChooser.APPROVE_OPTION) {
                System.out.println("Ingen fil valdes.");
                System.exit(0);
            }
            String filNamn = fil.getSelectedFile().getAbsolutePath();
        }
}

