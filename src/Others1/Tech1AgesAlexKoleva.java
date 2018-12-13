import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tech1AgesAlexKoleva {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int age=Integer.parseInt(reader.readLine());
        if(age>=0&&age<=2){
            System.out.println("baby");
        }else if(age<=13){
            System.out.println("child");
        }else if(age<=19){
            System.out.println("teenager");
        }else if(age<=65){
            System.out.println("adult");
        }else{
            System.out.println("elder");
        }


    }
}
