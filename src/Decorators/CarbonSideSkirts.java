package Decorators;

import Car.Car;

public class CarbonSideSkirts extends CarBodyKitDecorator{
    public CarbonSideSkirts(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() +
                "with Carbon Side Skirts";
    }
}
