package com.company;

public class RhythmInstrumentFactory extends AbstractInstrumentFactory{
    @Override
    public Noisable createDrum() {
        return new RhythmCounter(new Drum());
    }

    @Override
    public Noisable createPiano() {
        return new RhythmCounter(new Piano());
    }

    @Override
    public Noisable createSaxophone() {
        return new RhythmCounter(new Saxophone());
    }
}
