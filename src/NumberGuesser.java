
import java.util.*;
//import java.util.Random;
class Guesser{
    int  GuessedNumber;

    int GuessingNumber(){
        System.out.println("Guessing number by computer between 0 to 5 ");
        Random RandomGenrator = new Random();
        int GuessedNumber = (RandomGenrator.nextInt(5));
        return GuessedNumber;
    }
}
class players{

    int firstPlayer(){
        System.out.println();
        System.out.println("1st player guess the number please:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }
    int secondPlayer(){
        System.out.println("2st player guess the number please:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }
    int thirdPlayer(){
        System.out.println("3st player guess the number please:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }
}
class umpire{
    int GeneratedNumber;
    int firstPlayer;
    int secondPlayer;
    int thirdPlayer;



    void dataOfGuesses(){
        Guesser g =new Guesser();
        GeneratedNumber =g.GuessingNumber();
    }
    void dataOfPlayers(){
        players p = new players();
        firstPlayer = p.firstPlayer();
        secondPlayer = p.secondPlayer();
        thirdPlayer=p.thirdPlayer();
    }

    void compare(){
        System.out.println("Results:--");
        if(GeneratedNumber == firstPlayer){
            System.out.println("firstPlayer guessed RIGHT");
        }
        else {
            System.out.println("firstPlayer guessed WRONG");
        }
        if(GeneratedNumber == secondPlayer){
            System.out.println("secondPlayer guessed RIGHT");
        }
        else {
            System.out.println("secondPlayer guessed WRONG");
        }
        if(GeneratedNumber == thirdPlayer){
            System.out.println("thirdPlayer guessed RIGHT");
        }
        else {
            System.out.println("thirdPlayer guessed WRONG");
        }
        System.out.println();
        if(GeneratedNumber == firstPlayer ||GeneratedNumber == secondPlayer || GeneratedNumber == thirdPlayer ){
            System.out.println("CONGRATULATIONS");
        }
        else System.out.println("BETTER LUCK NEXT TIME ");
        System.out.println();
        System.out.println("Computer guessed  :"+ GeneratedNumber);

    }
}
//-------------------------------------------------main----------------------------
public class NumberGuesser {
    public static void main(String[] args) {
        umpire u = new umpire();
        u.dataOfGuesses();
        u.dataOfPlayers();
        u.compare();

    }
}
