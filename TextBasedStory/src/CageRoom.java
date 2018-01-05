
// Vivian Yee
// Period 2

// Cage room

// This room is where the user is supposed to drop off the animals
// If the user is able to drop off all of the animals, the user is able to win


import java.util.Scanner;

public class CageRoom extends Room {

	public CageRoom(int x, int y) {
		super(x, y); // Carries coordinates, x and y
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		// shows user is at this location
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		
		// board knows to display "M" on the location of this room
		setmain(true);
		
		// tells user which key to press when dropping animals
		System.out.println("THIS IS THE ROOM WHERE YOU'RE SUPPOSED TO DROP OFF THE ANIMALS");
		System.out.println("PRESS 'Z' TO DROP OFF DOG");
		System.out.println("PRESS 'X' TO DROP OFF SNAKE");
		System.out.println("PRESS 'C' TO DROP OFF CAT");
		System.out.println("PRESS 'V' IF YOU DROPPED OFF ALL THE ANIMALS");
		System.out.println(cage());
	}
	
	// cage method
	public String cage() {
		Scanner reader = new Scanner(System.in);
		System.out.println("CHOOSE");
		// makes user unput and makes it lower case
		String n = in.nextLine();
		n = n.toLowerCase().trim();
		if((isDog())&&(n.equals("z"))) { // if user has dogs and inputs 'z' then it returns you dropped dog
			setDog2(true);
			return("YOU DROPPED DOG");
		}else if((isCat())&&(n.equals("c"))){ // if user has cats and inputs 'c' then it returns you dropped cat
			setCat2(true);
			return("YOU DROPPED CAT");
		}else if((isSnake())&&(n.equals("x"))) { // if user has snakes and inputs 'x' then it returns you dropped snake
			setSnake2(true);
			return("YOU DROPPED SNAKE");
		}else if((n.equals("v"))&&(isSnake2())&&(isCat2())&&(isDog2())) { // if user dropped all animals and inputs 'v' then it ends 
			Runner.gameOff();
			return("YOU DROPPED OFF ALL OF THE ANIMALS! YOU WIN!");
		}else{ // if user does not meet any requirements above or puts in a letter that isn't (z,x,c,or v), the user must leave the room
			return("THAT'S NOT VALID");
		}
	}
}
