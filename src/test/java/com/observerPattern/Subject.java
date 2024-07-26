package com.observerPattern;

public interface Subject extends Observer{


    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver(); // called to notify all observers when the Subject's state has changed
}

/**
 * Objects use this Intervace to register as Observers and also to remove themself from being Observers.
 *
 */
