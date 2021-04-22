package com.company;

import com.company.Observable;
public class Drum implements Noisable{
    Observable observable;

    public Drum(){
        observable = new Observable(this);
    }
    @Override
    public void makeNoise() {
        System.out.println("Tas taka tas tak");
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
