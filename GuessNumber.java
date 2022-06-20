import java.lang.Math;
import java.util.Random;

class GuessGame {
    GuessGame(String name) {
        String playerName = name;
        int tries = 0;
        int randomNumber = Random.nextInt(100);
    }

    public void play(){
        guess=Integer.parseInt(System.console().readLine());
    }

}

public class GuessNumber {

    public static void main(String[] args) {
        GuessGame game = new GuessGame("John");

        // int number = Random.nextInt(100);
        // int guess = 0;
        // int count = 0;
        // while (guess != number) {
        //     count++;
        //     System.out.print("Enter your guess: ");
        //     guess = Integer.parseInt(System.console().readLine());
        //     if (guess > number) {
        //         System.out.println("Too high");
        //     } else if (guess < number) {
        //         System.out.println("Too low");
        //     } else {
        //         System.out.println("You got it!");
        //     }
        // }
        // System.out.println("It took you " + count + " tries.");
    }
}