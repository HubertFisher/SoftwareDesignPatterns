package Car;

import Strategies.BodyStrategies.interfaceStr.IBodyStrategy;
import Strategies.TransmissionStrategies.InterfaceStr.ITransmissionStrategy;
import Strategies.WheelStrategies.interfaceStr.IWheelStrategy;
import Strategies.fuelStrategies.interfaceStr.IfuelStrategy;

public class BMW extends Car{
    public BMW(String modelName, IBodyStrategy bodyStrategy, IfuelStrategy fuelStrategy, IWheelStrategy wheelStrategy, ITransmissionStrategy transmissionStrategy){
        super(modelName,bodyStrategy,fuelStrategy,wheelStrategy,transmissionStrategy);
        brandName = "BMW";
    }
}
