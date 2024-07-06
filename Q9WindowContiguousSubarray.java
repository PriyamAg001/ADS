import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q9WindowContiguousSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 0){
                q.add(i);
            }
        }

        int k = sc.nextInt();
        int i = 0;
        int j = k-1;
        while(j < arr.length){
            while (!q.isEmpty() && q.peek() < i) {
                q.poll();
            }
            if(!q.isEmpty() && q.peek() >= i && j >= q.peek()){
                System.out.println(arr[q.peek()] + " ");
            }
            else{
                System.out.println(0 + " ");
            }
            i++;
            j++;
        }
    }
}
