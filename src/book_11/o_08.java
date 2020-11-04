package book_11;

/**
 * Programmet FilTest kräver att man ger precis ett filnamn som arguments
 * när man startar programmet. Skriv en ny version av programmet. I den nya
 * versionen skall man kunna ge flera filnamn som argument. Programmet skall
 * då veräkna antalet rader och tecken för alla filerna. Dett skall göras
 * for en fil i taget och man skall få en utskriftrad för varje fil.
 */
public class o_08 {
    public static void main (String[] args){
        if(args.length == 0){
            System.out.println("Det saknar argumenter!");
        System.exit(0);
        }

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}

