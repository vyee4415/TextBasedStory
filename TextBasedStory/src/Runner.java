
// Vivian Yee
// Period 2

// Runner

// This runs the entire program
// Making the move function

import java.util.Scanner;

public class Runner {
	
	// makes gameOn true 
	private static boolean gameOn = true;
	
	public static void main(String[] args)
	{
		// room is declared 5 by 5 size
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
		// coordinates (0,0)
		int i = (int)(0);
		int j = (int)(0);
		building[i][j] = new InstructionalRoom(i, j);
		
// Rooms with different types of animals in them		
		// Create a cage room.
		// coordinates (4,4)
		building[4][4] = new CageRoom(4, 4);
		
		// Create a dog room
		// coordinates (random#,1)
		int a = (int)(Math.random()*building.length);
		building[a][1] = new DogRoom(a, 1);
		
		// Create a cat room
		// coordinates (random#,2)
		int c = (int)(Math.random()*building.length);
		building[c][2] = new CatRoom(c, 2);
		
		// Create a snake room
		// coordinates (random#,3)
		int e = (int)(Math.random()*building.length);
		building[e][3] = new SnakeRoom(e, 3);
		
		
		 //Setup player 1 and the input scanner
		Person player1 = new Person("FirstName", "FamilyName", 0,0);
		building[0][0].enterRoom(player1);
		Scanner in = new Scanner(System.in);
		// while game is on continue moving function
		while(gameOn)
		{
			System.out.println("USE W, A, S, D TO MOVE");
			String move = in.nextLine(); // scans next line letter
			Board s = new Board(building);
			// prints out the board and displays user coordinates
			if(validMove(move, player1, building))
			{
				s.printBoard();
				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
				
			}
			// tells the user that there isn't anything there to move to
			else {
				System.out.println("There's no door there.");
			}
			
			
		}
		in.close(); 
	}
	
	// validMove method
	public static boolean validMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		// different cases for whatever user puts in (w, a, s, d)
		switch (move) {
			case "w":
				// move up when "w"
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
				// move right when "d"
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
				// move down when "s"
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
				// move left when "a"
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
	
	// method for turning the game off
	public static void gameOff()
	{
		gameOn = false;
	}
}
