/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Library sample = new Library();

    @Test void testRollMethod() {
        int expected_length=5;
        assertEquals(expected_length,sample.roll(expected_length).size());
    }
    @Test void testContainsDuplicatesMethod(){
     ArrayList list=new ArrayList();
     list.add(1);
     list.add(2);
     list.add(3);
     assertFalse(sample.containsDuplicates(list));
     list.add(1);
     assertTrue(sample.containsDuplicates(list));


    }
    @Test void testAverageMethod(){
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        double expected=6/3;
        assertEquals(expected,sample.average(list));
        double wrongValue=6/2;
        assertNotEquals(wrongValue,sample.average(list));

    }
    @Test void testLowestAverageMethod(){
        int [][]array={{1,2,3},{4,4,4},{6,4,8}};
        int expected=2;
        assertEquals(expected,sample.lowestAverage(array));
    }
    @Test void testAnalyzeWeatherMethod(){
        int [][]array={{1,2,3},{4,4,4},{6,4,8}};
        String expected="8"+"\n"+"1"+"\n"+
                "Never saw temperature: "+5+"\n"+
                "Never saw temperature: "+7+"\n";
        assertEquals(expected,sample.analyzeWeatherData(array));
    }
    @Test void testTallyMethod(){
        ArrayList <String> array=new ArrayList<>();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("a");
        array.add("a");
        String excepted="a";
        assertEquals(excepted,sample.tally(array));
    }

}

