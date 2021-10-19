import java.util.*;

public class Solution1019 {
    public static void main(String[] args) {

    }
    public int[] nextLargerNodes(Solution143.ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (Objects.nonNull(head)){
            list.add(head.val);
            head=head.next;
        }
        final int[] res = new int[list.size()];
        Deque<Integer> stack = new ArrayDeque<>();
        stack.addLast(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) >= list.get(stack.getLast())) {
                while (!stack.isEmpty()) {
                    if (list.get(stack.getLast()) < list.get(i)) {
                        res[stack.removeLast()] = list.get(i);
                    } else {
                        break;
                    }
                }
            }
            stack.addLast(i);
        }
        while (!stack.isEmpty()){
            res[stack.removeLast()]=0;
        }
        return res;
    }
}
