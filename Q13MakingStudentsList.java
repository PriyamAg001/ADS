import java.util.Scanner;

public class Q13MakingStudentsList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        String[] arr = s.split(" ");
        for(int i=arr.length - 1; i>=0; i--){
            System.out.println((i+1) + " " + arr[i]);
        }
        if(n > arr.length){
            System.out.println("Not Present");
        }
        else{
            System.out.println("Present");
        }
    }
}
