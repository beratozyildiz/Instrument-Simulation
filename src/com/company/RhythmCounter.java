package com.company;
import com.company.Observable;
public class RhythmCounter implements Noisable{
    Noisable instrument;
    static int rhythmCount;
    public RhythmCounter(Noisable instrument){
        this.instrument=instrument;
    }
    @Override
    public void makeNoise() {
        instrument.makeNoise();
        rhythmCount++;
    }
    @Override
    public void registerObserver(Observer observer) {
        instrument.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        instrument.notifyObservers();
    }
    public static int getRhythm(){
        return rhythmCount;
    }
}
