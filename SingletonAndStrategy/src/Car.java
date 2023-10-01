import Strategies.BodyStrategies.interfaceStr.IBodyStrategy;
import Strategies.WheelStrategies.interfaceStr.IWheelStrategy;
import Strategies.fuelStrategies.interfaceStr.IfuelStrategy;

public class Car {
    private IBodyStrategy bodyStrategy;
    private IfuelStrategy fuelStrategy;
    private IWheelStrategy wheelStrategy;


    public Car(IBodyStrategy bodyStrategy, IfuelStrategy fuelStrategy, IWheelStrategy wheelStrategy){
        this.bodyStrategy = bodyStrategy;
        this.fuelStrategy = fuelStrategy;
        this.wheelStrategy = wheelStrategy;
    }

    public IWheelStrategy getWheelStrategy() {
        return wheelStrategy;
    }

    public IBodyStrategy getBodyStrategy() {
        return bodyStrategy;
    }

    public IfuelStrategy getFuelStrategy() {
        return fuelStrategy;
    }

    @Override
    public String toString() {
        return "Car:\n" +
                "body = " + bodyStrategy.bodyType() +"\n"+
                "fuel = " + fuelStrategy.fueltype() +"\n"+
                "wheel = " + wheelStrategy.WheelType() +"\n";
    }
}
