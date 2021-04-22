package com.company;

public abstract class AbstractInstrumentFactory {
    public abstract Noisable createDrum();
    public abstract Noisable createPiano();
    public abstract Noisable createSaxophone();
}
