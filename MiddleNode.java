class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class MiddleNode {
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
                void findMiddleNode(){
                    Node slow = head;
                    Node fast = head;
                    while(fast!= null && fast.next!=null){
                        slow = slow.next;
                        fast = fast.next.next;}
                        System.out.println("Middle Node:" + slow.data);
                    }
                    public static void main(String[] args) {
                       MiddleNode list = new MiddleNode();
                       list.insert(10);
                       list.insert(20);
                       list.insert(30);
                       list.insert(40);
                       list.insert(50);
                       list.findMiddleNode();
                    }
}