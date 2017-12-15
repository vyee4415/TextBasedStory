import java.util.Scanner;

public class DogRoom extends Room{
	
	public DogRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("YOU BETTER RUN THERE A DOGGY IN HERE");
	}
	

}
                                                                                             