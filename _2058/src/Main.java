import java.util.ArrayList;

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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        ListNode ptr = head;
        if(ptr.next.next == null) return new int[]{-1, -1};
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        list.add(count);
        while (ptr.next.next != null) {
            if((ptr.val < ptr.next.val && ptr.next.val > ptr.next.next.val) || (ptr.val > ptr.next.val && ptr.next.val < ptr.next.next.val) ) {
                list.add(count);
            }
            count++;
        }
        list.sort((a,b) -> a - b);
        return new int[]{list.get(1) - list.get(0), list.get(list.size()-1) - list.get(0)};
    }
}