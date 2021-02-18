import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		
		// Task 1: the code below reads in the user's inputs of the movie title, rating, and 
		// number of tickets sold. those values are set, and then printed along one line at the end.
		
		Scanner keyboard = new Scanner(System.in);
		String repeat;
		
		do {
		
		Movie fMovie = new Movie();
		System.out.println("Enter the name of the movie");
		fMovie.setTitle(keyboard.nextLine());
		System.out.println("Enter the rating of the movie");
		fMovie.setRating(keyboard.nextLine());
		System.out.println("Enter the number of tickets sold for this movie");
		fMovie.setSoldTickets(keyboard.nextInt());	
		System.out.println(fMovie.toString());
		System.out.println("Do you want to enter another? (y or n) ");
		repeat = keyboard.next();
		keyboard.nextLine();
		} while (repeat.equals("y"));
		// Task 2: The do-while loop just above is what causes this program to run,
		// as long as the user enters "y" to keep going. Otherwise, the program ends.
		
		System.out.println("Goodbye");
		keyboard.close();
	}
}
