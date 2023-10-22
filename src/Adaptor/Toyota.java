package Adaptor;

import Adaptor.interfaces.IAmericanSpeedSystem;

public class Toyota   {
    private final float miles;
    private final float time;
    public Toyota(){
        this.miles =(float)(Math.random()*200+1);
        this.time = (float)(Math.random()*2+1);
        }
    public String speed(IAmericanSpeedSystem speedSystem) {
       return speedSystem.speed(miles,time);
    }
}
