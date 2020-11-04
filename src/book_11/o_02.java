package book_11;

/**
 * Skriv ett program som först skapar ett fält med tio komponeneter av typen
 * double. Programmet skall sedan innehålla en for-sats som ger den första
 * komponenten värdet 1/1, den andra värdet 1/2, den tredje värdet 1/3 osv.
 * Sist i programmet skall komponenternas värden skrivas ut.
 */
public class o_02 {
    public static void main(String[] args){
        double [] ett = new double[10];
        for (int i = 0; i < 10; i++) {
            ett[i] = 1/(1 + (double)i);
        }
        skrivArrayD(ett);
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
