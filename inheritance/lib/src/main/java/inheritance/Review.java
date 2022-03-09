package inheritance;

public class Review  {
    String author;
    String movie;
    String body;
    int stars;
    public Review(String author,String body,int stars){
        this.author=author;
        this.body=body;
        if(stars>=0 && stars<=5){
        this.stars=stars;
    }else{
            this.stars=0;
        }

    }
    public Review(String movie,String author,String body,int stars){
        this.movie=movie;
        this.author=author;
        this.body=body;
        if(stars>=0 && stars<=5){
            this.stars=stars;
        }else{
            this.stars=0;
        }

    }

    public String toString(){
        return author+"-"+body+"-"+stars;
    }
    public String toString(String movie){
        return movie+"-"+author+"-"+body+"-"+stars;
    }

}
