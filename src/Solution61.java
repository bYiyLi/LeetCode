import java.util.Objects;

public class Solution61 {
    public static void main(String[] args) {

        rotateRight(new Solution143.ListNode(1,new Solution143.ListNode(2,new Solution143.ListNode(3,new Solution143.ListNode(4,new Solution143.ListNode(5))))),2);

    }
    public static Solution143.ListNode rotateRight(Solution143.ListNode head, int k) {
        Solution143.ListNode now = head;
        int n = 1;
        while (Objects.nonNull(now.next)){
            now=now.next;
            n++;
        }
        now.next=head;
        for (int i = 0; i < Math.abs(n-k); i++) {
            now = head;
            head=head.next;
        }
        now.next=null;
        return head;
    }
}
