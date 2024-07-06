import java.util.Arrays;
import java.util.Scanner;

public class Q23NonOverlappingIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, (a,b) -> a[0] - b[0]);
        int ans = 0;
        int end = arr[0][1];
        for(int i=1; i<n; i++){
            if(arr[i][0] < end){
                ans++;
                end = Math.min(arr[i][1], end);
            }
            else{
                end = arr[i][1];
            }
        }
        System.out.println(ans);
    }
}
