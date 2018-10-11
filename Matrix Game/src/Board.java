
public class Board
	{
	static String [] [] board;
	
	public static void createBoard()
		{
			board = new String [3] [3];
			for (int i = 0; i < 3; i++)
				{
				for (int n = 0; n < 3; n++)
					{
					board [i] [n] = " ";	
					}
				}
		}
	
		public static void display()
		{
		System.out.println("        1            2            3      ");	
		System.out.println("  ---------------------------------------");	
		System.out.println("  |           ||           ||           |");
		System.out.println("  |           ||           ||           |");
		System.out.println("A |    " + board [0][0] + "       ||" + board [0][1] + "           ||" + board [0][2] + "           |");
		System.out.println("  |           ||           ||           |");
		System.out.println("  |           ||           ||           |");
		System.out.println("  ---------------------------------------");
		System.out.println("  ---------------------------------------");
		System.out.println("  |           ||           ||           |");
		System.out.println("  |           ||           ||           |");
		System.out.println("B |           ||           ||           |");
		System.out.println("  |           ||           ||           |");
		System.out.println("  |           ||           ||           |");
		System.out.println("  ---------------------------------------");
		System.out.println("  ---------------------------------------");
		System.out.println("  |           ||           ||           |");
		System.out.println("  |           ||           ||           |");
		System.out.println("C |           ||           ||           |");
		System.out.println("  |           ||           ||           |");
		System.out.println("  |           ||           ||           |");
		System.out.println("  ---------------------------------------");	
		}
	}
