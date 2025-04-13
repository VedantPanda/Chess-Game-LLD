package main.strategy.player.impl;

import main.strategy.player.PlayerStrategy;

import java.util.Scanner;

public class HumanPlayerStrategy implements PlayerStrategy {

    private final Scanner scanner;

    public HumanPlayerStrategy() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void makeMove() {
        while (true){
            System.out.println("Enter source row");
            int sourceRow = scanner.nextInt();
            System.out.println("Enter source column");
            int sourceCol = scanner.nextInt();
            System.out.println("Enter destination row");
            int destinationRow = scanner.nextInt();
            System.out.println("Enter destination column");
            int destinationColumn = scanner.nextInt();
        }

    }
}
