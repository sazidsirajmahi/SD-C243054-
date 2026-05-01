import java.util.Scanner;

public class 3No{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c=Character.toUpperCase(s.charAt(0));
        s=c+s.substring(1);
        System.out.println(s);
        sc.close();
    }
}
