import java.io.File;
public class checkfile {
    public static void main (String[] args){
        File x=new File("/Users/jinglunzhou/Desktop/changchang/text101.txt");
        if(x.exists()){
            System.out.println("It exists");
        }
        else{
            System.out.println("No");
        }
    }
}