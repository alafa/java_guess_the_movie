import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        RandomMoviePicker myMoviePicker = new RandomMoviePicker();
        Game myGame = new Game(myMoviePicker.pickUpARandomMovie());
        Scanner scanner = new Scanner(System.in);

        myGame.printPresentationOfGame();
        while(!myGame.getHasEnded()){

            char userChar = scanner.nextLine().toCharArray()[0];
            myGame.userGoesWithLetter(userChar);
        }
    }
}
