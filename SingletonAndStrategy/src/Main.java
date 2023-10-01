import Strategies.BodyStrategies.CoupeBodyStrategy;
import Strategies.BodyStrategies.SUVBodyStrategy;
import Strategies.BodyStrategies.SedanBodyStrategy;
import Strategies.WheelStrategies.FrontWheelStrategy;
import Strategies.WheelStrategies.RearWheelStrategy;
import Strategies.fuelStrategies.DieselfuelStrategy;
import Strategies.fuelStrategies.ElectrofuelStrategy;
import Strategies.fuelStrategies.GasolinefuelStrategy;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CoupeBodyStrategy coupeBody = new CoupeBodyStrategy();
        SedanBodyStrategy sedanBody = new SedanBodyStrategy();

        DieselfuelStrategy dieselfuel = new DieselfuelStrategy();
        GasolinefuelStrategy gasolinefuel =new GasolinefuelStrategy();

        RearWheelStrategy rearWheel1 = new RearWheelStrategy();
        RearWheelStrategy rearWheel2 = new RearWheelStrategy();

        Car bmw_M5 = new Car(sedanBody,gasolinefuel,rearWheel1);
        Car Mercedes_Maybach_S = new Car(coupeBody,dieselfuel,rearWheel2);

        System.out.println(bmw_M5);
        System.out.println(Mercedes_Maybach_S);

        Car Jeep_Grand_Cherokee = new Car( new SUVBodyStrategy(), new GasolinefuelStrategy(), new RearWheelStrategy());
        Car hyundai_g30 = new Car( new SedanBodyStrategy(), new GasolinefuelStrategy(), new FrontWheelStrategy());
        Car Toyota_bZ4X = new Car( new SUVBodyStrategy(), new ElectrofuelStrategy(), new FrontWheelStrategy());
        Car BYD_Han = new Car( new SedanBodyStrategy(), new ElectrofuelStrategy(), new RearWheelStrategy());

        System.out.println(Jeep_Grand_Cherokee);
        System.out.println(hyundai_g30);
        System.out.println(Toyota_bZ4X);
        System.out.println(BYD_Han);


    }
}
