import java.util.ArrayList;
import java.util.List;

class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public static List<String> linkedListValues(Node<String> head) {
        Node<String> test = head;
        List myList = new ArrayList();
        myList.add(test);
        while (test.next!=null) {
            myList.add(test.next);
            test = test.next;
        }

        return myList;
    }

    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        a.next = b;
        b.next = c;
        c.next = d;

        // a -> b -> c -> d

        List myList = Solution.linkedListValues(a);
        // -> [ "a", "b", "c", "d" ]

        System.out.println(myList);

    }
}
