package Car;

import Strategies.BodyStrategies.interfaceStr.IBodyStrategy;
import Strategies.WheelStrategies.interfaceStr.IWheelStrategy;
import Strategies.fuelStrategies.interfaceStr.IfuelStrategy;

public class Mercedes extends Car{
    public Mercedes(String modelName, IBodyStrategy bodyStrategy, IfuelStrategy fuelStrategy, IWheelStrategy wheelStrategy) {
        super(modelName, bodyStrategy, fuelStrategy, wheelStrategy);
        brandName = "Mercedes";
    }

}
