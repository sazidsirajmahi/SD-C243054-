import java.util.Scanner;

public class 1No {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if ((num1 + num2) % 2 == 0) {
            System.out.println("YES. The average of " + num1 + " and " + num2 + " is an Integer. " + (num1 + num2) / 2);
        } else {
            System.out.println("No. The average of " + num1 + " and " + num2 + " is not an Integer.");
        }

        input.close();
    }
}
