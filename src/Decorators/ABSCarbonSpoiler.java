package Decorators;

import Car.Car;

public class ABSCarbonSpoiler extends CarBodyKitDecorator{
   public ABSCarbonSpoiler(Car car){
       super(car);

    }
    @Override
    public String getDescription() {
       return car.getDescription() + "\n"+
               "Mod - Spoiler";
    }
}
