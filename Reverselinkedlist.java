class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Reverselinkedlist{

    static Node reverselist(Node head){

        Node prev = null;
        Node current = head;

        while(current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Node ans = reverselist(head);

        while(ans != null){
            System.out.print(ans.data + " ");
            ans = ans.next;
        }
      
    }
}