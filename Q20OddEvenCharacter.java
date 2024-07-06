import java.util.Scanner;

public class Q20OddEvenCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(i%2 == 0){
                arr[i]++;
            }
            else{
                arr[i]--;
            }
        }
        System.out.println(new String(arr));
    }
}
