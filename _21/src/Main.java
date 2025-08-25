public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode head = null;
        ListNode cur = null;
        head.next = cur;
        while (list1 != null || list2 != null) {
            if(list1.val < list2.val) {
                cur = list1;
                list1 = list1.next;
                cur = cur.next;
            } else {
                cur = list2;
                list2 = list2.next;
                cur = cur.next;
            }
        }
        return head;
    }
}