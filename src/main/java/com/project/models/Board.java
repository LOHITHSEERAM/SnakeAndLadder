package com.project.models;

import java.util.HashMap;
import java.util.Map;

public class Board {
    public Board(int size) {
        this.size = size;
        thingMap = new HashMap<Integer, Thing>();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Map<Integer, Thing> getThingMap() {
        return thingMap;
    }

    public void setThingMap(Map<Integer, Thing> thingMap) {
        this.thingMap = thingMap;
    }

    int size;

    Map<Integer,Thing> thingMap;
}
