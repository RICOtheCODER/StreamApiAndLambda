package StreamAPIWIleyProject;

import java.util.ArrayList;
import java.util.List;

public class Movies {
    String name;
    double rating;
    String studio;
    int releaseYear;
    String director;
    static List<Movies> movieList=new ArrayList<>();

    public Movies(String name, double rating, String studio, int releaseYear, String director) {
        this.name = name;
        this.rating = rating;
        this.studio = studio;
        this.releaseYear = releaseYear;
        this.director = director;
        movieList.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", studio='" + studio + '\'' +
                ", releaseYear=" + releaseYear +
                ", director='" + director + '\'' +
                '}';
    }
}
