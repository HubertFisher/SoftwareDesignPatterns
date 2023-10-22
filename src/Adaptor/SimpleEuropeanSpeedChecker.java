package Adaptor;

import Adaptor.interfaces.IEuropeanSpeedSystem;

public class SimpleEuropeanSpeedChecker implements IEuropeanSpeedSystem {
    @Override
    public String speed(float kilometers, float time) {
        return kilometers/time + "km/h";
    }
}
