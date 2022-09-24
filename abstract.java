abstract class LinkedList {
    public abstract void add_first(String data);
    public abstract void add_last(String data);
    public abstract void printlist();
    }
    class SinglyLinkedList  extends LinkedList{
        Node head;
        Node tail;
        class Node{
            String data;
            Node next;
    
            Node(String data){
                this.data=data;
                this.next=null;
            }
        }
    public void add_first(String data) {
        Node  temp = new Node(data);
        if ( head ==null) {
          head=temp;
          return;
      }
      temp.next=head;
      head=temp;
    }
    public void add_last(String data) {
        Node  temp = new Node(data);
        if ( head ==null) {
          head= temp;
          return;
        }
        Node currNode =head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        temp.next=temp;
    }
    public void printlist() {
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode =head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
    }
}
class DoublyLinkedList extends LinkedList{
    Node head;
    class Node{
        String data;
        Node next;
        Node prev;
        Node(String data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }


 public void add_first(String data) {
    Node  temp = new Node(data);
    if ( head ==null) {
      head=temp;
      return;
  }
  temp.next=head;
  if (head!=null) {
    head.prev=temp;
  }
  head=temp;
}

public void add_last(String data) {
    Node  temp = new Node(data);
    if ( head ==null) {
      head= temp;
      return;
    }
    Node currNode =head;
    while(currNode.next != null){
        currNode=currNode.next;
    }
    currNode.next=temp;
    temp.prev=currNode;
}
public void printlist() {
    if(head==null){
        System.out.println("list is empty");
        return;
    }
    Node currNode =head;
    while(currNode != null){
        System.out.print(currNode.data+"->");
        currNode=currNode.next;
    }
}
}
class HelloWorld {
    public static void main(String[] args) {
    
    
    LinkedList sl;
    LinkedList dl;
    
    sl = new SinglyLinkedList();
    dl = new DoublyLinkedList();  
    sl.add_first(" 2");
    sl.add_first("1");
    sl.printlist();
    dl.add_last( "3");
    // System.out.println("");
    // System.out.println("==========================");
    
    // dl.addAtBeginning(5);
    // dl.addAtBeginning(4);
    // dl.addAtBeginning(3);
    // dl.print();
    
    
    
    }
    }