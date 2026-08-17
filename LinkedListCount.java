class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class LinkedListCount{
    Node head;
    void insertEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;}
            Node temp = head;
            while(temp.next!= null){
                temp = temp.next;}
                temp.next = newNode;}

                int countNodes(){
                    Node temp = head;
                    int count = 0;
                    while(temp!=null){
                        count++;
                        temp = temp.next;}
                        return count;}


                        void display(){
                            Node temp = head;
                        }
               