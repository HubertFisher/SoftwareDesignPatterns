package Observer;
import Car.*;
import java.util.ArrayList;

public class Showroom {
    private final IPublisher carManager;
    private final ArrayList<Car> cars;

    public Showroom() {
        this.carManager = new CarManager();
        this.cars = new ArrayList<>();
    }

    public void subscribe(ISubscriber subscriber) {
        carManager.subscribe(subscriber);
    }

    public void unSubscribe(ISubscriber subscriber) {
        carManager.unSubscribe(subscriber);
    }

    public void addCar(Car car) {
        cars.add(car);
        carManager.notifySubscribers("New car!!, \n" + car.getDescription());
    }

    public void deleteCar(Car car) {
        cars.remove(car);
        carManager.notifySubscribers(car.getDescription() + ", is sold");
    }
}