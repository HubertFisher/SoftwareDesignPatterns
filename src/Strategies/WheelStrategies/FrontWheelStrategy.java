package Strategies.WheelStrategies;

import Strategies.WheelStrategies.interfaceStr.IWheelStrategy;

public class FrontWheelStrategy implements IWheelStrategy {
    @Override
    public String WheelType() {
        return "Front wheel drive";
    }
}
