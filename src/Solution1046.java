import java.util.PriorityQueue;

public class Solution1046 {
    public static void main(String[] args) {

    }
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>((f,s)->s-f);
        for (int stone : stones) {
            priorityQueue.add(stone);
        }
        while (priorityQueue.size()>1){
            priorityQueue.add(Math.abs(priorityQueue.poll()-priorityQueue.poll()));
        }
        return priorityQueue.peek();
    }
}
