package Adaptor;

import Adaptor.interfaces.IAmericanSpeedSystem;
import Adaptor.interfaces.IEuropeanSpeedSystem;

public class SpeedAdapter implements IAmericanSpeedSystem {
    IEuropeanSpeedSystem europeanSpeedSystem;

    public SpeedAdapter(IEuropeanSpeedSystem europeanSpeedSystem) {
        this.europeanSpeedSystem = europeanSpeedSystem;
    }

    @Override
    public String speed(float miles, float time) {
        float kilometers = convertMilesToKilometers(miles);
        return europeanSpeedSystem.speed(kilometers, time);
    }
    private float convertMilesToKilometers(float miles){
        return (float) (miles * 1.60934);
    }
}
