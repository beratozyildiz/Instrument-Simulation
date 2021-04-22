package com.company;
import com.company.Observer;

public interface InstrumentObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
