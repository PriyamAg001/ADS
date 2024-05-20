import java.util.Arrays;

public class sortArrayAccordingToSum {
    public static void main(String[] args) {
        int[] originalArray = { 3, 7, 2, 9, 5 };
        Arrays.sort(originalArray);


        // Calculate the size of the new array (same as the original array)
        int newSize = originalArray.length;

        // Create a new array to store the cumulative sums
        int[] sumArray = new int[newSize];

        // Compute the cumulative sums of adjacent elements
        sumArray[0] = originalArray[0];
        for (int i = 1; i < newSize; i++) {
            sumArray[i] = sumArray[i - 1] + originalArray[i];
        }

        // Print the cumulative sums
        System.out.println("Cumulative sums of adjacent elements:");
        System.out.println(Arrays.toString(sumArray));
    }
}