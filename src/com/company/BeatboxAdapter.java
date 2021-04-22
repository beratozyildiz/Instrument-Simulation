package com.company;

import com.company.Observable;
public class BeatboxAdapter implements Noisable {
    Observable observable;
    Beatbox beatbox;
    public BeatboxAdapter(Beatbox beatbox) {
        this.beatbox = beatbox;
        observable = new Observable(this);
    }
    @Override
    public void makeNoise() {
        beatbox.makeNoiseFromMouth();
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
