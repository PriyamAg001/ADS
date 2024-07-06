import java.util.Scanner;

public class Q14SpecialElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int n = str.length;

        if(n == 1){
            System.out.println(1);
            return;
        }

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        int m = arr.length;
        int ans = 0;
        int evenSum = 0;
        int oddSum = 0;

        for(int i=0; i<m; i++){
            if(i % 2 == 0){
                evenSum += arr[i];
            }
            else{
                oddSum += arr[i];
            }
        }

        int prev = 0;
        for(int i=0; i<m; i++){
            if(i % 2 == 0){
                evenSum = evenSum - arr[i] + prev;
            }
            else{
                oddSum = oddSum - arr[i] + prev;
            }

            if(evenSum == oddSum){
                ans++;
            }

            prev = arr[i];
        }
        System.out.println(ans);
    }
}
