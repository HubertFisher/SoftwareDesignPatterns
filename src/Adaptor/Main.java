package Adaptor;

public class Main {
    public static void main(String[] args) {
        IAmericanSpeedSystem speedSystem = new SimpleAmericanSpeedChecker();
        Toyota cruzack = new Toyota();
        System.out.println(cruzack.speed(speedSystem));
        IAmericanSpeedSystem speedSystem1  = new SpeedAdapter( new SimpleEuropeanSpeedChecker());
        System.out.println(cruzack.speed(speedSystem1));

    }
}
