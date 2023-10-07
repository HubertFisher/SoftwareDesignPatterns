package Application;

import Strategies.BodyStrategies.interfaceStr.IBodyStrategy;
import Strategies.WheelStrategies.interfaceStr.IWheelStrategy;
import Strategies.fuelStrategies.interfaceStr.IfuelStrategy;

public  class Car {
    protected String name;
    private IBodyStrategy bodyStrategy;
    private IfuelStrategy fuelStrategy;
    private IWheelStrategy wheelStrategy;

    public Car(String name, IBodyStrategy bodyStrategy, IfuelStrategy fuelStrategy, IWheelStrategy wheelStrategy){
        this.name = name;
        this.bodyStrategy = bodyStrategy;
        this.fuelStrategy = fuelStrategy;
        this.wheelStrategy = wheelStrategy;
    }
    public Car() {}

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

    public  String getDescription(){
        return name+":\n"+
                "Body type - "+bodyStrategy.bodyType()+"\n"+
                "Wheel type - " + wheelStrategy.WheelType()+"\n"+
                "Fuel type - " + fuelStrategy.fueltype()+"\n";
    }

}
