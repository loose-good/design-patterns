package p8.factories;

import p8.Body;

public interface BodyFactory {
    Body createBody(String type);
}
