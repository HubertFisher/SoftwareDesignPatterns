package Decorators;

import Application.Car;

public class SideSkirts extends CarBodyKitDecorator{
    public SideSkirts(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + "\n"+
                "Mod - Side Skirts";
    }
}
