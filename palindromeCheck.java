
public class palindromeCheck {
    public static boolean areArraysPalindromes(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false; // Arrays must have the same length to be palindromes
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[arr2.length - 1 - i]) {
                return false; // Elements don't match in reverse order
            }
        }

        return true; // Arrays are palindromes
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 2, 1 };
        int[] array2 = { 1, 2, 3, 2, 1 };

        boolean result = areArraysPalindromes(array1, array2);
        if (result) {
            System.out.println("The arrays are palindromes.");
        } else {
            System.out.println("The arrays are not palindromes.");
        }
    }
}
