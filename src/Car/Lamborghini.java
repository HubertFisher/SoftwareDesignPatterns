package Car;

import Strategies.BodyStrategies.interfaceStr.IBodyStrategy;
import Strategies.WheelStrategies.interfaceStr.IWheelStrategy;
import Strategies.fuelStrategies.interfaceStr.IfuelStrategy;

public class Lamborghini extends Car{

    public Lamborghini(String modelName, IBodyStrategy bodyStrategy, IfuelStrategy fuelStrategy, IWheelStrategy wheelStrategy) {
        super(modelName, bodyStrategy, fuelStrategy, wheelStrategy);
        brandName = "Lamborghini";
    }
}
