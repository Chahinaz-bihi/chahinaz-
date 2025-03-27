package pres;

import dao.IDao;
import ext.DaoImpl2;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
 Scanner scanner = new Scanner(new File("config.txt"));
 String daoClassName = scanner.nextLine();
 Class cDao=Class.forName(daoClassName);
 IDao dao=(IDao)cDao.newInstance();
        System.out.println(dao.getData());
        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier =(IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);
        System.out.println("RES="+metier.calcul());
    }


}
