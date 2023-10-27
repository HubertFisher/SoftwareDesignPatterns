package Strategies.TransmissionStrategies;

import Strategies.TransmissionStrategies.InterfaceStr.ITransmissionStrategy;

public class AutomaticTransmission implements ITransmissionStrategy {

    @Override
    public String transmissionType() {
        return "Automatic";
    }
}
