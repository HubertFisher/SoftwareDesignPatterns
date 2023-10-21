package Application;
import Car.BMW;
import Car.Mercedes;
import Strategies.BodyStrategies.SedanBodyStrategy;
import Strategies.WheelStrategies.RearWheelStrategy;
import Strategies.fuelStrategies.GasolinefuelStrategy;

public class Main {
    public static void main(String[] args) {
        BMW M5 = new BMW("M5", new SedanBodyStrategy(),new GasolinefuelStrategy(), new RearWheelStrategy());
        System.out.println(M5.getDescription());
    }
}
