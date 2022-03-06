/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library classUnderTest = new Library();

    @Test void newInstanceToString() {
        Restaurant sample1=new Restaurant("alhawen",3,"$$");
        Restaurant sample2=new Restaurant("faheem",7,"$");
        Restaurant sample3=new Restaurant("shawerma",-1,"$$$");
        Restaurant sample4=new Restaurant("vegan",0,"$");
        System.out.println("----------");
        System.out.println(sample1.toString());
    }
    @Test void reviewConstructorTest() {
       Review reviewSample=new Review("motasem","nice decor",3);
        System.out.println("----------");
        System.out.println(reviewSample.toString());
    }
    @Test void addReviewMethodTest() {
        Restaurant sample1=new Restaurant("alhawen",3,"$$");
        sample1.addReview("hussien","recommanded",5);
        sample1.addReview("george","bad",2);
        sample1.addReview("fahed","not bad,need more improve",3);
        System.out.println("----------");
        System.out.println(sample1.reviews);




    }
}
