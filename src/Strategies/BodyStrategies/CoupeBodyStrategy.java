package Strategies.BodyStrategies;

import Strategies.BodyStrategies.interfaceStr.IBodyStrategy;

public class CoupeBodyStrategy implements IBodyStrategy {
    @Override
    public String bodyType() {
        return "Coupe";
    }
}
