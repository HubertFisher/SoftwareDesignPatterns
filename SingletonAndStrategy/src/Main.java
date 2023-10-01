// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            FrontWheelStrategy frontWheel = new FrontWheelStrategy();
            RearWheelStrategy rearWheel = new RearWheelStrategy();
            Car bmw_M5 = new Car(rearWheel);
            Car lada_Granta = new Car(frontWheel);
            System.out.println(bmw_M5.getWheelStrategy().WheelType());
            System.out.println(lada_Granta.getWheelStrategy().WheelType());

        }
    }
