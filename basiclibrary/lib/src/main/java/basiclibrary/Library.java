/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.*;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[]args){
        ArrayList array=roll(5);
        System.out.println(containsDuplicates(array));
        System.out.println(average(array));
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println(lowestAverage(weeklyMonthTemperatures));


        System.out.println("\n"+"analyzeWeatherData"+"\n"+"----------");
        System.out.println(analyzeWeatherData(weeklyMonthTemperatures));
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        System.out.println("\n"+"analyzeWeatherData"+"\n"+"----------");
        System.out.println(tally(votes));

    }
    public static ArrayList roll(int n){
        Random rand=new Random();
        ArrayList result=new ArrayList();
        for(int i=0;i<n;i++){
            result.add(rand.ints(1, 7)
                    .findFirst()
                    .getAsInt());

        }
        return result;

    }

    public static boolean containsDuplicates(ArrayList array){
        boolean result=false;
        boolean statue=false;
        for(int i=0;i< array.size();i++){
            if(statue){break;}
            for(int j=0;j<array.size();j++){
                if(j!=i&&array.get(i)==array.get(j)){
                    result=true;
                    statue=true;
                    break;
                }
            }
        }
        return result;
    }

    public static double average(ArrayList <Integer>array){
        double sum=0f;
        double average=0f;
        for(int i=0;i<array.size();i++){
            sum=sum+array.get(i);
        }
        return sum/array.size();
    }

    public static int [] lowestAverage(int [][]array){
        double lowestAverage=1000;
        int index=0;
        for(int i=0;i<array.length;i++){
            double sum=0;
            for(int j=0;j<array[i].length;j++){
                sum=sum+array[i][j];
                if(j==array[i].length-1){
                    if(sum/array[i].length<lowestAverage){
                        lowestAverage=sum/array[i].length;
                        index=i;
                    }
                }
            }
        }
        int result[]=new int[array[index].length];
        for(int m=0;m<array[index].length;m++){
            result[m]=array[index][m];
        }
        return result;
    }
    public static String analyzeWeatherData(int [][] array){
        String result="";
        Set<Integer> set_array=new HashSet<Integer>();
        int max=0;
        int min=1000;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                set_array.add(array[i][j]);
                if(array[i][j]>max){
                   max=array[i][j];
                }
                if(array[i][j]<min){
                  min= array[i][j];

                }

            }
        }
        result=max+"\n"+min+"\n";
        for(int m=min;m<max;m++){
            if(!(set_array.contains(m))){
                result=result+"Never saw temperature: "+m+"\n";
            }
        }
        return result;
    }
    public static String tally(List<String> votes){
        String result="";
        int theMostVote=0;
        Map<String,Integer> map_array=new HashMap<String,Integer>();
        for(int i=0;i<votes.size();i++){
            if(map_array.containsKey(votes.get(i))){
                map_array.put(votes.get(i),map_array.get(votes.get(i))+1);
                if(map_array.get(votes.get(i))>theMostVote){
                    result=votes.get(i);
                }
            }
            else{
                map_array.put(votes.get(i),1);
            }
        }


        return result;
    }

}
