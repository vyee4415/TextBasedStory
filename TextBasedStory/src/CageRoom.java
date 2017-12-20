
public class CageRoom extends Room {

	public CageRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		setmain(true);
		System.out.println("THIS IS THE ROOM WHERE YOU'RE SUPPOSED TO DROP OFF THE ANIMALS");
		System.out.println("PRESS 'D' TO DROP OFF DOG");
		System.out.println("PRESS 'C' TO DROP OFF CAT");
		System.out.println("PRESS 'S' TO DROP OFF SNAKE");
	}
	

}
