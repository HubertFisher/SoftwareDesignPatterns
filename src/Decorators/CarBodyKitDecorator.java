package Decorators;

import Car.Car;
import Strategies.BodyStrategies.interfaceStr.IBodyStrategy;
import Strategies.WheelStrategies.interfaceStr.IWheelStrategy;
import Strategies.fuelStrategies.interfaceStr.IfuelStrategy;


public abstract class CarBodyKitDecorator extends Car {
    Car car;
    public abstract String getDescription();
    public CarBodyKitDecorator(String modelName, IBodyStrategy bodyStrategy, IfuelStrategy fuelStrategy, IWheelStrategy wheelStrategy){
        super(modelName,bodyStrategy,fuelStrategy,wheelStrategy);

    }
    public CarBodyKitDecorator(Car car){
        this.car = car;
    }
}
