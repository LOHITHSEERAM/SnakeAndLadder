package com.project;

import com.project.controllers.GameController;
import com.project.models.Player;
import com.project.models.ThingType;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // intialize game
        // take input indexes for snakes and ladder
        //take input for players
        //start game
        //generate random numbers from 1 to 6 for each player

        //if any player reaches size declare player win and remove player

        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the board: ");
        int size = scanner.nextInt();
        GameController gameController = new GameController(size);
        System.out.println("Please enter the number of snakes on board: ");
        int snakes = scanner.nextInt();
        for (int i = 0; i < snakes; i++) {
            int from  = scanner.nextInt();
            int to = scanner.nextInt();
            gameController.insertThing(from,to, ThingType.Snake);
        }
        System.out.println("Please enter the number of ladders on board: ");
        int ladders = scanner.nextInt();
        for (int i = 0; i < ladders; i++) {
            int from  = scanner.nextInt();
            int to = scanner.nextInt();
            gameController.insertThing(from,to, ThingType.Ladder);
        }

        System.out.println("Enter no of players");
        int players = scanner.nextInt();
        for (int i = 0; i < players; i++) {
            System.out.println("Enter player name: ");
            String player = scanner.next();
            gameController.insertPlayer(new Player(100+i,player));
        }

        Random random = new Random();
        while(true) {
            System.out.print("Rolling dice"+" ");
            int diceVal = random.nextInt(0,6)+1;
            System.out.println(diceVal);
            boolean b = gameController.moveMove(diceVal);
            if(b) {
                break;
            }
        }
    }
}