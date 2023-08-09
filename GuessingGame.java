
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    Random ram = new Random();

    int lb = 1;
    int ub = 100;
    int maxattempt = 5;
    int randomnumber = ram.nextInt(ub-lb +1)+lb;
    boolean guessedCorectly = false;
    int prize = 5000;
    int noOftries = 0;

    
    System.out.println("Welcome to my number guessing game");
    System.out.println("let's think of a number between " + lb + " - " + ub);
    System.out.println("you've " + maxattempt + " attempts it's just a game don't take it personally");

    while( noOftries < maxattempt && !guessedCorectly){
        if(!guessedCorectly){
            System.out.print("Enter your guess:");
            int userguess = sc.nextInt();
             noOftries++;

            if(userguess < randomnumber){
                System.out.println("your guess is too low");
            }else if(userguess > randomnumber){
                System.out.println("your guess is too high");
            }else{
                guessedCorectly = true;
                System.out.println("Congratulations! you won a voucher of " + prize + "rupees");
            }
            if(!guessedCorectly && noOftries < maxattempt){
                System.out.println("you've " + (maxattempt - noOftries) + " attempts left");
            }
        }
       
        if(!guessedCorectly && noOftries == maxattempt){
            System.out.println("sorry you've run out of attempts and the correct number is" +randomnumber);
        }
       
    }
     sc.close();
    }
}

