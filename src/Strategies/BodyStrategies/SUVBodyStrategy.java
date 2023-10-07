package Strategies.BodyStrategies;

import Strategies.BodyStrategies.interfaceStr.IBodyStrategy;

public class SUVBodyStrategy implements IBodyStrategy {
    @Override
    public String bodyType() {
        return "SUV";
    }
}
