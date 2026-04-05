import java.util.Scanner;
import java.util.Arrays;

public class search_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int num = sc.nextInt();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] < num) {
                l = m + 1;
            } else if (arr[m] > num) {
                r = m - 1;
            } else {
                System.out.println("Found=" + arr[m]);
                return;
            }
        }
        System.out.println("Not found");
    }
}
