import java.util.Scanner;
public class java_if_else{
    public static void main(String[] args){
       int password,random;
       Scanner s;
       s= new Scanner(System.in);
       random=s.nextInt();
       password=103666;

        if(password==random)
            System.out.println("Password is correct");
        else
            System.out.println("Password is incorrect");  
    }
}
