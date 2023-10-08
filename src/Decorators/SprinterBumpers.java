package Decorators;

import Car.Car;

public class bumpers extends CarBodyKitDecorator{
    public bumpers(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + "\n"+
                ",with SprBumpers";
    }
}
