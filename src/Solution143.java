import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class Solution143 {


    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {




    }
    public void reorderList(ListNode head) {
        Deque<ListNode> deque = new ArrayDeque<>();
        if (Objects.isNull(head)){
            return;
        }
        ListNode now =head;
        while (Objects.nonNull(now)){
            deque.addLast(now);
            now=now.next;
            deque.getLast().next=null;
        }
        ListNode newList = new ListNode();
        now = newList;
        while (!deque.isEmpty()){
            now.next = deque.removeFirst();
            now = now.next;
            if (!deque.isEmpty()){
                now.next = deque.removeLast();
                now = now.next;
            }
        }
        head.next = newList.next.next;
    }
}
