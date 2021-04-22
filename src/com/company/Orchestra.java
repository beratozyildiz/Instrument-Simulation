package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import com.company.Observable;

public class Orchestra implements Noisable{
    Observable observable;
    ArrayList<Noisable> orchestra = new ArrayList();

    public void add(Noisable instrument){
        orchestra.add(instrument);
    }
    @Override
    public void makeNoise() {
        Iterator<Noisable> iterator=orchestra.iterator();
        while (iterator.hasNext()){
            Noisable instrument = (Noisable) iterator.next();
            instrument.makeNoise();
        }
    }
    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = orchestra.iterator();
        while (iterator.hasNext()) {
            Noisable instrument = (Noisable) iterator.next();
            instrument.registerObserver(observer);
        }
    }
    @Override
    public void notifyObservers() {

    }
}
