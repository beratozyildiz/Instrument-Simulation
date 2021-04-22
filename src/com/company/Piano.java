package com.company;

import com.company.Observable;
public class Piano implements Noisable{
    Observable observable;
    public Piano(){
        observable = new Observable(this);
    }
    @Override
    public void makeNoise() {
        System.out.println("Dan daaa da da da dan");
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
