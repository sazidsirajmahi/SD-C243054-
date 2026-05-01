import java.util.Scanner;
 public class candies{
 public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int x=sc.nextInt();
int need=n-x;
  if(need<=0)
  System.out.println(0);
  else 
  System.out.println((need+3)/4);
sc.close();
      }
 }
