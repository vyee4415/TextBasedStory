import java.util.Scanner;

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
		System.out.println("PRESS 'Z' TO DROP OFF DOG");
		System.out.println("PRESS 'X' TO DROP OFF SNAKE");
		System.out.println("PRESS 'C' TO DROP OFF CAT");
		System.out.println(cage());
	}
	public String cage() {
		Scanner reader = new Scanner(System.in);
		System.out.println("WHICH ANIMAL DO YOU WANT TO DROP");
		String n = reader.toString();
		if((isDog() == true)&&(n == "Z")) {
			return("YOU DROPPED DOG");

		}else if((isCat() == true)&&(n == "C")) {
			return("YOU DROPPED CAT");

		}else if((isSnake() == true)&&(n == "X")) {
			return("THE SNAKES GOT U");

		}else {
			return n;
		}
	}
}
