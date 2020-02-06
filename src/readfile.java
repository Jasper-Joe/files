import java.util.*;
import java.io.*;
public class readfile {
    private Scanner x;
    public void openFile(){
        try{
            x=new Scanner(new File("/Users/jinglunzhou/Desktop/changchang/text101.txt"));
        }
        catch(Exception e){
            System.out.println("wrong");
        }
    }
    public void readFile(){
        while (x.hasNext()){
            String a=x.next();
            String b=x.next();
            String c=x.next();
            System.out.printf("%s %s %s ",a,b,c);
        }

    }

    public void closeFile(){
        x.close();
    }


}
