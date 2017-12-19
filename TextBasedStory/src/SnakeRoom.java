import java.util.Scanner;

public class SnakeRoom extends Room{
	public SnakeRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		int wrong = 0;
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("SOLVE THIS PROBLEM TO COLLECT ALL THE SNAKES");
		problem();
		if(n!=a*b) {
			if(wrong == 2) {
				System.out.println("THE SNAKES GOT YOU!");
				Runner.gameOff();
			}
			System.out.println("SNAKES ARE COMING TO YOU!");
			wrong++;
		}
	}
	public static int problem() {
		double a = Math.random()*10;
		double b = Math.random()*10;
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("WHAT'S " + a + " X " + b + " ?");
		int n = reader.nextInt();
		reader.close(); 
		return n;
	}
}


                                              