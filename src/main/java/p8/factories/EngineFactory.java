package p8.factories;

import p8.Engine;

public interface EngineFactory {
    Engine createEngine(String type);
}
