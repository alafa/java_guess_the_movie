public class Game {

    private boolean hasEnded;
    private boolean userSuccess;
    private int attemps;
    private UnkownMovie theMovie;

    Game(String movieName){

        this.theMovie = new UnkownMovie(movieName);
        this.hasEnded = false;
        this.userSuccess = false;
        this.attemps = 0;
    }

    void printPresentationOfGame(){

        System.out.println("Enter a letter to start.");
        this.theMovie.printProgress();
    }

    private void printAttemps(){

        System.out.println("You have tried " + this.attemps + " times.");
    }

    boolean getHasEnded(){

        return this.hasEnded;
    }

    void userGoesWithLetter(char l){

        this.theMovie.uncoverLetter(l);
        this.theMovie.printProgress();
        this.attemps++;

        if(this.theMovie.isCompleted()){

            System.out.println("CONGRATULATIONS!");
            this.hasEnded = true;
        }
        else{

            if(this.attemps >= 10){

                System.out.println("Sorry! your time is over.");
                this.theMovie.printMovieName();
                this.hasEnded = true;
            }
            else{
                System.out.println("You have tried " + this.attemps + " times.Continue trying!");

            }
        }
    }
}
