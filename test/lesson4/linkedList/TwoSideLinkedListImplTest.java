package lesson4.linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSideLinkedListImplTest {

    private TwoSideLinkedList<Integer> twoSideLinkedList;

    private void preparation() {
        twoSideLinkedList = new TwoSideLinkedListImpl<>();
        twoSideLinkedList.insertFirst(1);
        twoSideLinkedList.insertFirst(2);
        twoSideLinkedList.insertFirst(3);
        twoSideLinkedList.insertFirst(4);
    }

    @Test
    void insertLast() {
        preparation();
        twoSideLinkedList.insertLast(5);
        twoSideLinkedList.display();
        assertEquals(5, twoSideLinkedList.getLastValue().intValue());
    }

    @Test
    void insertFirst() {
        preparation();
        twoSideLinkedList.insertFirst(5);
        assertEquals(5, twoSideLinkedList.getFirstValue().intValue());
    }

    @Test
    void removeFirst() {
        preparation();
        twoSideLinkedList.removeFirst();
        assertEquals(3, twoSideLinkedList.getFirstValue().intValue());

    }

    @Test
    void remove() {
        preparation();
        twoSideLinkedList.remove(2);
        assertEquals(false, twoSideLinkedList.contains(2));
    }
}