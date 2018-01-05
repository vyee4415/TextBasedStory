
// Vivian Yee
// Period 2

// Snake room

// This room has snakes and the user must solve the math problem to collect them all
// If the user answers it wrong, the snakes will get them and they will lose


import java.util.InputMismatchException;
import java.util.Scanner;

public class SnakeRoom extends Room{
	public SnakeRoom(int x, int y) {
		super(x, y); // Carries coordinates, x and y
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// creates random integers for the problem
		int a = (int) (Math.random()*100);
		int b = (int) (Math.random()*100);

		// board knows to display "S" on the location of this room
		setse(true);
		
		// shows user is at this location
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		// TODO Auto-generated method stub
		occupant = x;
		
		System.out.println("- SNAKE ROOM -");
		System.out.println("SOLVE THIS PROBLEM TO COLLECT ALL THE SNAKES");
		
		// if the answer is right, they will collect the snakes
		if(problem(a,b)==a*b) {
			System.out.println("YOU COLLECTED THE SNAKES");
			setSnake(true);
		}
	}
	public static int problem(double a, double b) {
		Scanner reader = new Scanner(System.in);
		
		// asks user what the product of the random integers are
		System.out.println("WHAT'S " + a + " X " + b + " ?");
		try {
			int n = reader.nextInt();
			if(n!=a*b) { // if the answer is wrong, the dogs will getthem and the user will lose
				System.out.println("THE SNAKES GOT U");
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