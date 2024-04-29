package StreamAPIWIleyProject;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import static StreamAPIWIleyProject.Movies.movieList;

public class ListBasedImplementationOfMovieMethods implements MoviesMethods {

    @Override
    public List<Movies> movieReleasedInNYears(int year) {
        List<Movies> movieReleased=movieList.stream().filter
                (e ->e.getReleaseYear() ==year).collect(Collectors.toList());
        //stream api method to return listt that is going to return the list of
        //..movie released ina particular year
        return movieReleased;
    }

    @Override
    public List<Movies> ratingWiseSearch(double rating) {
        List<Movies> ratingWiseSearch=movieList.stream()
                .filter(e ->e.getRating()==rating).collect(Collectors.toList());
        return ratingWiseSearch;

    }

    @Override
    public List<Movies> movieFinderByDirector(String diector) {
        List<Movies> movieFinderByDirector=movieList.stream()
                .filter(e ->e.getDirector().equals(diector)).collect(Collectors.toList());
        return movieFinderByDirector;
    }

    @Override
    public List<Movies> sortMoviesByRating() {
        List<Movies> sortMovieByRating =movieList.stream()
                .sorted(Comparator.comparingDouble(Movies::getRating)).collect(Collectors.toList());
        //sortng using a comparator and a method reference
        return sortMovieByRating;
    }

    @Override
    public double avgAgeofMovies() {
        double avgAge=movieList.stream().collect(Collectors.averagingInt(p -> p.getReleaseYear()));
        return Math.round(avgAge);
        //Find average age of movies using the collectors.averageInt method
        //..averageInt is a functionalInterface

    }

    @Override
    public String newestMoviesInCollection() {
        String nameofnewest="";
        int newest= movieList.stream().max(Comparator.comparing(Movies::getReleaseYear))
                .orElseThrow(NoSuchElementException::new).getReleaseYear();
        for(Movies movies:movieList){
            if(movies.getReleaseYear()==newest){
                nameofnewest=movies.getName();
            }
        }
        return nameofnewest;
    }

    @Override
    public String oldestMoviesInCollection() {
        String oldestMovie="";
        int oldest=movieList.stream().min(Comparator.comparing(Movies::getReleaseYear))
                .orElseThrow(NoSuchElementException::new).getReleaseYear();
        for(Movies movies:movieList){
            if(movies.getReleaseYear()==oldest){
                oldestMovie=movies.getName();
            }
        }
        return oldestMovie;
    }

}
