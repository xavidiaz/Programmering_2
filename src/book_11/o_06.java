package book_11;

/**
 * Skriv en metod som beräknar medelvärdet av komponenterna i en fält medelkomponeneter
 * an typen double. Lägg in metoden i klassen Mobbil1.
 * Anropa den sedan islutet av programmet för at beräkna medelvärdet a priserna
 * örde olika konattkorten.
 */
public class o_06 {
    public static void main (String[] args){
        double[] pris = {5, 10, 15};

        System.out.println(medelvardet(pris));

    }
    public static double medelvardet(double[] args){
        double summa = 0;
            
        for (double i:
             args) {
            summa += i;
        }
        return summa/args.length;
    }
}

