public class Car {
    private final IWheelStrategy wheelStrategy;
    public Car(IWheelStrategy wheelStrategy){
        this.wheelStrategy = wheelStrategy;
    }

    public IWheelStrategy getWheelStrategy() {
        return wheelStrategy;
    }
}
