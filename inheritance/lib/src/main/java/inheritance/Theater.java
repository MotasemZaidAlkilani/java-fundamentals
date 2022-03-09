package inheritance;

import behaviors.theater_functions;

import java.util.ArrayList;

public class Theater extends place_of_sale implements theater_functions {
    String name;
    ArrayList <String>movies=new ArrayList<String>();
    public Theater(String name){
        this.name=name;

    }

    @Override
    public void addMovie(String movie) {
    movies.add(movie);
    }
    @Override
    public void removeMovie(String movie) {
        movies.remove(movie);

    }
    @Override
    public String toString(){
     return movies.toString();
    }
    @Override
    public void addReview(String movie, String author, String body, int stars) {
        Review new_review=new Review(movie,author,body,stars);
        reviews.add(new_review.toString(movie));
        reviews_numbers++;
        change_stars_rate(stars);
    }

}
