package Application;

import Car.BMW;
import Car.Ferrari;
import Observer.Showroom;
import Observer.User;
import Strategies.BodyStrategies.CoupeBodyStrategy;
import Strategies.BodyStrategies.SedanBodyStrategy;
import Strategies.TransmissionStrategies.AutomaticTransmission;
import Strategies.WheelStrategies.RearWheelStrategy;
import Strategies.fuelStrategies.GasolinefuelStrategy;

public class Main {
    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        User user1 = new User("HelloKitty", "152354");
        User user2 = new User("ByeByeKitty", "password");

        showroom.subscribe(user1);
        showroom.subscribe(user2);

        BMW M5 = new BMW("M5", new SedanBodyStrategy(),new GasolinefuelStrategy(),new RearWheelStrategy(),new AutomaticTransmission());
        Ferrari LaFerrari = new Ferrari("LaFerrari", new CoupeBodyStrategy(),new GasolinefuelStrategy(),new RearWheelStrategy(),new AutomaticTransmission());

        showroom.addCar(M5);
        showroom.unSubscribe(user2);
        showroom.deleteCar(M5);
        showroom.addCar(LaFerrari);
    }
}