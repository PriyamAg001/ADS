
import java.util.*;

public class duplicatepresentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Set<Integer> seen = new HashSet<>();
        System.out.print("Duplicate elements: ");
        for (int num : arr) {
            if (seen.contains(num)) {
                System.out.print(num + " ");
            } else {
                seen.add(num);
            }
        }
    }
}
