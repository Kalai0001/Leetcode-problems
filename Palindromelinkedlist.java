
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Palindromelinkedlist {

    public static boolean isPalindrome(ListNode head) {

        if (head == null) {
            return true;
        }

        // Step 1: Copy the original linked list
        ListNode original = new ListNode(head.val);
        ListNode copy = original;
        ListNode temp = head.next;

        while (temp != null) {
            copy.next = new ListNode(temp.val);
            copy = copy.next;
            temp = temp.next;
        }

        // Step 2: Reverse the original linked list
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        //check palindrome or not
        ListNode first = original;
        ListNode rev = prev;

        while (first != null && rev != null) {
            if (first.val != rev.val) {
                return false;
            }

            first = first.next;
            rev = rev.next;
        }

        return true;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println(isPalindrome(head));
    }
}