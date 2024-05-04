package com.project.models;

public class Player {

    int id;
    String name;

    public Player(int i, String player) {
        this.id = i;
        this.name = player;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getPos() {
        return pos;
    }

    public void updatePos(int pos) {
        this.pos = pos;
    }

    char symbol;

    int pos = 0;
}
