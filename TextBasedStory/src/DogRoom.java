
// Vivian Yee
// Period 2

// Dog room

// This room has dogs and the user must solve the math problem to collect them all
// If the user answers it wrong, the dogs will bite them and they will lose


import java.util.InputMismatchException;
import java.util.Scanner;

public class DogRoom extends Room{
	public DogRoom(int x, int y) {
		super(x, y); // Carries coordinates, x and y
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// creates random integers for the problem
		int c = (int) (Math.random()*10);
		int d = (int) (Math.random()*10);
		
		// board knows to display "D" on the location of this room
		setde(true);
		// shows user is at this location
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		// TODO Auto-generated method stub
		occupant = x;
		
		System.out.println("- DOG ROOM -");
		System.out.println("SOLVE THIS PROBLEM TO COLLECT ALL THE DOGS");
		
		// if the answer is right, they will collect the dogs
		if(problem(c,d)==c*d) {
			System.out.println("YOU COLLECTED THE DOGS");
			setDog(true);
		}
	}
	
	// problem method
	public static int problem(double c, double d) {
		Scanner reader = new Scanner(System.in);
		
		// asks user what the product of the random integers are
		System.out.println("WHAT'S " + c + " X " + d + " ?");
		try {
			int n = reader.nextInt();
			if(n!=c*d) { // if the answer is wrong, the dogs will bite them and the user will lose
				System.out.println("THE DOGS BIT U");
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