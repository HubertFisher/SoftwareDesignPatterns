package Car;

import Strategies.BodyStrategies.interfaceStr.IBodyStrategy;
import Strategies.WheelStrategies.interfaceStr.IWheelStrategy;
import Strategies.fuelStrategies.interfaceStr.IfuelStrategy;

public class Ferrari extends Car{
    public Ferrari(String modelName, IBodyStrategy bodyStrategy, IfuelStrategy fuelStrategy, IWheelStrategy wheelStrategy) {
        super(modelName, bodyStrategy, fuelStrategy, wheelStrategy);
        brandName = "Ferrari";
    }
}
