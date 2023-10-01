package Strategies.fuelStrategies;

import Strategies.fuelStrategies.interfaceStr.IfuelStrategy;

public class DieselfuelStrategy implements IfuelStrategy {

    @Override
    public String fueltype() {
        return "Diesel fuel";
    }
}
