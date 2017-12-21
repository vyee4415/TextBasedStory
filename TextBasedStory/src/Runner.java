import java.util.Scanner;

public class Runner {
	

	private static boolean gameOn = true;
	
	public static void main(String[] args)
	{
		Room[][] building = new Room[5][5];
		
		//Fill the building with normal rooms
		for (int x = 0; x<building.length; x++)
		{
			for (int y = 0; y < building[x].length; y++)
			{
				building[x][y] = new Room(x,y);
			}
		}
		
		
		// Create instructional room
		int i = (int)(0);
		int j = (int)(0);
		building[i][j] = new InstructionalRoom(i, j);
		
// Rooms with different types of animals in them		
		// Create a cage room.
		int x = (int)(Math.random()*building.length);
		int y = (int)(Math.random()*building.length);
		while((x==0)&&(y==0)) {
			x = (int)(Math.random()*building.length);
			y = (int)(Math.random()*building.length);
		}
		building[x][y] = new CageRoom(x, y);
		
		// Create a dog room
		int a = (int)(Math.random()*building.length);
		int b = (int)(Math.random()*building.length);
		building[a][b] = new DogRoom(a, b);
		
		// Create a cat room
		int c = (int)(Math.random()*building.length);
		int d = (int)(Math.random()*building.length);
		building[c][d] = new CatRoom(c, d);
		
		// Create a snake room
		int e = (int)(Math.random()*building.length);
		int f = (int)(Math.random()*building.length);
		building[e][f] = new SnakeRoom(e, f);
		
		
		 //Setup player 1 and the input scanner
		Person player1 = new Person("FirstName", "FamilyName", 0,0);
		building[0][0].enterRoom(player1);
		Scanner in = new Scanner(System.in);
		while(gameOn)
		{
			System.out.println("Where would you like to move? (Choose W, A, S, D)");
			String move = in.nextLine();
			Board s = new Board(building);
			if(validMove(move, player1, building))
			{
				s.printBoard();
				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
				
			}
			else {
				System.out.println("There's no door there.");
			}
			
			
		}
		in.close();
	}
	
	public static boolean validMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "w":
				if (p.getxLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			case "d":
				if (p.getyLoc()< map[p.getyLoc()].length -1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getxLoc() < map.length - 1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "a":
				if (p.getyLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;
					
		}
		return true;
	}
	public static void gameOff()
	{
		gameOn = false;
	}
	


}
