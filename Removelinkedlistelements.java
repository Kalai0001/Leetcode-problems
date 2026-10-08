class ListNode{
    int data;
    ListNode next;

    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class Removelinkedlistelements {
    
    static  ListNode removeelements(ListNode head,int val){

        ListNode current = head;

        while (current != null) {
            if(head != null && head.data == val){
                head = head.next;
                current = head;
            }
            else if(current.next != null && current.next.data == val){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }

        return head;
    }
    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);

        int val = 6;

        ListNode result = removeelements(head, val);

        ListNode current = result;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
