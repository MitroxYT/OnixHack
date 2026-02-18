package onix.events.impl;


import onix.events.api.events.Event;

public class WorldChangeEvent implements Event {
    
    private static final WorldChangeEvent INSTANCE = new WorldChangeEvent();
    
    public static WorldChangeEvent get() {
        return INSTANCE;
    }
}