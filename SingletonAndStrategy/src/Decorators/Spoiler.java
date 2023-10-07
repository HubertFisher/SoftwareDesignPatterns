package Decorators;

import Application.Car;

public class Spoiler extends CarBodyKitDecorator{
   public Spoiler(Car car){
       super(car);

    }
    @Override
    public String getDescription() {
       return car.getDescription() + "\n"+
               "Mod - Spoiler";
    }
}
