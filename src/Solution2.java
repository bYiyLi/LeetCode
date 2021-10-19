import java.math.BigDecimal;
import java.util.Locale;
import java.util.Objects;

public class Solution2 {
      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        System.out.println(addTwoNumbers(new ListNode(2,new ListNode(4,new ListNode(3))),(new ListNode(5,new ListNode(6,new ListNode(4))))));
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        while (Objects.nonNull(l1)){
            s1.append(l1.val);
            l1 = l1.next;
        }
        while (Objects.nonNull(l2)){
            s2.append(l2.val);
            l2 = l2.next;
        }

        BigDecimal re = new BigDecimal(s1.reverse().toString()).add(new BigDecimal(s2.reverse().toString()));;

        String str=new StringBuilder().append(re.toString()).reverse().toString();
        ListNode root = new ListNode();
        ListNode now = root;
        int n=0;
       while (n<str.length()){
            now.val=Integer.parseInt(String.valueOf(str.charAt(n)));
            ListNode tem = new ListNode();
            now.next=tem;
            now=tem;
            n++;
        }
        now = root;
         while (Objects.nonNull(now.next)&&Objects.nonNull(now.next.next)){
              now=now.next;
        }
        now.next=null;
        return root;
    }
}
