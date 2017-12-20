import java.util.Scanner;

public class SnakeRoom extends Room{
	public SnakeRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		double a = Math.random()*10;
		double b = Math.random()*10;
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("SOLVE THIS PROBLEM TO COLLECT ALL THE SNAKES");
		if(problem(a,b)!=a*b) {
			System.out.println("THE SNAKES GOT U");
		}
	}
	public static int problem(double a, double b) {
		Scanner reader = new Scanner(System.in);
		System.out.println("WHAT'S " + a + " X " + b + " ?");
		int n = reader.nextInt();
		reader.close(); 
		return n;
	}
}


                                              