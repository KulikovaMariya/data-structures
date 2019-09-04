package lesson4.linkedList;

public interface TwoSideLinkedList<E> extends LinkedList<E> {

    void insertLast(E value);

    E getLastValue();

}
