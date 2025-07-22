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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode tail = head;
        for (int i = 0; i < right - 1; i++) {
            tail = tail.next;
        }
        tail.next = null;
        for (int i = 0; i < left - 1; i++) {
            head = head.next;
        }

        return reverseList(head);
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}