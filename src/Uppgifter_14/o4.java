package Uppgifter_14;

/**
 * KVAR
 */
public class o4 {
    public static void main(String[] args) {
        int[] nummer = {4,
                        2,
                        7,
                        4,
                        2,
                        9,
                        3
        };
        int k   = 0; //index
        int min = nummer[0];
        int max = nummer[0];

        for (int i = 1; i < nummer.length; i++) {
            if (nummer[i] < min)
                min = nummer[i];
            if (nummer[i] > max)
                max = nummer[i];
            k++;
            //            System.out.println(max);
        }
        nummer[0]                 = min;
        nummer[nummer.length - 1] = max;

        while (max - 1 == max) {
            for (int i = min; i <= max; i++) {
                //            System.out.println(nummer[i] + ", " + i);
                if (i == nummer[i])
                    nummer[i] = nummer[i];
                min = nummer[i];
                //            System.out.println(i);
            }
        }
//        System.out.println(min + " - " + max);
        for (int i=min; i<=nummer.length -1; i++) {
            System.out.println(nummer[i] + ", ");

            //        }

        }

    }
}
