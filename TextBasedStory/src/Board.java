
// Vivian Yee
// Period 2

// Board

// Prints the board


public class Board {
	
	private Room[][] rooms;
	
	public Board(Room [][] rooms) {
		this.rooms=rooms;
	}
	
	// declares the board's size
	public Board(int size) {
		this.rooms = new Room [size][size];
	}
	
	// method for printing out the board
	public void printBoard() {
		for(Room[]i:rooms) {
			for(Room x:i) {
				x.print();
			}
			System.out.println();
		}
	}
}
