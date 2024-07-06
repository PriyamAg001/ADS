import java.util.Scanner;

public class Q44SingleElementAppearingInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int n = str.length;
        int[] arr = new int[n];

        int ans = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(str[i]);
            ans ^= arr[i];
        }
        System.out.println(ans);
    }
}
