import java.util.Scanner;

public class KthSmallestIn2SortedArray {
    public static int findKthSmallest(int[] arr1, int[] arr2, int k) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                k--;
                if (k == 0) {
                    return arr1[i];
                }
                i++;
            }
            else {
                k--;
                if (k == 0) {
                    return arr2[j];
                }
                j++;
            }
        }

        // Handle remaining elements if any
        while (i < n1) {
            k--;
            if (k == 0) {
                return arr1[i];
            }
            i++;
        }
        while (j < n2) {
            k--;
            if (k == 0) {
                return arr2[j];
            }
            j++;
        }

        return -1; // Invalid input or k exceeds total elements
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 2, 4, 6, 8 };
        int k = 5; // Example: Find the 5th smallest element

        int result = findKthSmallest(arr1, arr2, k);
        System.out.println("The " + k + "th smallest element is: " + result);
    }
}
