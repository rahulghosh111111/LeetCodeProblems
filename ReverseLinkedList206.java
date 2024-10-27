class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class ReverseLinkedList206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // Store the next node
            curr.next = prev;          // Reverse the current node's pointer
            prev = curr;              // Move prev and curr one step forward
            curr = next;
        }

        return prev; // New head of the reversed list
    }

    public static void main(String[] args) {
        ReverseLinkedList206 p = new ReverseLinkedList206();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = p.reverseList(head);
        while (result != null) {
            System.out.print(result.val+" ");
            result = result.next;
        }
    }
}