package Observer;

import java.util.ArrayList;

public class CarManager implements IPublisher {
    private final ArrayList<ISubscriber> subscribers;

    public CarManager() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unSubscribe(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String newInfo) {
        for(ISubscriber subscriber : subscribers) {
            subscriber.update(newInfo);
        }
    }
}