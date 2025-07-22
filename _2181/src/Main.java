public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode tail = head;
        for (ListNode curr = head.next; curr.next != null; curr = curr.next) {
            if(curr.val != 0) {
                tail.val += curr.val;
            } else {
                tail = tail.next;
                tail.val = 0;
            }
        }
        tail.next = null;
        return head;
    }
}