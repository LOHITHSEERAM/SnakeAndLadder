package com.project.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Game {

    Board board;

    GameState gameState;

    public Game(int size) {
        this.board = new Board(size);
        players = new ArrayList<>();
    }

    Stack<Move> moves = new Stack<>();

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Stack<Move> getMoves() {
        return moves;
    }

    public void setMoves(Stack<Move> moves) {
        this.moves = moves;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(Player player) {
        this.players.remove(player);
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    List<Player> players;

    int nextPlayerIndex = 0;


    public boolean makeMove(int diceVal) throws InterruptedException {
        int playerIndex = nextPlayerIndex%players.size();
        Player player = players.get(playerIndex);
        int nextPos = player.getPos()+diceVal;
        if(board.getThingMap().containsKey(nextPos)) {
            nextPos = board.getThingMap().get(nextPos).ToIndex;
        }
        if(nextPos>board.getSize()) {
            System.out.println("Cant move as pos grater than size of board");
            return false;
        }
        player.updatePos(nextPos);
        System.out.println("Player " + player.getId() + " has rolled " + diceVal + " and moved to " +nextPos);
        Move move = new Move(nextPos,player);
        getMoves().push(move);


        if(nextPos==board.getSize()) {
            System.out.println("Player " + player.getId() + " has finished the game");
            players.remove(playerIndex);
            return players.size() == 1;
        }
        if(diceVal !=6) {
            nextPlayerIndex++;
        }
        else {
            System.out.println("Player " + player.getId() + " roll again as val is 6");
        }
        return false;
    }
}
