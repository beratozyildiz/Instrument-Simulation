package com.company;
import com.company.Observer;
public class Noisologist implements Observer{
    @Override
    public void update(InstrumentObservable instrument) {
        System.out.println("Noisologist: " + instrument + " played");
    }
}
