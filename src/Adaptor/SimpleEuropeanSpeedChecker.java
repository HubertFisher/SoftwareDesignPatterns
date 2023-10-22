package Adaptor;

public class SimpleEuropeanSpeedChecker implements IEuropeanSpeedSystem{
    @Override
    public String speed(float kilometers, float time) {
        return kilometers/time + "km/h";
    }
}
