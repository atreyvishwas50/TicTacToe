import java.util.Scanner;

	class TicTacToe {
		//Array to hold the places for X and O. 
		public static char[] place = { '_','_','_','_','_','_','_','_','_' };
		
		//To hold value for input from user.
		public static String usrStr;
		
		//variable to use for multi-player or single-player selection.
		public static String choice; 
		
		//To hold the value(i.e X or O)  from user. 
		public static char team = '_';
		
		//To hold the value (i.e X or O) from opponet aka computer.
		public static char opp = '_';
		
		//To hold the values (i.e X or O) from person opponent
		public static char per = '_';
		
		public static void main (String[] args) {	
		
			//This was an demonstration for setting up the Scanner.
			/*Scanner input = new Scanner(System.in);
			TicTacToe.usrStr = input.nextLine();
			System.out.println(TicTacToe.usrStr);*/
				
			System.out.println("\n\nWELCOME TO THE TIC TAC TOE GAME!");
			setup();
		
		}
		
		public static void setup () {
			
		while (true){
		System.out.println("\nTo play single player enter 'S' and to play multiplayer enter 'M'.");
		System.out.print("Enter your Choice: ");
		Scanner input = new Scanner(System.in);
		TicTacToe.choice = input.next().toUpperCase();
		
		if (TicTacToe.choice.toUpperCase().equals("S")) {
			
			singleplayer();
			break;
			
		}
		
		else if (TicTacToe.choice.toUpperCase().equals("M"))  {
			
			multiplayer();
			break;
			
		}
		
		else {
			
			System.out.println("you have entered: " + choice);
			System.out.println("You have entered a wrong selection.");
			System.out.println("Either enter 'S' or 'M'.");
			
				}
			
			}
			
		}
		
		public static void drawboard () {
			
			//Building game board. 
			System.out.println("\n \t    A | B | C  ");
			System.out.println("\t   ___________");
			System.out.println("\t  |   |   |   |");
			System.out.println("\t1 |_" + TicTacToe.place[0] + "_|_" + TicTacToe.place[1] + "_|_" + TicTacToe.place[2] + "_|");
			System.out.println("\t  |   |   |   |");
			System.out.println("\t2 |_" + TicTacToe.place[3] + "_|_" + TicTacToe.place[4] + "_|_" + TicTacToe.place[5] + "_|");
			System.out.println("\t  |   |   |   |");
			System.out.println("\t3 |_" + TicTacToe.place[6] + "_|_" + TicTacToe.place[7] + "_|_" + TicTacToe.place[8] + "_|");
			
		}
		
		public static void multiplayer () {
			
			//Loop to reset the game board to underscore (_)
			for (int i = 0; i < 9; i++ ) {
					
				TicTacToe.place[i] = '_';
				
			}
				
			//print the game board.
			drawboard();
			
			while (TicTacToe.team != 'X' && TicTacToe.team != 'O') {
			
				System.out.println("\n\nPlayer1, Please selsect between 'X' or 'O' ");
				System.out.print("Enter Player1 Selection: ");
				Scanner input = new Scanner(System.in);
				TicTacToe.usrStr = input.next();
				
				if (TicTacToe.usrStr.toUpperCase().equals("X")) {
					
					TicTacToe.team = 'X';
					TicTacToe.per = 'O';
					
				}
				
				else if (TicTacToe.usrStr.toUpperCase().equals("O")) {
					
					TicTacToe.team = 'O';
					TicTacToe.per = 'X';
					
				}
				
				else {
					
					System.out.println("\nyou have entered: " + usrStr);
					System.out.println("You have entered a wrong selection.");
					System.out.println("Either enter 'X' or 'O'");
					
				}
				
			}
		
			System.out.println("\nPlayer1 is on the team: " + TicTacToe.team + " !");
			System.out.println("\nPlayer2 is on the team: " + TicTacToe.per + " !");
			firstmove();
			
		}
		
		
		public static void singleplayer () {
			
			//Loop to reset the game board to underscore (_)
			for (int i = 0; i < 9; i++ ) {
					
					TicTacToe.place[i] = '_';
					
				}
				
				//print the game board.
				drawboard();
				
			while (TicTacToe.team != 'X' && TicTacToe.team != 'O') {
				
				System.out.println("\n\nPlease Select your team! Enter 'X' or 'O' ");
				System.out.print("Enter your Selection: ");
				Scanner input = new Scanner(System.in);
				TicTacToe.usrStr = input.next();
				
				if (TicTacToe.usrStr.toUpperCase().equals("X")) {
					
					TicTacToe.team = 'X';
					TicTacToe.opp = 'O';
					
				}
				
				else if (TicTacToe.usrStr.toUpperCase().equals("O")) {
					
					TicTacToe.team = 'O';
					TicTacToe.opp = 'X';
					
				}
				
				else {
					
					System.out.println("\nYou have entered: " + usrStr);
					System.out.println("You have entered a wrong selection.");
					System.out.println("Either enter 'X' or 'O'");
					
				}
				
			}
		
			System.out.println("\nYou are on the team: " + TicTacToe.usrStr + " !");
			firstmove();
		
		}
		
		public static void firstmove() {
			
			while(true) {
			String s;
			System.out.println("\nWould you like to have a first turn?");
			System.out.print("Enter your selection: ");
			Scanner input = new Scanner(System.in);
			s = input.next();
			
			if (s.toUpperCase().equals("YES")) {
					
				game();
				break;
				
			}
			
			else if (s.toUpperCase().equals("NO")) {
				
				if (TicTacToe.choice.toUpperCase().equals("S")) {
					
					oppMove();
					break;
					
				}
				
				else {
					
					perMove();
					break;
					
				}
				
			}
			
			else {
				
				System.out.println("\nYou hava entered: " + s);
				System.out.println("INVALID SELECTION: Please enter either YES OR NO.");
				System.out.println("-----------------");
				
				}
			}
		
		}
		
		public static void game () {
			
			//This variable is used for ending the loop once the user makes the appropriate selection.
			boolean loop = true;
			
			do {
			if (TicTacToe.choice.toUpperCase().equals("S")) {System.out.println("\nIT'S YOUR TURN!");}
			else {System.out.println("\nIT'S PLAYER1 TURN!");}
			System.out.println("\nPlease choose a row and column to place " + TicTacToe.team + ". (Example: A1)");
			System.out.print("Enter your selection: ");
			Scanner input = new Scanner(System.in);
			TicTacToe.usrStr = input.next().toUpperCase();
				
				switch (TicTacToe.usrStr){
					
					case "A1": if(TicTacToe.place[0] == '_') {
						
						TicTacToe.place[0] = TicTacToe.team;
						if (TicTacToe.choice.toUpperCase().equals("M")) {drawboard();}
						
						if (TicTacToe.choice.toUpperCase().equals("S")) {oppMove(); loop = false;}
						else {perMove(); loop = false;}
						
					}
					
					else if (TicTacToe.place[0] == TicTacToe.team) {
						
						System.out.println("\nINVALID SELECTION: You have already placed " + TicTacToe.place[0] + " here.");
						System.out.println("-----------------");
						game();
						
					}
					
					else {
						
						System.out.println("\nINVALID SELECTION: This place is already occupied.");
						System.out.println("-----------------");
						game();
						
					};break;
					
					case "A2": if(TicTacToe.place[3] == '_') {
						
						TicTacToe.place[3] = TicTacToe.team;
						if (TicTacToe.choice.toUpperCase().equals("M")) {drawboard();}
						
						if (TicTacToe.choice.toUpperCase().equals("S")) {oppMove(); loop = false;}
						else {perMove(); loop = false;}
						
					}
					
					else if (TicTacToe.place[3] == TicTacToe.team) {
						
						System.out.println("\nINVALID SELECTION: You have already placed " + TicTacToe.place[1] + " here.");
						System.out.println("-----------------");
						game();
						
					}
					
					else {
						
						System.out.println("\nINVALID SELECTION: This place is already occupied.");
						System.out.println("-----------------");
						game();
						
					};break;
					
					case "A3": if(TicTacToe.place[6] == '_') {
						
						TicTacToe.place[6] = TicTacToe.team;
						if (TicTacToe.choice.toUpperCase().equals("M")) {drawboard();}
						
						if (TicTacToe.choice.toUpperCase().equals("S")) {oppMove(); loop = false;}
						else {perMove(); loop = false;}
						
					}
					
					else if (TicTacToe.place[6] == TicTacToe.team) {
						
						System.out.println("\nINVALID SELECTION: You have already placed " + TicTacToe.place[2] + " here.");
						System.out.println("-----------------");
						game();
						
					}
					
					else {
						
						System.out.println("\nINVALID SELECTION: This place is already occupied.");
						System.out.println("-----------------");
						game();
						
					};break;
					
					case "B1": if(TicTacToe.place[1] == '_') {
						
						TicTacToe.place[1] = TicTacToe.team;
						if (TicTacToe.choice.toUpperCase().equals("M")) {drawboard();}
						
						if (TicTacToe.choice.toUpperCase().equals("S")) {oppMove(); loop = false;}
						else {perMove(); loop = false;}
						
					}
					
					else if (TicTacToe.place[1] == TicTacToe.team) {
						
						System.out.println("\nINVALID SELECTION: You have already placed " + TicTacToe.place[3] + " here.");
						System.out.println("-----------------");
						game();
						
					}
					
					else {
						
						System.out.println("\nINVALID SELECTION: This place is already occupied.");
						System.out.println("-----------------");
						game();
						
					};break;
					
					case "B2": if(TicTacToe.place[4] == '_') {
						
						TicTacToe.place[4] = TicTacToe.team;
						if (TicTacToe.choice.toUpperCase().equals("M")) {drawboard();}
						
						if (TicTacToe.choice.toUpperCase().equals("S")) {oppMove(); loop = false;}
						else {perMove(); loop = false;}
						
					}
					
					else if (TicTacToe.place[4] == TicTacToe.team) {
						
						System.out.println("\nINVALID SELECTION: You have already placed " + TicTacToe.place[4] + " here.");
						System.out.println("-----------------");
						game();
						
					}
					
					else {
						
						System.out.println("\nINVALID SELECTION: This place is already occupied.");
						System.out.println("-----------------");
						game();
						
					};break;
					
					case "B3": if(TicTacToe.place[7] == '_') {
						
						TicTacToe.place[7] = TicTacToe.team;
						if (TicTacToe.choice.toUpperCase().equals("M")) {drawboard();}
						
						if (TicTacToe.choice.toUpperCase().equals("S")) {oppMove(); loop = false;}
						else {perMove(); loop = false;}
						
					}
					
					else if (TicTacToe.place[7] == TicTacToe.team) {
						
						System.out.println("\nINVALID SELECTION: You have already placed " + TicTacToe.place[5] + " here.");
						System.out.println("-----------------");
						game();
						
					}
					
					else {
						
						System.out.println("\nINVALID SELECTION: This place is already occupied.");
						System.out.println("-----------------");
						game();
						
					};break;
					
					case "C1": if(TicTacToe.place[2] == '_') {
						
						TicTacToe.place[2] = TicTacToe.team;
						if (TicTacToe.choice.toUpperCase().equals("M")) {drawboard();}
					
						if (TicTacToe.choice.toUpperCase().equals("S")) {oppMove(); loop = false;}
						else {perMove(); loop = false;}
						
					}
					
					else if (TicTacToe.place[2] == TicTacToe.team) {
						
						System.out.println("\nINVALID SELECTION: You have already placed " + TicTacToe.place[6] + "here.");
						System.out.println("-----------------");
						game();
						
					}
					
					else {
						
						System.out.println("\nINVALID SELECTION: This place is already occupied.");
						System.out.println("-----------------");
						game();
						
					};break;
					
					case "C2": if(TicTacToe.place[5] == '_') {
						
						TicTacToe.place[5] = TicTacToe.team;
						if (TicTacToe.choice.toUpperCase().equals("M")) {drawboard();}
						
						if (TicTacToe.choice.toUpperCase().equals("S")) {oppMove(); loop = false;}
						else {perMove(); loop = false;}
						
					}
					
					else if (TicTacToe.place[5] == TicTacToe.team) {
						
						System.out.println("\nINVALID SELECTION: You have already placed " + TicTacToe.place[7] + " here.");
						System.out.println("-----------------");
						game();
						
					}
					
					else {
						
						System.out.println("\nINVALID SELECTION: This place is already occupied.");
						System.out.println("-----------------");
						game();
						
					};break;
					
					case "C3": if(TicTacToe.place[8] == '_') {
						
						TicTacToe.place[8] = TicTacToe.team;
						if (TicTacToe.choice.toUpperCase().equals("M")) {drawboard();}
						
						if (TicTacToe.choice.toUpperCase().equals("S")) {oppMove(); loop = false;}
						else {perMove(); loop = false;}
						
					}
					
					else if (TicTacToe.place[8] == TicTacToe.team) {
						
						System.out.println("\nINVALID SELECTION: You have already placed " + TicTacToe.place[8] + " here.");
						System.out.println("-----------------");
						game();
						
					}
					
					else {
						
						System.out.println("\nINVALID SELECTION: This place is already occupied.");
						System.out.println("-----------------");
						game();
						
					};break;
					
				default : System.out.println("\nWRONG SELECTION!!");
                          System.out.println("-----------------"); 
						  game ();
						  break;
				
				}
				
			}while(loop); 
			
			if (TicTacToe.choice.toUpperCase().equals("S")) {
				
				checkWin();
				
			}
			
			else {
				
				winCheck();
				
			}
			
		}
		
		public static void perMove () {
			
			//This variable is used for ending the loop once the user makes the appropriate selection.
			boolean hoop = true;
			
			do {
			System.out.println("\nIT'S PLAYER2 TURN!");
			System.out.println("\nPlease choose a row and column to place " + TicTacToe.per + ". (Example: A1)");
			System.out.print("Enter your selection: ");
			Scanner input = new Scanner(System.in);
			TicTacToe.usrStr = input.next().toUpperCase();
				
				switch (TicTacToe.usrStr){
					
					case "A1": if(TicTacToe.place[0] == '_') {
						
						TicTacToe.place[0] = TicTacToe.per;
						drawboard();
						hoop = false;
						game();
						
					}
					
					else if (TicTacToe.place[0] == TicTacToe.per) {
						
						System.out.println("\nINVALID SELECTION: You have already placed " + TicTacToe.place[0] + " here.");
						System.out.println("-----------------");
						perMove();
						
					}
					
					else {
						
						System.out.println("\nINVALID SELECTION: This place is already occupied.");
						System.out.println("-----------------");
						perMove();
						
					};break;
					
					case "A2": if(TicTacToe.place[3] == '_') {
						
						TicTacToe.place[3] = TicTacToe.per;
						drawboard();
						hoop = false;
						game();
						
					}
					
					else if (TicTacToe.place[3] == TicTacToe.per) {
						
						System.out.println("\nINVALID SELECTION: You have already placed " + TicTacToe.place[1] + " here.");
						System.out.println("-----------------");
						perMove();
						
					}
					
					else {
						
						System.out.println("\nINVALID SELECTION: This place is already occupied.");
						System.out.println("-----------------");
						perMove();
						
					};break;
					
					case "A3": if(TicTacToe.place[6] == '_') {
						
						TicTacToe.place[6] = TicTacToe.per;
						drawboard();
						hoop = false;
						game();
						
					}
					
					else if (TicTacToe.place[6] == TicTacToe.per) {
						
						System.out.println("\nINVALID SELECTION: You have already placed " + TicTacToe.place[2] + " here.");
						System.out.println("-----------------");
						perMove();
						
					}
					
					else {
						
						System.out.println("\nINVALID SELECTION: This place is already occupied.");
						System.out.println("-----------------");
						perMove();
						
					};break;
					
					case "B1": if(TicTacToe.place[1] == '_') {
						
						TicTacToe.place[1] = TicTacToe.per;
						drawboard();
						hoop = false;
						game();
						
					}
					
					else if (TicTacToe.place[1] == TicTacToe.per) {
						
						System.out.println("\nINVALID SELECTION: You have already placed " + TicTacToe.place[3] + " here.");
						System.out.println("-----------------");
						perMove();
						
					}
					
					else {
						
						System.out.println("\nINVALID SELECTION: This place is already occupied.");
						System.out.println("-----------------");
						perMove();
						
					};break;
					
					case "B2": if(TicTacToe.place[4] == '_') {
						
						TicTacToe.place[4] = TicTacToe.per;
						drawboard();
						hoop = false;
						game();
						
					}
					
					else if (TicTacToe.place[4] == TicTacToe.per) {
						
						System.out.println("\nINVALID SELECTION: You have already placed " + TicTacToe.place[4] + " here.");
						System.out.println("-----------------");
						perMove();
						
					}
					
					else {
						
						System.out.println("\nINVALID SELECTION: This place is already occupied.");
						System.out.println("-----------------");
						perMove();
						
					};break;
					
					case "B3": if(TicTacToe.place[7] == '_') {
						
						TicTacToe.place[7] = TicTacToe.per;
						drawboard();
						hoop = false;
						game();
						
					}
					
					else if (TicTacToe.place[7] == TicTacToe.per) {
						
						System.out.println("\nINVALID SELECTION: You have already placed " + TicTacToe.place[5] + " here.");
						System.out.println("-----------------");
						perMove();
						
					}
					
					else {
						
						System.out.println("\nINVALID SELECTION: This place is already occupied.");
						System.out.println("-----------------");
						perMove();
						
					};break;
					
					case "C1": if(TicTacToe.place[2] == '_') {
						
						TicTacToe.place[2] = TicTacToe.per;
						drawboard();
						hoop = false;
						game();
						
					}
					
					else if (TicTacToe.place[2] == TicTacToe.per) {
						
						System.out.println("\nINVALID SELECTION: You have already placed " + TicTacToe.place[6] + "here.");
						System.out.println("-----------------");
						perMove();
						
					}
					
					else {
						
						System.out.println("\nINVALID SELECTION: This place is already occupied.");
						System.out.println("-----------------");
						perMove();
						
					};break;
					
					case "C2": if(TicTacToe.place[5] == '_') {
						
						TicTacToe.place[5] = TicTacToe.per;
						drawboard();
						hoop = false;
						game();
						
					}
					
					else if (TicTacToe.place[5] == TicTacToe.per) {
						
						System.out.println("\nINVALID SELECTION: You have already placed " + TicTacToe.place[7] + " here.");
						System.out.println("-----------------");
						perMove();
						
					}
					
					else {
						
						System.out.println("\nINVALID SELECTION: This place is already occupied.");
						System.out.println("-----------------");
						perMove();
						
					};break;
					
					case "C3": if(TicTacToe.place[8] == '_') {
						
						TicTacToe.place[8] = TicTacToe.per;
						drawboard();
						hoop = false;
						game();
						
					}
					
					else if (TicTacToe.place[8] == TicTacToe.per) {
						
						System.out.println("\nINVALID SELECTION: You have already placed " + TicTacToe.place[8] + " here.");
						System.out.println("-----------------");
						perMove();
						
					}
					
					else {
						
						System.out.println("\nINVALID SELECTION: This place is already occupied.");
						System.out.println("-----------------");
						perMove();
						
					};break;
					
					default : System.out.println("\nWRONG SELECTION!!");
                              System.out.println("-----------------"); 
						      break;
				}
						      
			}while(hoop); 
			
			winCheck();
			
		}
		
		public static void oppMove () {
			
			while (true) {
				
				if ((TicTacToe.place[0] == '_') || (TicTacToe.place[1] == '_') || (TicTacToe.place[2] == '_') || (TicTacToe.place[3] == '_') || (TicTacToe.place[4] == '_') || (TicTacToe.place[5] == '_') || (TicTacToe.place[6] == '_') || (TicTacToe.place[7] == '_') || (TicTacToe.place[8] == '_') ) {
				
				float rn = (float) Math.random();
				float m = rn*8;
				int x = Math.round(m);
			
				if (TicTacToe.place[x] == '_') {
					
					TicTacToe.place[x] = TicTacToe.opp;
					drawboard();
					game();
					break;
					
				}
				
				else {
					
					checkWin();
					break;
				}
				
			}	
			
		}
	}			
		public static void checkWin() {
			
			//To check whether the user or computer won.
			if ((TicTacToe.place[0] == TicTacToe.team) && (TicTacToe.place[3] == TicTacToe.team) && (TicTacToe.place[6] == TicTacToe.team)) {
				 
				 drawboard();
				 System.out.println("\nYOU HAVE WON!!!");
				 System.out.println("---------------");
				 playAgain();
				 
			}
			
			else if ((TicTacToe.place[0] == TicTacToe.opp) && (TicTacToe.place[3] == TicTacToe.opp) && (TicTacToe.place[6] == TicTacToe.opp)) {
				
				 drawboard();
				System.out.println("\nYOU LOST!!!");
				System.out.println("-----------");
				playAgain();
			
			}
			
			else if ((TicTacToe.place[1] == TicTacToe.team) && (TicTacToe.place[4] == TicTacToe.team) && (TicTacToe.place[7] == TicTacToe.team)) {
				
				 drawboard();
				 System.out.println("\nYOU HAVE WON!!!");
				 System.out.println("---------------");
				 playAgain();
				
			}
			
			else if ((TicTacToe.place[1] == TicTacToe.opp) && (TicTacToe.place[4] == TicTacToe.opp) && (TicTacToe.place[7] == TicTacToe.opp)) {
				
				drawboard();
				System.out.println("\nYOU LOST!!!");
				System.out.println("-----------");
				playAgain();
				
			}
			
			else if ((TicTacToe.place[2] == TicTacToe.team) && (TicTacToe.place[5] == TicTacToe.team) && (TicTacToe.place[8] == TicTacToe.team)) {
				 
				 drawboard();
				 System.out.println("\nYOU HAVE WON!!!");
				 System.out.println("---------------");
				 playAgain();
				
			}
			
			else if ((TicTacToe.place[2] == TicTacToe.opp) && (TicTacToe.place[5] == TicTacToe.opp) && (TicTacToe.place[8] == TicTacToe.opp)) {
				
				drawboard();
				System.out.println("\nYOU LOST!!!");
				System.out.println("-----------");
				playAgain();
				
			}
			
			else if ((TicTacToe.place[0] == TicTacToe.team) && (TicTacToe.place[1] == TicTacToe.team) && (TicTacToe.place[2] == TicTacToe.team)) {
				
				drawboard();
				System.out.println("\nYOU HAVE WON!!!");
				System.out.println("---------------");
				playAgain();
				
			}
			
			else if ((TicTacToe.place[0] == TicTacToe.opp) && (TicTacToe.place[1] == TicTacToe.opp) && (TicTacToe.place[2] == TicTacToe.opp)) {
				
				drawboard();
				System.out.println("\nYOU LOST!!!");
				System.out.println("-----------");
				playAgain();
				
			}
			
			else if ((TicTacToe.place[3] == TicTacToe.team) && (TicTacToe.place[4] == TicTacToe.team) && (TicTacToe.place[5] == TicTacToe.team)) {
				
				drawboard();
				System.out.println("\nYOU HAVE WON!!!");
				System.out.println("---------------");
				playAgain();
				
			}
			
			else if ((TicTacToe.place[3] == TicTacToe.opp) && (TicTacToe.place[4] == TicTacToe.opp) && (TicTacToe.place[5] == TicTacToe.opp)) {
				
				drawboard();
				System.out.println("\nYOU LOST!!!");
				System.out.println("-----------");
				playAgain();
				
			}
			
			else if ((TicTacToe.place[6] == TicTacToe.team) && (TicTacToe.place[7] == TicTacToe.team) && (TicTacToe.place[8] == TicTacToe.team)) {
				
				drawboard();
				System.out.println("\nYOU HAVE WON!!!");
				System.out.println("---------------");
				playAgain();
				
			}
			
			else if ((TicTacToe.place[6] == TicTacToe.opp) && (TicTacToe.place[7] == TicTacToe.opp) && (TicTacToe.place[8] == TicTacToe.opp)) {
				
				drawboard();
				System.out.println("\nYOU LOST!!!");
				System.out.println("-----------");
				playAgain();
				
			}
			
			else if ((TicTacToe.place[0] == TicTacToe.team) && (TicTacToe.place[4] == TicTacToe.team) && (TicTacToe.place[8] == TicTacToe.team)) {
				
				drawboard();
				System.out.println("\nYOU HAVE WON!!!");
				System.out.println("---------------");
				playAgain();
				
			}
			
			
			else if ((TicTacToe.place[0] == TicTacToe.opp) && (TicTacToe.place[4] == TicTacToe.opp) && (TicTacToe.place[8] == TicTacToe.opp)) {
				
				drawboard();
				System.out.println("\nYOU LOST!!!");
				System.out.println("-----------");
				playAgain();
				
			}
			
			else if ((TicTacToe.place[2] == TicTacToe.team) && (TicTacToe.place[4] == TicTacToe.team) && (TicTacToe.place[6] == TicTacToe.team)) {
				
				drawboard();
				System.out.println("\nYOU HAVE WON!!!");
				System.out.println("---------------");
				playAgain();
				
			}
			
			else if ((TicTacToe.place[2] == TicTacToe.opp) && (TicTacToe.place[4] == TicTacToe.opp) && (TicTacToe.place[6] == TicTacToe.opp)) {
				
				drawboard();
				System.out.println("\nYOU LOST!!!");
				System.out.println("-----------");
				playAgain();
				
			}
			
			else if ((TicTacToe.place[0] != '_') && (TicTacToe.place[1] != '_') && (TicTacToe.place[2] != '_') && (TicTacToe.place[3] != '_') && (TicTacToe.place[4] != '_') && (TicTacToe.place[5] != '_') && (TicTacToe.place[6] != '_') && (TicTacToe.place[7] != '_') && (TicTacToe.place[8] != '_')) {
				
				drawboard();
				System.out.println("IT'S A TIE!!!");
				System.out.println("-------------");
				playAgain();
				
			}
			
		}
		
		public static void winCheck() {
			
			//To check whether Player1 or Player2 won
			if ((TicTacToe.place[0] == TicTacToe.team) && (TicTacToe.place[1] == TicTacToe.team) && (TicTacToe.place[2] == TicTacToe.team)) {
				 
				 drawboard();
				 System.out.println("\nPlayer1 WON!!!");
				 System.out.println("--------------");
				 playAgain();
				 
			}
			
			else if ((TicTacToe.place[0] == TicTacToe.per) && (TicTacToe.place[1] == TicTacToe.per) && (TicTacToe.place[2] == TicTacToe.per)) {
				
				drawboard();
				System.out.println("\nPlayer2 Won!!!");
				System.out.println("--------------");
				playAgain();
			
			}
			
			else if ((TicTacToe.place[3] == TicTacToe.team) && (TicTacToe.place[4] == TicTacToe.team) && (TicTacToe.place[5] == TicTacToe.team)) {
				
				 drawboard();
				 System.out.println("\nPlayer1 WON!!!");
				 System.out.println("--------------");
				 playAgain();
				
			}
			
			else if ((TicTacToe.place[3] == TicTacToe.per) && (TicTacToe.place[4] == TicTacToe.per) && (TicTacToe.place[5] == TicTacToe.per)) {
				
				drawboard();
				System.out.println("\nPlayer2 Won!!!");
				System.out.println("--------------");
				playAgain();
				
			}
			
			else if ((TicTacToe.place[6] == TicTacToe.team) && (TicTacToe.place[7] == TicTacToe.team) && (TicTacToe.place[8] == TicTacToe.team)) {
				 
				 drawboard();
				 System.out.println("\nPlayer1 WON!!!");
				 System.out.println("--------------");
				 playAgain();
				 
			}
			
			else if ((TicTacToe.place[6] == TicTacToe.per) && (TicTacToe.place[7] == TicTacToe.per) && (TicTacToe.place[8] == TicTacToe.per)) {
				
				drawboard();
				System.out.println("\nPlayer2 Won!!!");
				System.out.println("--------------");
				playAgain();
				
			}
			
			else if ((TicTacToe.place[0] == TicTacToe.team) && (TicTacToe.place[3] == TicTacToe.team) && (TicTacToe.place[6] == TicTacToe.team)) {
				 
				 drawboard();
				 System.out.println("\nPlayer1 WON!!!");
				 System.out.println("--------------");
				 playAgain();
				
			}
			
			else if ((TicTacToe.place[0] == TicTacToe.per) && (TicTacToe.place[3] == TicTacToe.per) && (TicTacToe.place[6] == TicTacToe.per)) {
				
				drawboard();
				System.out.println("\nPlayer2 Won!!!");
				System.out.println("--------------");
				playAgain();
				
			}
			
			else if ((TicTacToe.place[1] == TicTacToe.team) && (TicTacToe.place[4] == TicTacToe.team) && (TicTacToe.place[7] == TicTacToe.team)) {
				 
				 drawboard();
				 System.out.println("\nPlayer1 WON!!!");
				 System.out.println("--------------");
				 playAgain();
				
			}
			
			else if ((TicTacToe.place[1] == TicTacToe.per) && (TicTacToe.place[4] == TicTacToe.per) && (TicTacToe.place[7] == TicTacToe.per)) {
				
				drawboard();
				System.out.println("\nPlayer2 Won!!!");
				System.out.println("--------------");
				playAgain();
				
			}
			
			else if ((TicTacToe.place[2] == TicTacToe.team) && (TicTacToe.place[5] == TicTacToe.team) && (TicTacToe.place[8] == TicTacToe.team)) {
				 
				 drawboard();
				 System.out.println("\nPlayer1 WON!!!");
				 System.out.println("--------------");
				 playAgain();
				
			}
			
			else if ((TicTacToe.place[2] == TicTacToe.per) && (TicTacToe.place[5] == TicTacToe.per) && (TicTacToe.place[8] == TicTacToe.per)) {
				
				drawboard();
				System.out.println("\nPlayer2 Won!!!");
				System.out.println("--------------");
				playAgain();
				
			}
			
			else if ((TicTacToe.place[0] == TicTacToe.team) && (TicTacToe.place[4] == TicTacToe.team) && (TicTacToe.place[8] == TicTacToe.team)) {
				
				drawboard();
				System.out.println("\nPlayer1 WON!!!");
				System.out.println("--------------");
				playAgain();
				
			}
			
			
			else if ((TicTacToe.place[0] == TicTacToe.per) && (TicTacToe.place[4] == TicTacToe.per) && (TicTacToe.place[8] == TicTacToe.per)) {
				
				drawboard();
				System.out.println("\nPlayer2 Won!!!");
				System.out.println("--------------");
				playAgain();
				
			}
			
			else if ((TicTacToe.place[2] == TicTacToe.team) && (TicTacToe.place[4] == TicTacToe.team) && (TicTacToe.place[6] == TicTacToe.team)) {
				
				drawboard();
				System.out.println("\nPlayer1 WON!!!");
				System.out.println("--------------");
				playAgain();
				
			}
			
			else if ((TicTacToe.place[2] == TicTacToe.per) && (TicTacToe.place[4] == TicTacToe.per) && (TicTacToe.place[6] == TicTacToe.per)) {
				
				drawboard();
				System.out.println("\nPlayer2 Won!!!");
				System.out.println("--------------");
				playAgain();
				
			}
			
			else if ((TicTacToe.place[0] != '_') && (TicTacToe.place[1] != '_') && (TicTacToe.place[2] != '_') && (TicTacToe.place[3] != '_') && (TicTacToe.place[4] != '_') && (TicTacToe.place[5] != '_') && (TicTacToe.place[6] != '_') && (TicTacToe.place[7] != '_') && (TicTacToe.place[8] != '_')) {
			    
				drawboard();
				System.out.println("IT'S A TIE!!!");
				System.out.println("-------------");
				playAgain();
				
		}
	}		
		
		  public static void playAgain () {
			
			while (true) {
			//To ask the user to play again.
			String ask;
			System.out.println("\nDo you want to play again?: ");
			Scanner input = new Scanner(System.in);
			ask = input.next().toUpperCase();
			
			if (ask.toUpperCase().equals("YES")) {
			
				TicTacToe.team = '_';
				TicTacToe.opp = '_';
				TicTacToe.per = '_'; 
				setup();
				break;
				
			}
			
			else if(ask.toUpperCase().equals("NO")) {
				
				System.exit(0);
				break;
				
			}
			
			else {
				
				System.out.println("IVALID SELECTION: You have entered: " + ask);
				System.out.println("----------------");
				System.out.println("Please enter either 'YES' or 'No' ");
				
			}
		
		}
		
	}
}
