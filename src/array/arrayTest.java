package array;

public class arrayTest {
    public static void main(String[] args) {
        arrayClass a = new arrayClass(10);
        a.append(10);
        a.append(20);
        a.append(30);
        a.traverse();
        a.search(20);
        a.search(100);
        a.insert(1, 100);
        a.traverse();
        a.delete();
        a.traverse();
        a.append(50);
        a.delete(0);
        a.traverse();
        a.enlargeArray(15);
    }
}
