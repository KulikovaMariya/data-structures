package lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayImplTest {

    @Test
    void add() {
       Array<String> arr = new ArrayImpl<>(1);
        arr.add("food");
        assertEquals("food", arr.get(0));
        assertEquals(1, arr.size());
        arr.add("beverage");
        assertEquals("beverage", arr.get(1));
        assertEquals(2, arr.size());
    }

    @Test
    void remove() {
        Array<String> arr = new ArrayImpl<>(3);
        arr.add("food");
        arr.add("beverage");
        arr.add("lll");
        boolean actual = arr.remove("beverage");
        assertTrue(actual);
        assertEquals("food", arr.get(0));
        assertEquals("lll", arr.get(1));
        assertNull(arr.get(2));
        actual = arr.remove("vbjhv");
        assertFalse(actual);
    }

    @Test
    void remove1() {

    }

    @Test
    void get() {
        Array<String> arr = new ArrayImpl<>(3);
        arr.add("food");
        assertEquals(null, arr.get(1));
        assertEquals("food", arr.get(0));
    }

    @Test
    void indexOf() {
        Array<String> arr = new ArrayImpl<>(3);
        arr.add("food");
        arr.add("beverage");
        arr.add("lll");
        assertEquals(-1, arr.indexOf(null));
        assertEquals(-1, arr.indexOf("111"));
        assertEquals(0, arr.indexOf("food"));
    }

    @Test
    void size() {

    }

    @Test
    void isEmpty() {
        Array<String> arr = new ArrayImpl<>();
        assertTrue(arr.isEmpty());
        arr.add("food");
        assertFalse(arr.isEmpty());
    }

    @Test
    void contains() {
        Array<String> arr = new ArrayImpl<>(3);
        arr.add("food");
        arr.add("beverage");
        arr.add("lll");
        assertTrue(arr.contains("food"));
        assertFalse(arr.contains("111"));
    }

    @Test
    void checkGrow() {
    }

    @Test
    void sortBubble() {
        Array<Integer> arr = new ArrayImpl<>();
        arr.add(5);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        arr.add(1);
        arr.sortBubble();
        assertEquals(1, arr.get(0).intValue());
        assertEquals(2, arr.get(1).intValue());
        assertEquals(3, arr.get(2).intValue());
        assertEquals(4, arr.get(3).intValue());
        assertEquals(5, arr.get(4).intValue());
    }

    @Test
    void sortSelect() {
        Array<Integer> arr = new ArrayImpl<>();
        arr.add(5);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        arr.add(1);
        arr.sortSelect();
        assertEquals(1, arr.get(0).intValue());
        assertEquals(2, arr.get(1).intValue());
        assertEquals(3, arr.get(2).intValue());
        assertEquals(4, arr.get(3).intValue());
        assertEquals(5, arr.get(4).intValue());
    }

    @Test
    void sortInsert() {
        Array<Integer> arr = new ArrayImpl<>();
        arr.add(5);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        arr.add(1);
        arr.sortInsert();
        assertEquals(1, arr.get(0).intValue());
        assertEquals(2, arr.get(1).intValue());
        assertEquals(3, arr.get(2).intValue());
        assertEquals(4, arr.get(3).intValue());
        assertEquals(5, arr.get(4).intValue());
    }
}