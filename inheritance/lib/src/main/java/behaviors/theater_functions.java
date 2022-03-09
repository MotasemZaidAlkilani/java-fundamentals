package behaviors;

public interface theater_functions {
    void addMovie(String movie);
    void removeMovie(String movie);
    void addReview(String movie,String author,String body,int stars);
    String toString();
}
