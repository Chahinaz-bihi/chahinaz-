package pres;

import ext.DaoImpl2;
import dao.Daolmpl;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
       DaoImpl2 d = new DaoImpl2();
        System.out.println(d.getData());
        MetierImpl metier = new MetierImpl(d);
        System.out.println("RES="+metier.calcul());
    }
}
