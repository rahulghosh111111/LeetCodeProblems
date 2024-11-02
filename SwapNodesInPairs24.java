public class SwapNodesInPairs24 {
    public ListNode swapPairs(ListNode head) {
        // Base case: if the list is empty or has only one node, return the head
        if (head == null || head.next == null) {
            return head;
        }

        // Initialize a new dummy node to simplify the swapping logic
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (head != null && head.next != null) {
            // Identify the two nodes to swap
            ListNode firstNode = head;
            ListNode secondNode = head.next;

            // Perform the swapping
            prev.next = secondNode; // Link previous pair to the second node
            firstNode.next = secondNode.next; // Link first node to the next pair
            secondNode.next = firstNode; // Complete the swap

            // Move to the next pair
            prev = firstNode;
            head = firstNode.next;
        }

        // Return the new head of the swapped list
        return dummy.next;
    }

    public static void main(String[] args) {
        SwapNodesInPairs24 p = new SwapNodesInPairs24();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode result = p.swapPairs(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
