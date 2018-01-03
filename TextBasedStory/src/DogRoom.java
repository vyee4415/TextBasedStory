import java.util.InputMismatchException;
import java.util.Scanner;

public class DogRoom extends Room{
	public DogRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		int c = (int) (Math.random()*10);
		int d = (int) (Math.random()*10);
		setde(true);
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		// TODO Auto-generated method stub
		occupant = x;
		System.out.println("SOLVE THIS PROBLEM TO COLLECT ALL THE DOGS");
		if(problem(c,d)==c*d) {
			System.out.println("YOU COLLECTED THE DOGS");
			setDog(true);
		}
	}
	public static int problem(double c, double d) {
		Scanner reader = new Scanner(System.in);
		System.out.println("WHAT'S " + c + " X " + d + " ?");
		try {
			int n = reader.nextInt();
			if(n!=c*d) {
				System.out.println("THE DOGS BIT U");
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