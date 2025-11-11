package LinkedList;

public class testLinkedList {
    public static void main(String[] args) {
        singleLinkedList list = new singleLinkedList();
        list.insertHead(10);
        list.insertHead(20);
        list.insertTail(30);
        list.insert(50, 2);
        list.traverse();
        list.delete(20);
        System.out.println();
        list.traverse();
    }
}
