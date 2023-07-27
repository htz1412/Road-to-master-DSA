/*
 * Problem Link : https://leetcode.com/problems/linked-list-cycle/?envType=study-plan-v2&envId=top-interview-150
 */

import java.util.HashSet;

public class LinkedListCycle {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Write your code below...
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (!set.contains(head)) {
            if (head == null) return false;

            set.add(head);
            head = head.next;
        }

        return true;
    }

    // Slow-Fast pointer solution from solution tab.
    public boolean hasCycleOptimalSolution(ListNode head) {
        if (head == null)
            return false;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast)
                return true;
        }

        return false;
    }
}
