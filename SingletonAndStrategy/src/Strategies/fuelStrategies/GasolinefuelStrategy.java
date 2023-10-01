package Strategies.fuelStrategies;

import Strategies.fuelStrategies.interfaceStr.IfuelStrategy;

public class GasolinefuelStrategy implements IfuelStrategy {
    @Override
    public String fueltype() {
        return "Gasoline";
    }
}
