import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Solution621 {
    public static void main(String[] args) {
        System.out.println(leastInterval(new char[]{'a','a','a','b','b','b'},2));
    }
    public static int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> map = new HashMap<>();
        for (char task : tasks) {
            map.put(task,map.getOrDefault(task,0)+1);
        }
        final int integer = map.values().stream().max(Integer::compareTo).get();
        final int count = (int) map.values().stream().filter(i -> i == integer).count();
        return Math.max(tasks.length-integer*count,(integer-1)*n-count)+integer*count;
    }
}
