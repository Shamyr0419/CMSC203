import java.util.Scanner;

// This is beginning of code for RandomNumberGuesser 
//Programmer - Shamyr Douglas
public class RandomNumberGuesser {

	public static void main(String[] args) {
		
		int randNum = RNG.rand();
		int lowGuess = 0;
		int highGuess = 100;
		int nextGuess = 0;
		String repeat = "yes";
		Scanner scan = new Scanner(System.in);
		
		do {
		
			RNG.resetCount();
			lowGuess = 0;
			highGuess = 100;
			randNum = RNG.rand();
			System.out.println("We are going to play the number guessing game! Guess the number between 0 and 100.");
			System.out.println("Enter your first guess:");
			nextGuess = scan.nextInt();
			scan.nextLine();
			
			if (!RNG.inputValidation(nextGuess, lowGuess, highGuess)) {
				nextGuess = scan.nextInt();
				scan.nextLine();
			}
			do {
						
				if (nextGuess < randNum) {
					System.out.println("Number of guesses is " + RNG.getCount());
					System.out.println("Your guess is too low ");
					lowGuess = nextGuess;
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
					nextGuess = scan.nextInt();
					scan.nextLine();
					
					if (!RNG.inputValidation(nextGuess, lowGuess, highGuess)) {
						nextGuess = scan.nextInt();
						scan.nextLine();
					}		
				}
		
				else if (nextGuess > randNum) {
					System.out.println("Number of guesses is " + RNG.getCount());
					System.out.println("Your guess is too high ");
					highGuess = nextGuess;
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
					nextGuess = scan.nextInt();
					scan.nextLine();
					
					if (!RNG.inputValidation(nextGuess, lowGuess, highGuess)) {
						nextGuess = scan.nextInt();
						scan.nextLine();
					}
			
				}
		
			}while(nextGuess != randNum);
			
			if (nextGuess == randNum) {
				System.out.println("Number of guesses is " + RNG.getCount());
				System.out.println("Congratulations, you guessed correctly!");
				System.out.println("Try again? (yes or no)");
				repeat = scan.nextLine();
			}
		}while(repeat.equals("yes"));
		
		if (repeat.equals("no")) {
			System.out.println("Thanks for playing...");
			System.out.println("PROGRAMMER: Shamyr Douglas");
			System.exit(0);
		}
	}

}
