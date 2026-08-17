class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DetectLoop {
    Node head = null;
    void insert(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;}
            temp.next = newNode;
        }
        boolean DetectLoop(){
            Node slow = head;
            Node fast = head;
            while(fast!= null&& fast.next!= null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    return true;}}
                    return false;
                }
                public static void main(String[] args) {
                    DetectLoop list = new DetectLoop();
                    list.insert(10);
                     list.insert(20);
                      list.insert(30);
                       list.insert(40);
                       list.head.next.next.next.next = list.head.next;
                       if(list.DetectLoop()){
                        System.err.println("Loop detected in the LinkedList");}
                        else{
                            System.out.println("No loop in the LinkedList");
                        }
                       }
                }