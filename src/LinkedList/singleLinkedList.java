package LinkedList;

class Node{
    int item;
    Node next;

}
public class singleLinkedList {
    Node head;
    Node tail;
    int length;

    public singleLinkedList() {
        head = null;
        tail=null;
        length=0;
    }
    boolean isEmpty(){
        return (length==0);        
    }
    void insertHead(int item){
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = head;
        head = newNode;
        if(isEmpty()){
            tail = newNode;
        }
        length++;
    }
    void insertTail(int item){
        Node newNode = new Node();
        newNode.item = item;
        newNode.next =null;
        tail.next = newNode;
        tail = newNode;
        if(isEmpty()){
            head = newNode;
        }
        length++;
    }
    void traverse(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.item+" ");
            temp = temp.next;
        }
    }
    void insert(int item,int pos){
        if(pos<0||pos>length){return;}
        if(pos==0){insertHead(item);}
        if(pos==length){insertTail(item);}
        else{
        Node newNode = new Node();
        newNode.item = item;
        Node current = head;
        for(int i=0;i<(pos-1);i++){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        length++;}
    }
    void delete(int item){
        if(isEmpty())return;
        if(head.item==item){
            head = head.next;
            if(head == null){tail = null;}
        length--;
        return;
        }
        Node current = head;
        while(current.next!=null&&current.next.item!=item){
            current =current.next;
        }
        if(current.next==null){System.out.println();
            System.out.print("Item not found!");
    return;}
    else if(current.next.item==item){
        if(current.next==tail){
        tail=current;}
        current.next=current.next.next;
    }
    length--;
}
}
