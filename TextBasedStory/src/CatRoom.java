import java.util.Scanner;

public class CatRoom extends Room{
	public CatRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		double a = Math.random()*10;
		double b = Math.random()*10;
		Math.round (a); 
		Math.round (b);
		setce(true);
		// TODO Auto-generated method stub
		occupant = x;
		System.out.println("SOLVE THIS PROBLEM TO COLLECT ALL THE CATS");
//		if(problem(a,b)!=a*b) {
//			System.out.println("THE CATS SCRATCHED U");
//			x.setxLoc(this.xLoc);
//			x.setyLoc(this.yLoc);
		}
	}
//	public static int problem(double a, double b) {
//		Scanner reader = new Scanner(System.in);
//		System.out.println("WHAT'S " + a + " X " + b + " ?");
//		int n = reader.nextInt();
//		reader.close(); 
//		return n;
//	}
//}

                                              