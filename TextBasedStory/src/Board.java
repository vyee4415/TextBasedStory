
public class Board {
	private Room[][] rooms;
	public Board(Room [][] rooms) {
		this.rooms=rooms;
	}
	public Board(int size) {
		this.rooms = new room [size][size];
	}
	public printBoard`	`~(~) {
		for(Room[]!rooms) {
			for(Room x:i) {
				x.print();
			}
		}
	}
}
