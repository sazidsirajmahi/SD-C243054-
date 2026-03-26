import java.util.Scanner;
public class java_whileloop{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num = s.nextInt();
        int x=0,mod;
        while(num>0){
            mod=num%10;
            x=mod+(x*10);
            num/=10;

        }
        System.out.println("the reversed number is = " + x);
        }
    }
