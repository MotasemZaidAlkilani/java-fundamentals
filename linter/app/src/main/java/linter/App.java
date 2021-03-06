/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        File f=new File("app/build/resources/main/gates.js");
        linter(f);
    }
    public static void linter(File file){
        String result="";
        try(Scanner scanner=new Scanner(file)){
            System.out.println("after");
            int count=1;
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                if(!line.isEmpty()){
                    if(!line.contains(";")&&!line.contains("{")
                            &&!line.contains("}")&&!line.contains("if")&&
                            !line.contains("else")&&!line.contains("//")){
                        result=result+"Line "+count+": missing semicolon."+"\n";

                    }
                }
                count++;
            }

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
System.out.println(result);
    }
}
