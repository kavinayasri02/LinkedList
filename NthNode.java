class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class NthNode {
    Node head;
    void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;}
            Node temp = head;
            while(temp.next!= null){
                temp = temp.next;}
                temp.next = newNode;}
                void findNthNodeFromEnd(int n){
                    Node first= head;
                    Node second = head;
                    for(int i =0;i<n;i++){
                        if(first == null){
                            System.out.println("List is smaller than n");
                            return;
                        }
                        first = first.next;
                    }
                    while(first != null){
                    first = first.next;
                    second = second.next;
                    }
                        System.out.println("NthNode from End:" + second.data);
                    }
                    public static void main(String[] args) {
                       NthNode list = new NthNode();
                       list.insert(10);
                       list.insert(20);
                       list.insert(30);
                       list.insert(40);
                       list.insert(50);
                       list.findNthNodeFromEnd(2);
                    }
}