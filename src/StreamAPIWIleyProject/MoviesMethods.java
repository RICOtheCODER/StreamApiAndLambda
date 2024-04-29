package StreamAPIWIleyProject;

import java.util.List;

public interface MoviesMethods {
    List<Movies> movieReleasedInNYears(int year);
    List<Movies> ratingWiseSearch(double rating);
    List<Movies> movieFinderByDirector(String diector);
    List<Movies> sortMoviesByRating();

    double avgAgeofMovies();

    String newestMoviesInCollection();
    String oldestMoviesInCollection();


}
