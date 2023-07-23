package Strings;
import java.util.Scanner;

class Guesser{
    int guessNum;
   int guessingNumber(){
        Scanner scan= new Scanner(System.in);
       System.out.println("Gussser ! kindly guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
  }

  class Player{
    int guessNum;
    int guessingNumber(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Player ! kindly guess the number");
        guessNum= scan.nextInt();
        return guessNum;
    }
  }

  class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser(){
        Guesser g= new Guesser();
        numFromGuesser= g.guessingNumber();
    }
    void collectNumFromPlayer(){
        Player p1= new Player();
        Player p2 = new Player();
        Player p3= new Player();
        numFromPlayer1=p1.guessingNumber();
        numFromPlayer2=p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();

    }
    void compare(){
      if (numFromGuesser==numFromPlayer1){
          if (numFromGuesser==numFromPlayer2&& numFromGuesser==numFromPlayer3){
              System.out.println("you all theree player win");
          } else if (numFromGuesser==numFromPlayer2) {
              System.out.println("Player1 and Player2 win");
          } else if (numFromGuesser==numFromPlayer3) {
              System.out.println("Player1 and Player3 win");
          }else {
              System.out.println("Player1 won the game");
          }

      }else if (numFromGuesser==numFromPlayer2){
          if (numFromGuesser==numFromPlayer3){
              System.out.println("Player2 and Player3 are win");
          }else {
              System.out.println("Player2 won the game");
          }

      }else if (numFromGuesser==numFromPlayer3){
          System.out.println("Player3 won the game");
      }else {
          System.out.println("you all loose the game !!");
      }

    }

  }

public class Game {
    public static void main(String[] args) {
        System.out.println("Game started");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
}
