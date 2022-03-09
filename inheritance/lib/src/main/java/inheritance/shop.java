package inheritance;

public class shop extends place_of_sale {

    public shop(String name, String Describtion, String price_category) {
        super(name, Describtion, price_category);
    }

    @Override
    public String toString(){
        return name+"-"+description+"-"+price_category;
    }
}
