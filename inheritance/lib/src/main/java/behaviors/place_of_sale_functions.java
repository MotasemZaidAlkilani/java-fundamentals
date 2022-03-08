package behaviors;

public interface place_of_sale_functions {
    void addReview(String author,String body,int stars);
    void change_stars_rate(int review_star);
    String toString();
}
