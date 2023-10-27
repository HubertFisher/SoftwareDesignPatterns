package Car;

import Strategies.BodyStrategies.interfaceStr.IBodyStrategy;
import Strategies.TransmissionStrategies.InterfaceStr.ITransmissionStrategy;
import Strategies.WheelStrategies.interfaceStr.IWheelStrategy;
import Strategies.fuelStrategies.interfaceStr.IfuelStrategy;

public abstract class Car {
    protected String brandName;
    protected String modelName;
    private IBodyStrategy bodyStrategy;
    private IfuelStrategy fuelStrategy;
    private IWheelStrategy wheelStrategy;
    private ITransmissionStrategy transmissionStrategy;

    public Car(String modelName, IBodyStrategy bodyStrategy, IfuelStrategy fuelStrategy, IWheelStrategy wheelStrategy, ITransmissionStrategy transmissionStrategy){
        this.modelName = modelName;
        this.bodyStrategy = bodyStrategy;
        this.fuelStrategy = fuelStrategy;
        this.wheelStrategy = wheelStrategy;
        this.transmissionStrategy = transmissionStrategy;
    }

    protected Car() {}

    public String getWheelStrategy() {
        return wheelStrategy.WheelType();
    }

    public String getBodyStrategy() {
        return bodyStrategy.bodyType();
    }

    public String getFuelStrategy() {
        return fuelStrategy.fueltype();
    }

    public void setBodyStrategy(IBodyStrategy bodyStrategy) {
        this.bodyStrategy = bodyStrategy;
    }

    public void setFuelStrategy(IfuelStrategy fuelStrategy) {
        this.fuelStrategy = fuelStrategy;
    }

    public void setWheelStrategy(IWheelStrategy wheelStrategy) {
        this.wheelStrategy = wheelStrategy;
    }
    public ITransmissionStrategy getTransmissionStrategy() {
        return transmissionStrategy;
    }

    public void setTransmissionStrategy(ITransmissionStrategy transmissionStrategy) {
        this.transmissionStrategy = transmissionStrategy;
    }
    public  String getDescription(){
        return brandName+" "+ modelName+"\n"+
                "Body type - "+bodyStrategy.bodyType()+"\n"+
                "Wheel type - " + wheelStrategy.WheelType()+"\n"+
                "Fuel type - " + fuelStrategy.fueltype()+"\n";
    }


}
