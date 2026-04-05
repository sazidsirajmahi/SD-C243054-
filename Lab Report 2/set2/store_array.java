import java.util.Scanner;
public class store_array{
public static void main(String[] arg){
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<5;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<5;i++){
System.out.print(a[i]+" ");
}
}
}
