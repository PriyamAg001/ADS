import java.util.Scanner;

public class Q8HearingChallenge {
    public static boolean isValid(String s) {
        for(int i=1; i<s.length(); i++){
            char ch = s.charAt(i);
            char prev = s.charAt(i-1);
            if(ch == 'Y' && prev == 's'){
                continue;
            }
            else if(ch == 'e' && prev == 'Y'){
                continue;
            }
            else if(ch == 's' && prev == 'e'){
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(isValid(s)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
