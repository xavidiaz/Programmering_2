package Uppgifter_15.o1;

public class test {
    public static void main(String[] args) {
        // ny fält rektangel
        Rektangel[] r = new Rektangel[10];
        r[0] = new Rektangel();
        r[0].options();

        // set höjd och bröd
        try{
        for(int i=0; i<r.length; i++){
        r[i] = new Rektangel();
        r[i].setHojd();
        r[i].setBred();
        }

        } catch (Exception ignore){}

        // Skriva ut beräkningar
        System.out.println(r[0].omk());
        System.out.println(r[0].area());


    }}