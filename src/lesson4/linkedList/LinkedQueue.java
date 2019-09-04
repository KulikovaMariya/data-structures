package lesson4.linkedList;

import lesson3.queue.Queue;

public class LinkedQueue<E> implements Queue<E> {

    private TwoSideLinkedList<E> data;

    public LinkedQueue() {
        this.data = new TwoSideLinkedListImpl<>();
    }

    @Override
    public boolean insertR(E value) {
        data.insertLast(value);
        return true;
    }

    @Override
    public E removeL() {
        return data.removeFirst();
    }

    @Override
    public E peek() {
        return data.getFirstValue();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    E getLastValue() {
        return data.getLastValue();
    }
}
