import java.util.Scanner;
public class JavaSwitch{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num = s.nextInt();
        switch(num) {
            case 1:
                System.out.println("The number is one");
                break;
            case 2:
                System.out.println("The number is two");
                break;
            case 3:
                System.out.println("The number is three");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
