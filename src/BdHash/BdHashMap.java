package BdHash;

public class BdHashMap <K, V> {
    private Node<K, V> head;
    public BdHashMap() {
        head = null;
    }
    public boolean isEmpty() {
        return head == null;
    }

}
