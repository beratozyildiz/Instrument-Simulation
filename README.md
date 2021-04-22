# Instrument-Simulation
Combining Software Design Principles with Java Language
In this project its used 6 patterns;
Decorator Pattern : Decorator pattern is used to count Rhythm’s.
Abstract Factory Pattern : Abstract Factory is used to instantiate the instrument objects.
We can choose whether the counting rhythm is included or not in the creation phase.
Composite Pattern : Composite pattern is used to create an Orchestra, we can put the
instrument and the number of instruments we want.
Adapter Pattern : Adapter pattern is used to adapt the Beatbox class to the system. The
system is based on instruments, makeNoise() method is for instruments not humans. In order
to adapt the human Beatboxers we implement the BeatboxAdapter.
Observer Pattern : Observer pattern is used to obtain real-time notification of which
instrument is played with Noisologist class.
Iterator Pattern : Iterator pattern is used when it is needed in basic, it iterates ArrayLists in
this system (For example orchestras and registering observers)
