public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(0);
        solution.hasCycle(head);
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if ( slow == fast ) {
                return true;
            }
        }
        return false;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
}