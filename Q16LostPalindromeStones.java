import java.util.*;

public class Q16LostPalindromeStones {
    public static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) { // Adjusted loop boundary
                if (isPalindrome(s, i, j)) {
                    list.add(s.substring(i, j + 1) + " " + i + "-" + j);
                }
            }
        }

        if (list.isEmpty()) {
            System.out.println("No palindrome substring found");
            return;
        }

        Collections.sort(list, (a, b) -> a.length() - b.length());
        for (String palindrome : list) {
            System.out.println(palindrome);
        }
    }
}