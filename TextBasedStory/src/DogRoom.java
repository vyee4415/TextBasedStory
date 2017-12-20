import java.util.Scanner;

public class DogRoom extends Room{
	
	public DogRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		double a = Math.random()*10;
		double b = Math.random()*10;
		Math.round (a); 
		Math.round (b);  
		setde(true);
		// TODO Auto-generated method stub
		occupant = x;
		System.out.println("SOLVE THIS PROBLEM TO COLLECT ALL THE DOGS");
//		if(problem(a,b)!=a*b) {
//			System.out.println("THE DOGS BIT U");
//			x.setxLoc(this.xLoc);
//			x.setyLoc(this.yLoc);
//		}
//	}
//	public static int problem(double a, double b) {
//		Scanner reader = new Scanner(System.in);
//		System.out.println("WHAT'S " + a + " X " + b + " ?");
//		int n = reader.nextInt();
//		reader.close(); 
//		return n;
//	}
}
                                                                                             