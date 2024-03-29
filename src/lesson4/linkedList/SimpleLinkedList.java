package lesson4.linkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleLinkedList<E> implements LinkedList<E> {

    protected Entry<E> firstElement;
    protected int size;

    @Override
    public void insertFirst(E value) {
        Entry<E> entry = new Entry<>(value);
        entry.next = firstElement;
        firstElement = entry;
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E value = firstElement.value;
        firstElement = firstElement.next;
        size--;
        return null;
    }

    @Override
    public boolean remove(E value) {
        Entry<E> previous = null;
        Entry<E> current = firstElement;
        while (current != null) {
            if (current.value.equals(value)) {
                break;
            }
            previous = current;
            current = current.next;
        }
        if(current == null) {
            return false;
        }
        if (current == firstElement) {
            firstElement = current.next;
        }
        else {
            previous.next = current.next;
        }
        size--;
        return true;
    }

    @Override
    public boolean contains(E value) {
        Entry<E> current = firstElement;
        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public void display() {
        System.out.println("-------------");
        Entry<E> current = firstElement;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println("-------------");
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return firstElement == null;
    }

    @Override
    public E getFirstValue() {
        return firstElement != null ? firstElement.value : null;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<E> {
        Entry<E> nextEntry = firstElement;

        @Override
        public boolean hasNext() {
            return nextEntry != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException("end of the list reached");
            }
            Entry<E> temp = nextEntry;
            nextEntry = nextEntry.next;
            return temp.value;
        }
    }
}
