package com.company;

public class InstrumentSimulator {

    public static void main(String[] args) {
        InstrumentSimulator simulator= new InstrumentSimulator();
        AbstractInstrumentFactory instrumentFactory = new RhythmInstrumentFactory();
        simulator.simulate(instrumentFactory);
    }
    void simulate(AbstractInstrumentFactory instrumentFactory){
        Orchestra orchestra=new Orchestra();
        Noisable beatbox = new BeatboxAdapter(new Beatbox());
        Noisable drum = instrumentFactory.createDrum();
        Noisable piano = instrumentFactory.createPiano();
        Noisable saxophone = instrumentFactory.createSaxophone();
        System.out.println("The person who is doing Beatbox, makes sound as Instrument");
        orchestra.add(beatbox);
        orchestra.add(drum);
        orchestra.add(piano);
        orchestra.add(saxophone);

        Orchestra allSaxophone = new Orchestra();
        Noisable saxophone1 = instrumentFactory.createSaxophone();
        Noisable saxophone2 = instrumentFactory.createSaxophone();
        Noisable saxophone3 = instrumentFactory.createSaxophone();
        allSaxophone.add(saxophone1);
        allSaxophone.add(saxophone2);
        allSaxophone.add(saxophone3);

        System.out.println("Observer Instrument Simulator");
        System.out.println("-------------------------------");
        System.out.println("Mixed Orchestra");
        Noisologist noisologist1 = new Noisologist();
        orchestra.registerObserver(noisologist1);
        simulate(orchestra);
        System.out.println("-------------------------------");
        System.out.println("Saxophone Orchestra");
        Noisologist noisologist2 = new Noisologist();
        allSaxophone.registerObserver(noisologist2);
        simulate(allSaxophone);

        System.out.println("Rhythm : "+RhythmCounter.getRhythm());
    }
    void simulate (Noisable instrument){
        instrument.makeNoise();
    }
}
