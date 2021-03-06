import java.util.Scanner;

public class Board
	{
	static String move;
	static String board [][]  = new String [3][3];
	
		public static void welcome()
		{
		System.out.println("Hello, and welcome to the Tic-Tac-Toe-Rama!");
		System.out.println("Play tic-tac-toe for free!");
		System.out.println("You will win once you get three in a row before the computer does!");
		System.out.println("Here's the board!");
		}
	
		public static void display()
		{
		System.out.println("        1            2            3      ");	
		System.out.println("  ---------------------------------------");	
		System.out.println("  |           ||           ||           |");
		System.out.println("  |           ||           ||           |");
		System.out.println("A |     " + board [0][0] + "     ||     " + board [0][1] + "     ||     " + board [0][2] + "     |");
		System.out.println("  |           ||           ||           |");
		System.out.println("  |           ||           ||           |");
		System.out.println("  ---------------------------------------");
		System.out.println("  ---------------------------------------");
		System.out.println("  |           ||           ||           |");
		System.out.println("  |           ||           ||           |");
		System.out.println("B |     " + board [1][0] + "     ||     " + board [1][1] + "     ||     " + board [1][2] + "     |");
		System.out.println("  |           ||           ||           |");
		System.out.println("  |           ||           ||           |");
		System.out.println("  ---------------------------------------");
		System.out.println("  ---------------------------------------");
		System.out.println("  |           ||           ||           |");
		System.out.println("  |           ||           ||           |");
		System.out.println("C |     " + board [2][0] + "     ||     " + board [2][1] + "     ||     " + board [2][2] + "     |");
		System.out.println("  |           ||           ||           |");
		System.out.println("  |           ||           ||           |");
		System.out.println("  ---------------------------------------");	
		}
		
		public static void fillTableOne()
		{
			board = new String [3] [3];
			for (int row = 0; row < 3; row++)
				{
				for (int col = 0; col < 3; col++)
					{
					board [row] [col] = " ";	
					}
				}
		}
		
		public static void userMove()
		{
			int row = 0;
			int col = 0;
			
			Scanner userInput = new Scanner (System.in);			
			System.out.println("Where will your x go? ");
			move = userInput.nextLine();
			
			String rowInput = move.substring(0,1);
			rowInput = rowInput.toLowerCase();
			if (rowInput.equals("a"))
				{
				row = 0;
				}
			col = Integer.parseInt(move.substring(1 , 2));
			col = col -1;
	
			
			if (rowInput.equals("b"))
				{
				row = 1;	
				}

			
			if (rowInput.equals("c"))
				{
				row = 2;	
				}	
	
			board[row][col] = "X";			
				
		}
		
		public static void computerMove()
		{	
			int row = (int)(Math.random()*3);
			int col = (int)(Math.random()*3);
			if (board[row][col] == " ")
				{
					board[row][col] = "O";
				}
			else 
				{
					computerMove();
				}
		}
		
		public static void wonGame()
		{
		
		boolean stillNoWinner = true;		
		while (stillNoWinner)
			{	
				userMove();
				display();
				computerMove();
				display();
				if ((board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2]) && !board[0][1].equals(" ")) ||	
					(board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2]) && !board[1][1].equals(" ")) ||
					(board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2]) && !board[2][1].equals(" ")) ||
					(board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0]) && !board[1][0].equals(" ")) ||
					(board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1]) && !board[1][1].equals(" ")) ||
					(board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2]) && !board[1][2].equals(" ")) ||
					(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[1][1].equals(" ")) ||
					(board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2]) && !board[1][1].equals(" "))) 
					{
						System.out.println("The game has ended!");	
						System.exit(0);
					}	
			
			}	
		}
				
	}


