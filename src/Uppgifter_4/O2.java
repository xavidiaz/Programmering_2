package Uppgifter_4;

/**
 * Vad är klassvariabler?
 * Hur deklareras sådana variabler?
 * Skriv ett exempel (källkod).
 *
 * De deklareras med nyckelord ‘static’ utanfor av metoder, konstruktor
 * eller block. Man deklarerar Klassvariabler en enda gång. De typ av
 * variabler tillåter att ställa eller ändra en  gemensam värde av flera
 * klasser på en gång
 */
public class O2 {
        private int vikt;
        private String ras;
        private int alder;

        // klassvariabeln
        static int arsavgift; // förening medlemskap

        // pre-intansiera klassvariabeln
        static int  manadsavgift = 100; // förening medlemskap
}
