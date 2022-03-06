package inheritance;

import java.util.ArrayList;

public class Restaurant implements restaurant_functions {
    String name;
    int numbers_of_stars;
    String price_category;
    int reviews_numbers=0;
    int sum_reviews=0;
    ArrayList <String> reviews=new ArrayList<String>();
    public Restaurant(String name,int numbers_of_stars, String price_category){
        this.name=name;
        this.numbers_of_stars=numbers_of_stars;
        this.price_category=price_category;
    }
    @Override
    public String toString(){
        return "name : "+name+"\n"+"stars : "+numbers_of_stars+"\n"+"price_category : "+price_category;
    }

    @Override
    public void addReview(String author,String body,int stars) {
    Review new_review=new Review(author,body,stars);
    reviews.add(new_review.toString());
    reviews_numbers++;
    change_stars_rate(stars);
    }

    @Override
    public void change_stars_rate(int review_star) {
        sum_reviews=sum_reviews+review_star;
        numbers_of_stars=sum_reviews/reviews_numbers;
    }
}
