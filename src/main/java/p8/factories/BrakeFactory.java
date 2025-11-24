package p8.factories;

import p8.Brake;

public interface BrakeFactory {
    Brake createBrake(String type);
}
