import java.util.*;

public class assignment5 {
    public static void main (String[] args) {
        // declare the program function
        System.out.println("This program guesses numbers between 1 and 50 inclusive until it makes a guess of at least 48.");
        System.out.println();
        
        // call the method makeGuesses
        makeGuesses();
    }
    
    public static void makeGuesses() {
        Random rand = new Random();
        int guessNum = rand.nextInt(50) + 1;
        int guessCount = 0;
        
        while (guessNum <= 47) {
            System.out.println("guess = " + guessNum);
            guessNum = rand.nextInt(50) + 1;
            guessCount++;
        }
        guessCount++;
        
        System.out.println("guess = " + guessNum);
        System.out.println("total guesses = " + guessCount);
    }
}