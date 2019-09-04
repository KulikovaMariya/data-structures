package lesson4.linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedStackImplTest {

    private final static int SIZE = 4;

    private LinkedStackImpl<Integer> linkedStack;

    private void preparation() {
        linkedStack = new  LinkedStackImpl<>();
        for (int i = 0; i < SIZE; i++) {
            linkedStack.push(i);
        }
    }

    @Test
    void push() {
        preparation();
        linkedStack.push(5);
        assertEquals(5, linkedStack.peek().intValue());
    }

    @Test
    void pop() {
        preparation();
        linkedStack.pop();
        assertEquals(3, linkedStack.peek().intValue());
    }

    @Test
    void peek() {
        preparation();
        assertEquals(4, linkedStack.peek().intValue());
    }

    @Test
    void size() {
        preparation();
        assertEquals(SIZE, linkedStack.size());
    }

    @Test
    void isEmpty() {
        preparation();
        assertEquals(false, linkedStack.isEmpty());
    }
}