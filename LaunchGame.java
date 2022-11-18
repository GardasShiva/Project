
import java.util.*;

class Guesser
{
 int guessNum;
 
 
 int guessNum(){
	 
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Guesser guess the number");
	 guessNum = scan.nextInt();
	 return guessNum;
 }
}
class Player
{
	int guessNum;
	
	int guessNum(){
		 
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Player guess the number");
		 guessNum = scan.nextInt();
		 return guessNum;	
}
}

class Umpire
{
 int numFromGuesser;
 int numFromPlayer1;
 int numFromPlayer2;
 int numFromPlayer3;
 int i=1;
  
  void collectNumFromGuesser()
  {
	  Guesser g = new Guesser();
	  numFromGuesser= g.guessNum();
  }
  void collectNumFromPlayers()
  {
	  Player p1=new Player();
	  Player p2=new Player();
	  Player p3=new Player();
	  numFromPlayer1=p1.guessNum();
	  numFromPlayer2=p2.guessNum();
	  numFromPlayer3=p3.guessNum();
  }
  void compare()
  {
	  if(numFromGuesser==numFromPlayer1)
	  {
		  System.out.println("Player1 won the game");
	  }
	  else if(numFromGuesser==numFromPlayer2)
	  {
		  System.out.println("Player2 won the game");
	  }
	  else if(numFromGuesser==numFromPlayer3)
	  {
		  System.out.println("Player3 won the game");
	  }
	  else
	  {
		  System.out.println("No player has guessed the Number");
	  }
	  while(i>0)
	  {
		  if(numFromGuesser==numFromPlayer1&&numFromGuesser==numFromPlayer2)
		  {
			  System.out.println("Player1 and Player 2  also  won the game");
		  }
		  else if(numFromGuesser==numFromPlayer1&&numFromGuesser==numFromPlayer3)
		  {
			  System.out.println("Player1 and Player 3 also won the game");
		  }
		  else if(numFromGuesser==numFromPlayer2&&numFromGuesser==numFromPlayer3)
		  {
			  System.out.println("Player2 and Player 3 also won the game");
		  }
		  i--;
	  }
  }
  
}

public class LaunchGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Umpire u=new Umpire();
         u.collectNumFromGuesser();
         u.collectNumFromPlayers();
         u.compare();
	}

}
