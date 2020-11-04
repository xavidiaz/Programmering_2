package book_11;

/**
 * Gör samma sak som i föregående övning, men låt denna gång den sistan komponenten innehålla värdet 1/1, osv.
 */
public class o_03 {
    public static void main(String[] args){
        double [] ett = new double[10];
        for (int i = 9; i > 2; i--) {
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
