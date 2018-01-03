import java.util.Scanner;

public class Room {
	Person occupant;
	int xLoc,yLoc;
	Scanner in = new Scanner(System.in);
	private int animals = 0;
	private boolean explored = false;
	private boolean ce = false;
	private boolean de = false;
	private boolean se = false;
	private boolean ie = false;
	private boolean main = false;
	
	private static boolean dog = false;
	private static boolean snake = false;
	private static boolean cat = false;
	
	public Room(int x, int y)
	{
		xLoc = x;
		yLoc = y;
	}
	public void enterRoom(Person x)
	{
		System.out.println("This room is empty.");
		occupant = x;
		setExplored(true);
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	public void print(){
		 if(ce) {
			System.out.print("[C]");
		}else if(de) {
			System.out.print("[D]");
		}else if(se) {
			System.out.print("[S]");
		}else if(main) {
			System.out.print("[M]");
		}else if(ie) {
			System.out.print("[I]");
		}else if((!isExplored())&&(occupant == null)){
			System.out.print("[ ]");
		}else if(occupant != null) {
			System.out.print("[");;
			occupant.print("x");
			System.out.print("]");
		}else if(isExplored()) {
			System.out.print("[-]");
		}
	}
	public int isanimals() {
		return animals;
	}
	public void setanimals(int animals) {
		this.animals = animals;
	}

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
}

