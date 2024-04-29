package StreamAPIWIleyProject;

import StreamAPIWIleyProject.Movies;

import static StreamAPIWIleyProject.Movies.movieList;

public class DVDLibraryContolClass {
    public static void main(String[] args) {


        Movies movies1 = new Movies("The Dark Knight", 9.5,
                "CBale Studios", 2011, "Christopher Nolan");
        Movies movies2 = new Movies("The Dark Knight Rises", 9.2,
                "CBale Studios", 2014, "Christopher Nolan");
        Movies movies3=new Movies("Arrival",8.8,
                "DenisV Productions",2017,"Denis Villenueve");
       // System.out.println(movieList);
        MoviesMethods moviesMethods=new ListBasedImplementationOfMovieMethods();
        System.out.println(moviesMethods.movieReleasedInNYears(2014));
        System.out.println(moviesMethods.ratingWiseSearch(9.5));
        System.out.println(moviesMethods.sortMoviesByRating());
        System.out.println(moviesMethods.newestMoviesInCollection());


    }
}
