package BdHash;

public class BdHashMap <K, V> {
    private Node<K, V> head;
    public BdHashMap() {
        head = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void add(K key, V value) {
        Node<K, V> node = new Node<>();
        node.key = key;
        node.value = value;
        if(head == null) {
            head = node;
            return;
        }
        Node<K, V> temp = head;
        for(; temp.next != null;) {
            temp = temp.next;
        }
        temp.next = node;
    }
    public void remove(int index) {
        Node<K, V> temp = head;
        Node<K, V> back = head;
        if(index == 0) {
            head = temp.next;
            temp = null;
            return;
        }
        while(index-- != 0) {
            temp = temp.next;
            if(index == 0) {
                back.next = temp.next;
                temp = null;
                return;
            }
            back = back.next;
        }
    }
    public Data<K, V> index(int index) {
        Node<K, V> temp = head;
        Data<K, V> data = new Data<>();
        if(index == 0) {
            data.setKey(head.key);
            data.setValue(head.value);
            return data;
        }
        while ( index-- != 0) {
            temp = temp.next;
        }
        if(temp == null) {
            return data;
        } else {
            data.setKey(temp.key);
            data.setValue(temp.value);
            return data;
        }
    }
    public V get(K key) {
        Node<K, V> temp = head;
        while (temp != null) {
            if(temp.key.equals(key)) {
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }
    public int length() {
        if(head == null) {
            return 0;
        }
        Node<K, V> temp = head;
        int count = 1;
        while(temp.next != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
}
