package Strategies.TransmissionStrategies;

import Strategies.TransmissionStrategies.InterfaceStr.ITransmissionStrategy;

public class RobotTransmission implements ITransmissionStrategy {
    @Override
    public String transmissionType() {
        return "Robot";
    }
}
