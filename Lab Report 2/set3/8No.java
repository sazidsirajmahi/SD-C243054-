import java.util.Scanner;
public class 8No{
public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
 int x=sc.nextInt();
 int y=sc.nextInt();
   int z=sc.nextInt();
 int total=x*y;
if(z*2>total)
  System.out.println("YES");
else
  System.out.println("NO");
sc.close();
}
}
