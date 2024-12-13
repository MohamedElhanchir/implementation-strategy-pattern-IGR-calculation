package elhanchir.mohamed;

import elhanchir.mohamed.entities.Employe;
import elhanchir.mohamed.strategy.AlgerieIGRStrategy;
import elhanchir.mohamed.strategy.MarocIGRStrategy;

public class Main {
    public static void main(String[] args) {
        Employe employeMaroc = new Employe("CIN001", 130000, new MarocIGRStrategy());
        System.out.println("Salaire net mensuel (Maroc) : " + employeMaroc.getSalaireNetMensuel());

        employeMaroc.setIgrStrategy(new AlgerieIGRStrategy());
        System.out.println("Salaire net mensuel (Algérie) : " + employeMaroc.getSalaireNetMensuel());
    }
}