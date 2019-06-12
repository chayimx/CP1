import java.util.Scanner;

public class Dice{
	public static void main(String[] args){
    boolean playing = true;
        while (playing){
		Scanner kin = new Scanner(System.in);
		System.out.println("Rolling two dice");

		int die1 = (int) Math.ceil(Math.random() * 6);
		int die2 = (int) Math.ceil(Math.random() * 6);
		
		System.out.println("Die 1: " + die1);
		System.out.println("Die 2: " + die2);
		System.out.println("Sum of two dice: " + (die1 + die2));

		System.out.println("Would you like to roll again? (y/n)");
        String playagain = kin.nextLine();
                playing = playagain.equalsIgnoreCase("y");
                
    }
        System.out.println("Goodbye!");
	}
}
