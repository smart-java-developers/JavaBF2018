import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TechLoginExAlexKoleva {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String userName=reader.readLine();


        String password="";
        for (int i =userName.length()-1 ; i >=0 ; i--) {
            password+=userName.charAt(i);

        }
        int counter=1;
       String inputPassword=reader.readLine();
        while (!inputPassword.equals(password)){
            counter++;
            System.out.println("Inccorect password. Try again.");
            inputPassword=reader.readLine();
            if(counter==4){
                break;
            }
        }
        if(inputPassword.equals(password)){
            System.out.println("User "+userName +" logged in.");
        }else {
            System.out.println("User "+ userName+" blocked!");
        }
    }
}
