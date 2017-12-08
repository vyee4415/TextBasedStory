
public class RunRoom extends Room{

	public RunRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("YOURE STUCK");
		System.out.println("ANSWER THIS MATH PROBLEM TO PASS!");
		System.out.println(Math.random()*10+Math.random()*20);
	}
	
}
