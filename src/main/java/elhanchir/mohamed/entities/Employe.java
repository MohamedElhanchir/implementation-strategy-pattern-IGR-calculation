package elhanchir.mohamed.entities;

import elhanchir.mohamed.strategy.IGRStrategy;

public class Employe {
    private String cin;
    private float salaireBrutMensuel;
    private IGRStrategy igrStrategy;

    public Employe(String cin, float salaireBrutMensuel, IGRStrategy igrStrategy) {
        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;
        this.igrStrategy = igrStrategy;
    }

    public float calculerIGR() {
        float salaireBrutAnnuel = salaireBrutMensuel * 12;
        return igrStrategy.calculerIGR(salaireBrutAnnuel);
    }

    public float getSalaireNetMensuel() {
        float igr = calculerIGR();
        float salaireNetAnnuel = salaireBrutMensuel * 12 - igr;
        return salaireNetAnnuel / 12;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public float getSalaireBrutMensuel() {
        return salaireBrutMensuel;
    }

    public void setSalaireBrutMensuel(float salaireBrutMensuel) {
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    public IGRStrategy getIgrStrategy() {
        return igrStrategy;
    }

    public void setIgrStrategy(IGRStrategy igrStrategy) {
        this.igrStrategy = igrStrategy;
    }
}
