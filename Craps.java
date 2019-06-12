import java.util.Scanner;
import java.lang.Math;

public class Craps{
	public static void main(String arg[]){
		System.out.println("Let's play Craps!");
		int die1 = (int)(Math.random() * 6) + 1;
		int die2 = (int)(Math.random() * 6) + 1;
		int dice = die1 + die2;
        System.out.println("First roll: " + dice);
		
		if (dice == 2 || dice == 3 || dice == 12){
			System.out.println("You Lose!");

		}
		else if (dice == 7 || dice == 11){
			System.out.println("You Win!");
		}
		else{
			int point = dice;
            dice = 0;
			while (dice != point && dice != 7){
                System.out.println("Roll again");
                die1 = (int)(Math.random() * 6) + 1;
                die2 = (int)(Math.random() * 6) + 1;
                dice = die1 + die2;
                System.out.print("\n");
                System.out.println("Next Roll: " + dice);
                
            }
            if (dice == 7){
                System.out.println("You Lose!");
            }
            else if (dice == point){
                System.out.println("You Win!");
            }
            
        }
    }
        }
        
