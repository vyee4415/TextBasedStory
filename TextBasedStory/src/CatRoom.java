import java.util.InputMismatchException;
import java.util.Scanner;

public class CatRoom extends Room{
	public CatRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		int g = (int) (Math.random()*10);
		int f = (int) (Math.random()*10);
		Math.round (g); 
		Math.round (f);
		setce(true);
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		// TODO Auto-generated method stub
		occupant = x;
		System.out.println("SOLVE THIS PROBLEM TO COLLECT ALL THE CATS");
		if(problem(g,f)==g*f) {
			setCat(true);
		}
	}
	public static int problem(double g, double f) {
		Scanner reader = new Scanner(System.in);
		System.out.println("WHAT'S " + g + " X " + f + " ?");
		try {
			int n = reader.nextInt();
			if(n!=g*f) {
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

                                              