package com.project.models;

public class Move {

    int pos;

    public Move(int nextPos, Player player) {
        this.pos = nextPos;
        this.player = player;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    Player player;
}
