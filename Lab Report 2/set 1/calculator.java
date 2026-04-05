import java.util.Scanner;
public class calculator{
    public static void main(String[] arg){
       Scanner sc = new Scanner(System.in);
        System.out.println("THE OPERATION YOU WANT TO DO ");
          char op = sc.next().charAt(0);
        int a = sc.nextInt();
        int b = sc.nextInt();
      
        if(op =='+'){
            System.out.println("The sum of the  two num is "+(a+b));
        }
       else if(op =='-'){
            System.out.println("The substraction  of the  two num is "+(a-b));
        }
       else if(op =='*'){
            System.out.println("The Multiplication of the  two num is "+(a*b));
        }
       else if(op =='/'){
            System.out.println("The division  of the  two num is "+((double)a/b));
        }
       

    }
}
