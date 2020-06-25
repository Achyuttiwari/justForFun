/*
 *   Created by IntelliJ IDEA.
 *   User: Tiwari
 *   Date: 6/25/2020
 *   Time: 10:08 PM
 */
package challengeGame;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to the Game");
        System.out.println("May, I know your name.?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Hello " + name + " \uD83D\uDE09");

        System.out.println("Shall we start the game");
        System.out.println("\tPress 1. for YES");
        System.out.println("\tPress 2. for NO");

        int userInput = scanner.nextInt();

        while(userInput != 1){
            System.out.println("Shall we start the game");
            System.out.println("\tPress 1. for YES");
            System.out.println("\tPress 2. for NO");

            userInput = scanner.nextInt();

        }
        Random random = new Random();
        int rno = random.nextInt(20) + 1;
        System.out.println("Please guess the number...");
        int guessedNumber = scanner.nextInt();

    }
}
