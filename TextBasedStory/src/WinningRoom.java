
public class WinningRoom extends Room {

	public WinningRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("CongraduLATIONS YOU WIN DA GAME DUDE!!");
		Runner.gameOff();
	}
	

}
