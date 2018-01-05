
// Vivian Yee
// Period 2

// Cat room

// This room has cats and the user must solve the math problem to collect them all
// If the user answers it wrong, the cats will scratch them and they will lose


import java.util.InputMismatchException;
import java.util.Scanner;

public class CatRoom extends Room{
	public CatRoom(int x, int y) {
		super(x, y); // Carries coordinates, x and y
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// creates random integers for the problem
		int g = (int) (Math.random()*100);
		int f = (int) (Math.random()*10);

		// board knows to display "C" on the location of this room
		setce(true);
		
		// shows user is at this location
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		// TODO Auto-generated method stub
		occupant = x;
		
		System.out.println("- CAT ROOM -");
		System.out.println("SOLVE THIS PROBLEM TO COLLECT ALL THE CATS");
		
		// if the answer is right, they will collect the cats
		if(problem(g,f)==g*f) {
			System.out.println("YOU COLLECTED THE CATS");
			setCat(true);
		}
	}
	public static int problem(double g, double f) {
		Scanner reader = new Scanner(System.in);		
		
		// asks user what the product of the random integers are
		System.out.println("WHAT'S " + g + " X " + f + " ?");
		try {
			int n = reader.nextInt();
			if(n!=g*f) { // if the answer is wrong, the cats will scratch them and the user will lose
				System.out.println("THE CATS SCRATCHED U");
				Runner.gameOff();
			}
			return n; // if it is right, return the number back
		}
		catch(InputMismatchException e) {
			System.out.println("That wasn't a number!"); // if the input wasn't a number, they will have to exit the room
			return (-1);
		}
	}
}

                                              