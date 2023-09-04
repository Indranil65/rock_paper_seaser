package javafullcourse;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_seaser_exer2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 0 for Rock, 1 for paper, 2 for seissor");
		int userInput = sc.nextInt();
		
		Random random = new Random();
		int computerInput = random.nextInt(3);
		
		if(userInput == computerInput) {
			System.out.println("Draw");
		}
		else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput ==1) {
			System.out.println("you win!");
		}
		else {
			System.out.println("computer Win!");
		}
		//System.out.println("Computer choice: " + computerInput);
		if(computerInput == 0) {
			System.out.println("Computer choice: Rock");
		}
		else if(computerInput == 1) {
			System.out.println("Computer choice: paper");
		}
		else if(computerInput == 2) {
			System.out.println("Computer choice: seissors");
		}

	}

}
