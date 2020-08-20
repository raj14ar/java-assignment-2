public class ReverseLL {
    public static Node<Integer> reverseLL(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> reversedHead=head.next;
        Node<Integer> smallAns =reverseLL(head.next);
        reversedHead.next=head;
        head.next=null;
        return smallAns;
    }

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node5 = new Node<>(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        Node<Integer> head = node1;
        Node<Integer> ans = reverseLL(head);
        Node<Integer> temp=ans;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }

}
