package Strategies.BodyStrategies;

import Strategies.BodyStrategies.interfaceStr.IBodyStrategy;

public class SedanBodyStrategy implements IBodyStrategy {

    @Override
    public String bodyType() {
        return "Sedan";
    }
}
