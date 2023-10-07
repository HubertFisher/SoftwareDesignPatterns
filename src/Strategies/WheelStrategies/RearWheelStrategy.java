package Strategies.WheelStrategies;

import Strategies.WheelStrategies.interfaceStr.IWheelStrategy;

public class RearWheelStrategy implements IWheelStrategy {
    @Override
    public String WheelType() {
        return "Rear wheel drive";
    }
}