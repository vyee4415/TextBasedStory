import java.util.Scanner;

public class Room {
	Person occupant;
	int xLoc,yLoc;
	Scanner in = new Scanner(System.in);
	private boolean explored = false;
	
	public Room(int x, int y)
	{
		xLoc = x;
		yLoc = y;
	}
	public void enterRoom(Person x)
	{
		System.out.println("This room is empty.");
		explored = true;
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	public void print(){
		if((!explored)&&(occupant == null)){
			System.out.print("[ ]");
		}else if(occupant != null) {
			System.out.print("[");;
			occupant.print("x");
			System.out.print("]");
		}else if(explored) {
			System.out.print("[-]");
		}
	}
}

