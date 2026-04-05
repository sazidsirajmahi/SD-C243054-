import java.util.Scanner;
public class upper_to_lowercase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String upper = s.toUpperCase();
        String lower = s.toLowerCase();
        
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}
