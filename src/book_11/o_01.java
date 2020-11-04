package book_11;

/**
 * Skriv ett program som skapar två fel. Det ena fältet skall fyra komponentereav typen
 * double och samtliga kdponenter skall från förjan ha värdet noll.
 * I det andra fälltet skall kompnenterna vara av typen int. Rälltetskall innehålla valörerna
 * på euro-sedlarna, dvs. 5, 10, 10, 50,100 200 och 500. Programmet skall skriva ut värdena för
 * komponenterna i de två fälten. Använd två for-Satser och utnyttia förenklat skrivsätt
 * där det går.
 */
public class o_01 {
    public static void main(String[] args){
        double [] ett = {0, 0, 0, 0};
        int [] tva = {5, 10, 10, 50,100, 200, 500};
        skrivArrayD(ett);
        skrivArrayI(tva);
        // System.out.println(ett.getClass().getName());

    }

    private static void skrivArrayD(double[] arr) {
        System.out.println("Double array: ");
        for (double item:
             arr) {
            System.out.print(item + ", ");
        }
        System.out.print(".\n");
    }
    private static void skrivArrayI(int[] arr) {
        System.out.println("Integer array: ");
            for (int item:
                 arr) {
                System.out.print(item + ", ");
            }
        System.out.print(".\n");
        }
}
