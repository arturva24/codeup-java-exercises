
package movies;


import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        do {

            System.out.println("What would you like to view?\n" +
                    "\n" +
                    "0 - Exit\n" +
                    "1 - View all movies\n" +
                    "2 - View movies in the Animated category\n" +
                    "3 - View movies in the Drama category\n" +
                    "4 - View movies in the Horror category\n" +
                    "5 - View movies in the Scifi category\n");

            System.out.println("Enter your choice:");


            int movieOptions = input.getInt("Enter your choice: ", 0, 5);

            if (movieOptions == 0) {
                System.out.println("See you later!");
                break;

            } else if (movieOptions == 1) {
                Movie[] allMovies = MoviesArray.findAll();

                for (Movie movie : allMovies) {
                    System.out.println(movie.getName());

                }
            } else if (movieOptions == 2) {
                Movie[] allMovies = MoviesArray.findAll();

                for (Movie movie : allMovies) {
                    if (movie.getCategory().equals("animated")) {
                        System.out.println(movie.getName());

                    }
                }
            } else if (movieOptions == 3) {
                Movie[] allMovies = MoviesArray.findAll();


                for (Movie movie : allMovies) {
                    if (movie.getCategory().equals("drama")) {
                        System.out.println(movie.getName());

                    }
                }
            } else if (movieOptions == 4) {
                Movie[] allMovies = MoviesArray.findAll();

                for (Movie movie : allMovies) {
                    if (movie.getCategory().equals("horror")) {
                        System.out.println(movie.getName());

                    }
                }
            } else if (movieOptions == 5) {
                Movie[] allMovies = MoviesArray.findAll();

                for (Movie movie : allMovies) {
                    if (movie.getCategory().equals("scifi")) {
                        System.out.println(movie.getName());

                    }
                }
            }
            System.out.println();
            System.out.println("Would you like to continue? y/n");
        } while (input.yesNo());
        System.out.println("Goodbye.");
    }
}





