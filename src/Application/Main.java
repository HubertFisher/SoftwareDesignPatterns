package Application;

import Decorators.SideSkirts;
import Decorators.Spoiler;
import Decorators.bumpers;
import Strategies.BodyStrategies.CoupeBodyStrategy;
import Strategies.BodyStrategies.SUVBodyStrategy;
import Strategies.BodyStrategies.SedanBodyStrategy;
import Strategies.WheelStrategies.FrontWheelStrategy;
import Strategies.WheelStrategies.RearWheelStrategy;
import Strategies.fuelStrategies.DieselfuelStrategy;
import Strategies.fuelStrategies.ElectrofuelStrategy;
import Strategies.fuelStrategies.GasolinefuelStrategy;

public class Main {
    public static void main(String[] args) {

        Car Jeep_Grand_Cherokee = new Car( "Jeep Grand Cherokee ",new SUVBodyStrategy(), new GasolinefuelStrategy(), new RearWheelStrategy());
        Car hyundai_g30 = new Car( "hyundai g30",new SedanBodyStrategy(), new GasolinefuelStrategy(), new FrontWheelStrategy());
        Car Toyota_bZ4X = new Car("Toyota bZ4X",new SUVBodyStrategy(), new ElectrofuelStrategy(), new FrontWheelStrategy());
        Car BYD_Han = new Car("BYD Han" ,new SedanBodyStrategy(), new ElectrofuelStrategy(), new RearWheelStrategy());

        System.out.println(Jeep_Grand_Cherokee.getDescription());
        System.out.println(hyundai_g30.getDescription());
        System.out.println(Toyota_bZ4X.getDescription());
        System.out.println(BYD_Han.getDescription());

        Car hyundai_g30_modded = new SideSkirts(new bumpers( new Spoiler(hyundai_g30)));
        System.out.println(hyundai_g30_modded.getDescription());

    }
}
