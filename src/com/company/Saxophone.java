package com.company;

import com.company.Observable;
public class Saxophone implements Noisable{
    Observable observable;
    public Saxophone(){
        observable= new Observable(this);
    }
    @Override
    public void makeNoise() {
        System.out.println("Düüt, Düü Rüü Rü");
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
