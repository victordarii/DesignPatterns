package com.observerPattern;

// The Observer interface is implemented by all observers, so they all have to implement the update() method.
public interface Observer {

    //These are the state values the Observers get from the Subject when a weather measurement changes
    public void update(float temp, float humidity, float pressure);
}

/**
 * All potential Observers need to implement the Observer interface.
 * This Interface just have one method, update(), that gets called when the Subject's state changes.
 */
