import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = 0, r = s.length() - 1;
        int f = 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                f = 0;
                break;
            }
            l++;
            r--;
        }
        if (f == 1)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
