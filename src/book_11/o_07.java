package book_11;

/**
 * Skriv en metod med namnet fyll som tilldelar ett (och samma) värde till alla komponenter
 * inom ett visst intervall i ett fält. Metoden skall ha fyra
 * parametrar. Den första är fältet, den andra det undre indexet i intervallet,
 * den tredje det övre indexet och den fjärde det värde som skall tilldellas. låt
 * fältet ha komponenter av typen doubble. För att ti.ex. lägga värdet 2,3
 * i komponenterna nummer 5 till 9 i fältet f skall man kunna göra anropet:
 * fyll(f,5, 9, 2.3);
 * Testa metod genom att skriva et program där fältet f deklareras och metoden fyll
 * anropas som ovan. Du kan använda metoden skrivUt fältets innehåll.
 */
public class o_07 {
    public static void main (String[] args){
        double[] f = new double[10];

        skrivaUt(fyll(f,5, 9, 2.3));

    }

    private static void skrivaUt(double[] arr) {
        for(double i:arr)
            System.out.println(i);
    }

    public static double[] fyll(double[] faltet, double start, double slut, double tilldelas ){
        for(double i = start; i <= slut; i++){
            faltet[(int) i] = Double.parseDouble(String.valueOf(tilldelas));
        }
        return faltet;
    }
}

