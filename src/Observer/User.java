package Observer;

import Observer.ISubscriber;

public class User implements ISubscriber {
    private final String login;
    private final String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public void update(String newCar) {
        System.out.println(newCar);
    }
}