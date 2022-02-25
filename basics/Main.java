import java.util.Random;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.lang.*;

class Main{
    public static void  main(String [] args) {
        System.out.println("pluralize"+"\n"+"__________");
        int dogCount = 1;
        System.out.println("I own " + dogCount  + " " + pluralize("dog",  dogCount) + ".");
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        System.out.println("__________"+"\n");
        System.out.println("flipNHeads"+"\n"+"__________");
        flipNHeads(1);
        System.out.println("__________"+"\n");
        System.out.println("Clock"+"\n"+"__________");
        Clock();
        System.out.println("__________"+"\n");
    }




    public static String pluralize(String word,int num){
        if(num ==0 || num==1){
            return word;
        }
        else if(num>1){
            return word+"s";
        }
        return "";
    }




    public static void flipNHeads(int n){
        Random rand=new Random();
        int j=0;
        int count=0;
while(j!=n){
    count=count+1;
    float randNum=rand.nextFloat();
if(randNum>0.5){
    System.out.println("heads");
    j=j+1;
        }
else if(randNum<0.5){
    System.out.println("tails");
}
if(j==n){
    System.out.println("It took "+count+" flips to flip "+n+" head in a row.");
}
    }
}


public static void Clock(){
    Scanner scanner = new Scanner(System.in);

        while(true){
            //
            Long start=System.currentTimeMillis();
            LocalDateTime now=LocalDateTime.now();
            int hour=now.getHour();
            int minute=now.getMinute();
            int second=now.getSecond();
            String time=now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            try {
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.print(time);
            long end = System.currentTimeMillis();
            long result=end-start;
            String f=String.format("%,d", result);
            if(result<1000){
                System.out.println(" "+f+" Hz");
            }
            else if(result>999&&result<10000){

                System.out.println(" "+f+" KHz");
            }
            else if(result>999999&&result<10000000){
                System.out.println(" "+f+" MHz");
            }
            else if(result>999999999&&result<10000000000L){
                System.out.println(" "+f+" GHz");
            }
        }
}


}