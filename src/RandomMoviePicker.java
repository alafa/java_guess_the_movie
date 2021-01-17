import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomMoviePicker {

    List <String> movieList;

    RandomMoviePicker() {

        movieList = new ArrayList();

        File movieFile = new File("./src/Movies.txt");

        if(!movieFile.exists()){

            System.out.println("WARNING: Movie file not found.");
        }

        try {
            Scanner fileScanner = new Scanner(movieFile);
            while (fileScanner.hasNextLine()) {

                this.movieList.add(fileScanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            //do something with e, or handle this case
            this.movieList = List.of("Tarzan", "Toy Story", "Titanic");
        }
    }

    String pickUpARandomMovie(){

        Random random = new Random();
        int randomIndex = random.nextInt(this.movieList.size() + 1) ;

        return this.movieList.get(randomIndex);
    }


}
