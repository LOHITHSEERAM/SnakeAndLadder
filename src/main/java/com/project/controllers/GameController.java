package com.project.controllers;

import com.project.models.Game;
import com.project.models.Player;
import com.project.models.Thing;
import com.project.models.ThingType;

import java.util.List;
import java.util.Map;

public class GameController {

    Game game;

    public GameController(int size) {
        this.game = new Game(size);
    }

    public void insertThing(int from, int to,  ThingType thingType) {
        game.getBoard().getThingMap().put(from,new Thing(from,to,thingType));
    }

    public void insertPlayer(Player player) {
        game.setPlayer(player);
    }

    public boolean moveMove(int val) throws InterruptedException {
       return game.makeMove(val);
    }






}
