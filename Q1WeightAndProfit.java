import java.util.*;

public class Q1WeightAndProfit {
    public static int sol(int[][] arr, int weight, int idx) {
        if(idx == arr.length){
            return 0;
        }
        int ans = 0;
        if(weight >= arr[idx][0]){
            ans = sol(arr, weight - arr[idx][0], idx + 1) + arr[idx][1];
        }
        ans = Math.max(ans, sol(arr, weight, idx + 1));
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int weight = sc.nextInt();
        System.out.println(sol(arr, weight, 0));
    }
}
