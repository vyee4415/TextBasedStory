
// Vivian Yee
// Period 2

// Room

// generates the random extra rooms that don't have animals in them
// declares the items that the user has at first


import java.util.Scanner;

public class Room {
	Person occupant;
	int xLoc,yLoc;
	Scanner in = new Scanner(System.in);
	private boolean explored = false; // explored
	private boolean ce = false; // Cat room
	private boolean de = false; // Dog room
	private boolean se = false; // Snake room
	private boolean ie = false; // Instructional room
	private boolean main = false; // Cage room
	
	private static boolean dog = false; // Dog in user
	private static boolean snake = false; // Snake in user
	private static boolean cat = false; // Cat in user
	
	private static boolean dog2 = false; // Dog in cage
	private static boolean snake2 = false; // Snake in cage
	private static boolean cat2 = false; // Cat in cage
	
	public Room(int x, int y)
	{
		xLoc = x;
		yLoc = y;
	}
	public void enterRoom(Person x)
	{
		System.out.println("This room is empty.");
		
		// Carries coordinates, x and y
		occupant = x;
		setExplored(true); // sets the room as explored
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	public void print(){
		 if(ce) { // if cat room is explored, leave 'C' on board
			System.out.print("[C]");
		}else if(de) { // if dog room is explored, leave 'D' on board
			System.out.print("[D]");
		}else if(se) { // if snake room is explored, leave 'S' on board
			System.out.print("[S]");
		}else if(main) { // if cage room is explored, leave 'M' on board
			System.out.print("[M]");
		}else if(ie) { // if instructional room is explored, leave 'I' on board
			System.out.print("[I]");
		}else if((!isExplored())&&(occupant == null)){ // if room is not explored then leave nothing
			System.out.print("[ ]");
		}else if(occupant != null) { // if user is in the room, leave 'x'
			System.out.print("[");;
			occupant.print("x");
			System.out.print("]");
		}else if(isExplored()) { // if room is explored, leave '-'
			System.out.print("[-]");
		}
	}
	
	// Getters and setters for fields
	public boolean isExplored() {
		return explored;
	}
	public void setExplored(boolean explored) {
		this.explored = explored;
	}
	public boolean isse() {
		return se;
	}
	public void setse(boolean se) {
		this.se = se;
	}
	public boolean isde() {
		return de;
	}
	public void setde(boolean de) {
		this.de = de;
	}
	public void setie(boolean ie) {
		this.ie = ie;
	}
	public boolean isie() {
		return ie;
	}
	public boolean isce() {
		return ce;
	}
	public void setce(boolean ce) {
		this.ce = ce;
	}
	public boolean ismain() {
		return main;
	}
	public void setmain(boolean main) {
		this.main = main;
	}
	

	public boolean isDog() {
		return dog;
	}
	public void setDog(boolean dog1) {
		dog = dog1;
	}
	public boolean isCat() {
		return cat;
	}
	public void setCat(boolean cat1) {
		cat = cat1;
	}
	public boolean isSnake() {
		return snake;
	}
	public void setSnake(boolean snake1) {
		snake = snake1;
	}
	
	
	public boolean isDog2() {
		return dog2;
	}
	public void setDog2(boolean dog3) {
		dog2 = dog3;
	}
	public boolean isCat2() {
		return cat2;
	}
	public void setCat2(boolean cat3) {
		cat2 = cat3;
	}
	public boolean isSnake2() {
		return snake2;
	}
	public void setSnake2(boolean snake3) {
		snake2 = snake3;
	}
}

