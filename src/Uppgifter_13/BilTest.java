package Uppgifter_13;

import javax.swing.*;
import java.util.Arrays;

/**
 * Övning 2
 * Skriv ett program som skapar två objekt av kolassen Bil. Du deklarerade
 * denna klass i övning 13.1 Lägg metoden main i en klass med namnet
 * BilTest och placera denna klass i en textril med nanet BilTest .java
 * Se till att denna fil finns i samma mapp som fil Bil.java. Kompilera
 * och provkör programmet. När du kör programmet ör inget hända eftersom
 * programet ännu inte innehåller några rader som ger utskrifter.
 */
public class BilTest {
    public static void main(String[] args){
        Bil b1 = new Bil();
        Bil b2 = new Bil();

        /**
         * Övning 13.3
         * Kompletera programmet i övning 13.2 så att instansvariablerna i de två
         * Bil-objekkten tilldelas lämpliga värden. Bälj värden föt två olika bilmodeller.
         * (Om du inte vet vad som är lämpliga värden kan du hitta på något eller leta
         * på en webbsajt för någon biltillverkare.) låt sedan programmet i tåva dialogrutor
         * visa informationen för de båda bilarna.
         */

        /**
         * Du skall nu göra några tillägg i programmet i övning 13.3 Lägg i klassen
         * Bil in en referens till en per som som är bilens ägare. Initiera sedan de två
         * bilarna så att de får var sin ägare.
         */

        b1.registreringsnummer = "MLA43A";
        b1.fabrikat = "Tesla";
        b1.arsmodell= 2016;
        b1.tjänstevikt = 1679;
        b1.effekt = 260;

        b1.agare.namn = "Peter";
        b1.agare.efternamn = "Andersson";

        b2.registreringsnummer = "MLB84A";
        b2.fabrikat = "Mercedes";
        b2.arsmodell= 2014;
        b2.tjänstevikt = 2679;
        b2.effekt = 360;

        b2.agare.namn = "Adam";
        b2.agare.efternamn = "Dannielsson";


JOptionPane.showMessageDialog(null,
                              "Ägare: " + b1.agare.namn + ", " + b1.agare.efternamn + "\n" +
                              "fabrikat: " + b1.fabrikat + "\n" +
                              "arsmodell: " + b1.arsmodell + "\n" +
                              "tjänstevikt: " + b1.tjänstevikt + "\n" +
                              "effekt: " + b1.effekt + "\n" +
                              "NS skatt: " + Bil.skatteBelopet * b1.tjänstevikt + "\n",
                              "registreringsnummer\n" + b1.registreringsnummer + "\n",
                              JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(null,
                              "Ägare: " + b2.agare.namn + ", " + b2.agare.efternamn + "\n" +
                              "fabrikat: " + b2.fabrikat + "\n" +
                              "arsmodell: " + b2.arsmodell + "\n" +
                              "tjänstevikt: " + b2.tjänstevikt + "\n" +
                              "effekt: " + b2.effekt + "\n" +
                              "NS skatt: " + Bil.skatteBelopet *  b2.tjänstevikt + "\n",
                              "registreringsnummer:\n" + b2.registreringsnummer + "\n",
                              JOptionPane.INFORMATION_MESSAGE);

    }


}