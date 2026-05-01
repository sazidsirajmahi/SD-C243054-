import java.util.Scanner;
public class 10Nop{
public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
  int b1=sc.nextInt();
 int b2=sc.nextInt();
 int b3=sc.nextInt();
 int empty=0;
if(b1==0)
  empty++;
if(b2==0)
  empty++;
if(b3==0)
  empty++;
if(empty>=2)
  System.out.println("Water filling time");
else 
  System.out.println("Not now");
sc.close();
}
}
