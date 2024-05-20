import java.util.Scanner;

public class minimumCostClimbingStairs {
    public static int solve(int n, int[] arr){
        // Step 1: Base Case
        if(n == 0){
            return arr[0];
        }
        if(n == 1){
            return arr[1];
        }

        int ans = arr[n] + Math.min(solve(n-1, arr), solve(n-2, arr));
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = Math.min(solve(n-1, arr), solve(n-2, arr));
        System.out.println(ans);
    }
}

