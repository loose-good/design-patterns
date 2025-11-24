package p8.factories;

import p8.Brake;
import p8.HHBrake;
import p8.NormalBrake;

public class BrakeFactoryImpl implements BrakeFactory{
    @Override
    public Brake createBrake(String type) {
        switch (type) {
            case "Normal": return new NormalBrake();
            case "HH": return new HHBrake();
            default: throw new UnknownBrakeTypeException();
        }
    }
}
