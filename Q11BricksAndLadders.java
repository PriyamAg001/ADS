import java.util.Collection;
import java.util.PriorityQueue;
import java.util.*;

public class Q11BricksAndLadders {
    public static int sol(int[] arr, int bricks, int ladders){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<arr.length - 1; i++){
            if(arr[i] >= arr[i+1]){
                continue;
            }
            else{
                bricks -= arr[i+1] - arr[i];
            }

            pq.add(arr[i+1] - arr[i]);
            if(bricks < 0){
                bricks += pq.poll();
                if(ladders > 0){
                    ladders--;
                }
                else{
                    return i;
                }
            }
        }
        return arr.length - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int bricks = sc.nextInt();
        int ladders = sc.nextInt();
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println(sol(arr, bricks, ladders));
    }
}
