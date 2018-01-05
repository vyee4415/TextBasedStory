
// Vivian Yee
// Period 2

// Instructional room

// This room shows what the user has to do in order to win the game
// It shows up in the beginning of the game in (0,0)


public class InstructionalRoom extends Room {

	public InstructionalRoom(int x, int y) {
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
		
		// board knows to display "I" on the location of this room
		setie(true);
		
		// Instructions:
		System.out.println("OH NO, ALL THE CATS, DOGS AND SNAKES ESCAPED FROM THEIR CAGES!");
		System.out.println("YOU MUST GO INTO THE ROOMS AND FIND THE ROOM THAT HAS THE ANIMALS");
		System.out.println("THEY MIGHT FORCE YOU TO ANSWER A MATH QUESTION BUT BEWARE");
		System.out.println("IF YOU GET IT WRONG THEY WILL EAT YOU!");
		System.out.println(" ");
		System.out.println("HOW TO WIN:");
		System.out.println("COLLECT ALL THE DOGS, CATS, AND SNAKES BY SOLVING A MATH PROBLEM");
		System.out.println("IF YOU GET IT WRONG YOU DIE BUT IF YOU GET IT RIGHT YOU COLLECT THE ANIMAL");
		System.out.println("WHEN COLLECTED AN ANIMAL, GO TO THE CAGE ROOM TO DROP IT OFF");
		System.out.println("WHEN YOU ENTER THE CAGE, YOU CAN ONLY SUBMIT ONE THING AT A TIME SO RE ENTER TO SUBMIT MULTIPLE ANIMALS");
		System.out.println("DROP OFF ALL ANIMALS AND PRESS V TO WIN!");
		System.out.println(" ");
		System.out.println("DOGS ARE THE EASIEST TO COLLECT");
		System.out.println("CATS ARE A BIT HARDER TO COLLECT");
		System.out.println("SNAKES ARE VERY HARD TO COLLECT");
		System.out.println(" ");
		System.out.println("(\\(\\ \r\n" + 
							"( -.-) \r\n" + 
							"O_(\")(\")");
		System.out.println("- INSTRUCTIONAL ROOM -");
		System.out.println(" ");
	}
}
