import java.util.InputMismatchException;
import java.util.Scanner;

public class CatRoom extends Room{
	public CatRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		int a = (int) (Math.random()*10);
		int b = (int) (Math.random()*10);
		Math.round (a); 
		Math.round (b);
		setce(true);
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		// TODO Auto-generated method stub
		occupant = x;
		System.out.println("SOLVE THIS PROBLEM TO COLLECT ALL THE CATS");
		problem(a,b);
	}
	public static int problem(double a, double b) {
		Scanner reader = new Scanner(System.in);
		System.out.println("WHAT'S " + a + " X " + b + " ?");
		try {
			int n = reader.nextInt();
			if(n!=a*b) {
				System.out.println("THE CATS SCRATCHED U");
				Runner.gameOff();
			}
			return n;
		}
		catch(InputMismatchException e) {
			System.out.println("That wasn't a number!");
			return (-1);
		}
	}
}

                                              