package inheritance;

public interface restaurant_functions {
    void addReview(String author,String body,int stars);
    void change_stars_rate(int review_star);
    String toString();
}
