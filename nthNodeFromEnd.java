class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data=data;
        next=null;
    }
}

public class nthNodeFromEnd {
    public static int len (Node<Integer> node){
        int len=0;
        while(node!=null){
            len++;
            node=node.next;
        }
        return len;
    }
    public static Node<Integer> nthNodeFromEnd(Node<Integer> node, int n){
        int lengthFromStart = len(node)-n;
        while(lengthFromStart>0){
            node = node.next;
            lengthFromStart--;
        }
        return node;
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
        System.out.println(nthNodeFromEnd(head,2).data);

    }
}
