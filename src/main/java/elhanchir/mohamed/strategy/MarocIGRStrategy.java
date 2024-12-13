package elhanchir.mohamed.strategy;

public class MarocIGRStrategy implements IGRStrategy {
    @Override
    public float calculerIGR(float salaireBrutAnnuel) {
        if (salaireBrutAnnuel < 40000) {
            return salaireBrutAnnuel * 0.05f;
        } else if (salaireBrutAnnuel <= 120000) {
            return salaireBrutAnnuel * 0.20f;
        } else {
            return salaireBrutAnnuel * 0.42f;
        }
    }
}
