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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode cur = head;
        while(cur.next != null) {
            int gcd = getGCD(cur.val, cur.next.val);
            ListNode temp = new ListNode(gcd, cur.next);
            cur.next = temp;
            cur = temp.next;
        }
        return head;
    }

    public int getGCD(int a, int b) {
        while (a % b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }
}