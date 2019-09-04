package lesson4.linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleLinkedListTest {


    private SimpleLinkedList<Integer> linkedList;


    private void preparation() {
        linkedList = new SimpleLinkedList<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
    }

    @Test
    void insertFirst() {
        preparation();
        Integer expected = 5;
        linkedList.insertFirst(expected);
        assertEquals(true, linkedList.contains(5));

    }

    @Test
    void removeFirst() {
        preparation();
        linkedList.removeFirst();
        assertEquals(false, linkedList.contains(4));

    }

    @Test
    void remove() {
        preparation();
        linkedList.remove(2);
        assertEquals(false, linkedList.contains(2));
    }

    @Test
    void contains() {
        preparation();
        assertEquals(true, linkedList.contains(1));
        assertEquals(true, linkedList.contains(2));
        assertEquals(true, linkedList.contains(3));
        assertEquals(true, linkedList.contains(4));
    }

    @Test
    void size() {
        preparation();
        int current = linkedList.size();
        assertEquals(4, current);
    }

    @Test
    void isEmpty() {
        preparation();
        assertEquals(false, linkedList.isEmpty());
    }
}