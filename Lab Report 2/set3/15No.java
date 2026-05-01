import java.util.Scanner;
public class 15No{
 public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=sc.nextInt();
 int min=a;
 if(c>a)
   min=c;
 if(min<=b)
   System.out.println("YES");
else
  System.out.println("NO");
  sc.close();
    }
}
