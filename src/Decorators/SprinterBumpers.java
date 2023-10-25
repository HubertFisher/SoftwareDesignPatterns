package Decorators;

import Car.Car;

public class SprinterBumpers extends CarBodyKitDecorator{
    public SprinterBumpers(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + "\n"+
                ",with SprBumpers";
    }
}
