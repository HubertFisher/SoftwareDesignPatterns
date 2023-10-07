package Decorators;

import Application.Car;


public abstract class CarBodyKitDecorator extends Car {
    Car car;
    public abstract String getDescription();
    public CarBodyKitDecorator(Car car){
        this.car = car;
    }
}
