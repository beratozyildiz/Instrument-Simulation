package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import com.company.Observer;

public class Observable implements InstrumentObservable{
    ArrayList observers =new ArrayList();
    InstrumentObservable instrument;
    public Observable(InstrumentObservable instrument){
        this.instrument = instrument;
    }
    @Override
    public void registerObserver(Observer observer) {

        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer)iterator.next();
            observer.update(instrument);
        }
    }
}
