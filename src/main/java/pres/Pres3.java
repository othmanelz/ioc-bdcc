package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres3 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        metier.setDao(d);
        System.out.println("RES="+metier.calcul());
    }
}
