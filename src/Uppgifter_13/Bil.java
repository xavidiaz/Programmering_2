package Uppgifter_13;

/**
 * Övning 1
 * Skriv en klass som beskriver bilar. Kalla klassen Bil. En bil skall ha
 * registreringsnummer, fabrikat, årsmodell, tjänstevikt och motoreffekt. Välj
 * lämpliga typer för de olika instansvariablerna. Lägg klassen i en egen fil
 * med namnet Bil.java. Du kan kompilera filen men du kan inte
 * "köra programmet" eftersom det inte finns något fullständigt program ännu.
 */
    class Bil {
        String registreringsnummer;
        String fabrikat;
        int    arsmodell;
        double tjänstevikt;
        double effekt;
        Person agare = new Person();
        static double skatteBelopet = 1.3;

}

