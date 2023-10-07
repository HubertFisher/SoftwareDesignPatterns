package Strategies.fuelStrategies;

import Strategies.fuelStrategies.interfaceStr.IfuelStrategy;

public class ElectrofuelStrategy implements IfuelStrategy {
    @Override
    public String fueltype() {
        return "Electro fuel";
    }
}
