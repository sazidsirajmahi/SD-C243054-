import java.util.Scanner;
public class 1No{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int c=sc.nextInt();
        if((a+c)%2==0)
            System.out.println("yes"+" "+((a+c)/2));
        else
            System.out.println("no");
    }
}
