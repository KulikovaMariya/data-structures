package lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedArrayImplTest {

    @Test
    void add() {
       Array<Integer> arr = new SortedArrayImpl<>();
        arr.add(5);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        arr.add(1);
        assertEquals(1, arr.get(0).intValue());
        assertEquals(2, arr.get(1).intValue());
        assertEquals(3, arr.get(2).intValue());
        assertEquals(4, arr.get(3).intValue());
        assertEquals(5, arr.get(4).intValue());
    }

    @Test
    void indexOf() {
        Array<Integer> arr = new SortedArrayImpl<>();
        arr.add(5);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        arr.add(1);
        assertEquals(0, arr.indexOf(1));
        assertEquals(1, arr.indexOf(2));
        assertEquals(2, arr.indexOf(3));
        assertEquals(3, arr.indexOf(4));
        assertEquals(4, arr.indexOf(5));
    }
}