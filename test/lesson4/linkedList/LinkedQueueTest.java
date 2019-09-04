package lesson4.linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedQueueTest {

    private LinkedQueue<Integer> linkedQueue;

    private void preparation() {
        linkedQueue = new LinkedQueue<>();
        linkedQueue.insertR(1);
        linkedQueue.insertR(2);
        linkedQueue.insertR(3);
        linkedQueue.insertR(4);
    }

    @Test
    void insertR() {
        preparation();
        linkedQueue.insertR(5);
        assertEquals(5, linkedQueue.getLastValue().intValue());
    }

    @Test
    void removeL() {
        preparation();
        linkedQueue.removeL();
        assertEquals(2, linkedQueue.peek().intValue());
    }

    @Test
    void peek() {
        preparation();
        assertEquals(1, linkedQueue.peek().intValue());
    }

    @Test
    void size() {
        preparation();
        assertEquals(4, linkedQueue.size());
    }

    @Test
    void isEmpty() {
        preparation();
        assertEquals(false, linkedQueue.isEmpty());
    }
}