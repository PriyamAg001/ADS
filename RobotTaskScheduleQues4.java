import java.util.Scanner;
public class RobotTaskScheduleQues4 {
    public static int sol(int[][] mat, int r, int c){
        if(r == mat.length - 1 && c == mat[0].length - 1) {
            return mat[r][c];
        }
        if(r >= mat.length || c >= mat[0].length){
            return Integer.MIN_VALUE;
        }
        return Math.max(sol(mat,r+1, c), sol(mat, r, c+1)) + mat[r][c];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mat[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(sol(mat,0,0));
    }
}