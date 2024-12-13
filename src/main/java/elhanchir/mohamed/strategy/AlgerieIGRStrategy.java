package elhanchir.mohamed.strategy;

public class AlgerieIGRStrategy implements IGRStrategy {
    @Override
    public float calculerIGR(float salaireBrutAnnuel) {
        return salaireBrutAnnuel * 0.35f;
    }
}
