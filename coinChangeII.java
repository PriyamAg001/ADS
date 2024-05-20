import java.util.Arrays;
import java.util.Scanner;

public class coinChangeII {
    public static int solve(int i, int amount, int[] arr, int[][] dp){
        // Step 1: Base Case
        if(i >= arr.length || amount < 0){
            return 0;
        }
        if(amount == 0){
            return 1;
        }

        // Step 3:
        if(dp[i][amount] != -1){
            return dp[i][amount];
        }

        // Step 2: RR
        int incl = solve(i+1, amount, arr, dp);
        int excl = solve(i, amount - arr[i], arr, dp);

        int result = incl + excl;

        dp[i][amount] = result;
        return dp[i][amount];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int amount = sc.nextInt();

        int[][] dp = new int[n + 1][amount + 1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[i].length; j++){
                dp[i][j] = -1;
            }
        }

        int ans = solve(0, amount, arr, dp);
        System.out.println(ans);
    }
}
