import java.util.Scanner;

public class Q12PasswordOfTheTreasureBox {
    public static int sol(String s){
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                int n = ch - 'a';
                n++;
                ans -= n;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                int n = ch - 'A';
                n++;
                ans += n;
            }
        }

        if(ans < 0){
            return 0;
        }
        else if(ans > 9){
            return 9;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr= s.split(" ");
        for(int i=0; i<arr.length; i++){
            System.out.println(sol(arr[i]));
        }
    }
}
