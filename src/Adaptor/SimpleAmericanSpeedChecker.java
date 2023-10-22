package Adaptor;

public class SimpleAmericanSpeedChecker implements IAmericanSpeedSystem{
    @Override
    public String speed(float miles, float time) {
        return miles/time +"ml/h";
    }
}
