package inheritance;

public class Review implements reviewFunctions {
    String author;
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
    @Override
    public String toString(){
        return "author : "+author+"\n"+"body : "+body+"\n"+"stars : "+stars;
    }

}
