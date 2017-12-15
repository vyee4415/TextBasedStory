import java.util.Scanner;

public class SnakeRoom extends Room{
	public SnakeRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("SOLVE THIS PROBLEM TO COLLECT ALL THE SNAKES");
		problem();
	}
	public static void problem() {
		double a = Math.random()*10;
		double b = Math.random()*10;
		System.out.println("WHAT'S " + a + " X " + b + " ?");
	}
}


                                              