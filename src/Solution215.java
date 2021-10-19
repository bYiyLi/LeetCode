import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        final char[] chars = line.toCharArray();
        StringBuilder builder = new StringBuilder();
        Deque<String> deque  = new ArrayDeque<>();
        for (char aChar : chars) {
            if ((aChar>='a'&&aChar<='z') || (aChar>='A'&&aChar<='Z')){
                builder.append(aChar);
            }else if(builder.length()>0){
                deque.addLast(builder.toString());
                builder.delete(0,builder.length());
            }
        }
        if (builder.length()>0){
            deque.addLast(builder.toString());
        }
        builder.delete(0,builder.length());
        while (!deque.isEmpty()){
            builder.append(deque.removeLast()).append(" ");
        }
        System.out.println(builder.toString());
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.add(num);
            if (queue.size()>k){
                queue.poll();
            }
        }
        return queue.peek();
    }
}
