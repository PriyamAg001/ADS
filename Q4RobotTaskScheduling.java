import java.util.Scanner;

public class Q4RobotTaskScheduling {
    public static int sol(int[][] arr, int row, int col){
        if(row == arr.length - 1 && col == arr[0].length - 1){
            return arr[row][col];
        }
        if(row >= arr.length || col >= arr[0].length){
            return Integer.MIN_VALUE;
        }
        return Math.max(sol(arr, row + 1, col), sol(arr, row, col + 1)) + arr[row][col];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(sol(arr, 0, 0));
    }
}

