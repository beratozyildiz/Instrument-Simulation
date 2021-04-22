package com.company;

public class InstrumentFactory extends AbstractInstrumentFactory{
    @Override
    public Noisable createDrum() {
        return new Drum();
    }

    @Override
    public Noisable createPiano() {
        return new Piano();
    }

    @Override
    public Noisable createSaxophone() {
        return new Saxophone();
    }
}
