import java.util.Scanner;
public class multiplication_table{
    public static void main(String[] arg){
       Scanner sc = new Scanner(System.in);    
        int a = sc.nextInt();
      
       int i=1;
       while(i<=10){
        System.out.println(a +" *"+" "+i+" ="+(a*i));
        i++;
       }

    }
}
