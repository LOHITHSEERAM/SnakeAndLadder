package com.project.models;

public class Thing {

    int fromIndex;

    int ToIndex;

    public Thing(int from, int to, ThingType thingType) {
        this.fromIndex = from;
        this.ToIndex = to;
        this.thingType = thingType;
    }

    public int getFromIndex() {
        return fromIndex;
    }

    public void setFromIndex(int fromIndex) {
        this.fromIndex = fromIndex;
    }

    public int getToIndex() {
        return ToIndex;
    }

    public void setToIndex(int toIndex) {
        ToIndex = toIndex;
    }

    public ThingType getThingType() {
        return thingType;
    }

    public void setThingType(ThingType thingType) {
        this.thingType = thingType;
    }

    ThingType thingType;
}
