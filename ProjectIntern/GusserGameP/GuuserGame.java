package GusserGameP;
/*number of object are 5 , gusser, umpire, player1, player2, player3.
Gusser :- Gussing the number and give that number to umpire
Umpire:- store the number from gusser and number from players and match  the number of gusser and all the 3 players
 

*/
import java.util.Scanner;


class Gusser
{
    int guessNum;

    int gussingNumber()
        {
           
            Scanner scan= new Scanner(System.in);
            System.out.println("Gusser kindly guess the number");
            guessNum= scan.nextInt();

            return guessNum;
        }
}

class Player
{
    int guessNum;
    int guessingNumber()
    {
        Scanner scan= new Scanner(System.in);        
        guessNum=scan.nextInt();

        return guessNum;

    }
}

class umpire{
    //variable for player
    int numFromGusser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGusser()
    {
        Gusser g=new Gusser();        //make the object of gusser
        numFromGusser= g.gussingNumber();    //calling the gussing method
    }

    void collectNumFromPlayer()
    {
        Player p1= new Player();
        Player p2= new Player();
        Player p3= new Player();
       numFromPlayer1= p1.guessingNumber();
       numFromPlayer2= p2.guessingNumber();
       numFromPlayer3= p3.guessingNumber();
    }

    void compare()
    {
        if(numFromGusser==numFromPlayer1)
            {
                if(numFromGusser==numFromPlayer2 && numFromGusser==numFromPlayer3)
                    {
                        System.out.println("All gives the right answer! All are winner");
                    }
                else if(numFromGusser==numFromPlayer2)
                    {
                        System.out.println("Player1 or player2 have won the match");
                    }
                else if(numFromGusser==numFromPlayer3)
                    {
                        System.out.println("Player 1 or Player 3 won the match");
                    }
                else 
                    {
                        System.out.println("Player 1 won the game");
                    }
            }
        else if(numFromGusser==numFromPlayer2)
            {
                if(numFromGusser==numFromPlayer1 && numFromGusser==numFromPlayer3)
                    {
                        System.out.println("All are winner!");
                    }
                else if(numFromGusser== numFromPlayer1)
                    {
                        System.out.println("Player2 or Player1 won the match");
                    }
                else if(numFromGusser== numFromPlayer3)
                    {
                        System.out.println("player2 or Player3 won the match");
                    }
                else 
                    {
                System.out.println("Player 2 won the game");
                    }
            }
        else if(numFromGusser==numFromPlayer3)
            {   
                if(numFromGusser==numFromPlayer2 && numFromGusser==numFromPlayer1)
                    {
                        System.out.println("All are winner!");
                    }
                else if(numFromGusser== numFromPlayer1)
                    {
                        System.out.println("Player3 or Player1 won the match");
                    }
                else if(numFromGusser== numFromPlayer2)
                    {
                        System.out.println("Player 3 or Player2 won the match");
                    }
                else 
                    {
                         System.out.println("Player3 won the game");
                    }
            }
        else
            {
                System.out.println("Game lost! Try again");
                System.out.println("The correct number is " + numFromGusser);
            }
    }

}


public class GuuserGame {
    public static void main(String[] args)
    {
        System.out.println("Game Started");
        umpire u= new umpire();
        u.collectNumFromGusser();
        u.collectNumFromPlayer();
        u.compare();
       
    }
    
}

