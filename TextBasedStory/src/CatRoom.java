import java.util.Scanner;

public class CatRoom extends Room{
	public CatRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("SOLVE THIS PROBLEM TO GO TO THE NEXT LEVEL!");
		problem();
	}
	public static void problem() {
		System.out.print(9);

	}
}

                                              