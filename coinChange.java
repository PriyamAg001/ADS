import java.util.*;

public class coinChange {
    public static int solve(int[] arr, int n, int amount, int[] dp) {
        // Step 1: Base Case
        if(amount == 0){
            return 0;
        }
        if(amount  < 0){
            return Integer.MAX_VALUE;
        }

        // Step 3:
        if(dp[amount] != -1){
            return dp[amount];
        }

        // Step 2: RR
        int mini = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int ans = solve(arr, n, amount - arr[i], dp);
            if(ans != Integer.MAX_VALUE){
                mini = Math.min(mini, ans + 1);
            }
        }
        dp[amount] = mini;
        return dp[amount];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int amount = sc.nextInt();
        
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);

        int ans = solve(arr, n, amount, dp);
        if (ans == Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(ans);
        }
    }
}
