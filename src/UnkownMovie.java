import static java.lang.Character.toLowerCase;

public class UnkownMovie {

    private int size;
    private char[] name;
    private char[] discoveredName;

    UnkownMovie(String name) {

        this.name = name.toCharArray();
        this.size = this.name.length;

        this.discoveredName = this.name.clone();
        for (int i = 0; i < this.size; i++) {

            if (this.name[i] == ' '){

                this.discoveredName[i] = ' ';
            }
            else {

                this.discoveredName[i] = '_';
            }

        }
    }


    void uncoverLetter(char c){

        for (int i = 0; i < this.size; i++) {

            if (toLowerCase(this.name[i]) == toLowerCase(c)) {
                this.discoveredName[i] = this.name[i];
            }
        }

    }

    void printProgress(){
        String toPrint = "";
        for (int i = 0; i < this.size; i++) {

            toPrint += this.discoveredName[i] + " ";
        }

        System.out.println(toPrint);
    }

    void printMovieName(){
        System.out.println("The movie was: " );
        System.out.println(this.name);
    }

    boolean isCompleted(){
        for (int i = 0; i < this.size; i++) {

            if(toLowerCase(this.name[i]) != toLowerCase(this.discoveredName[i])){

                return false;
            }
        }
        return true;
    }
}
