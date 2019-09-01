package lesson2;

import base.ICollection;

public interface Array<E> extends ICollection {

    void add(E value);

    default void addAll(E... values) {
        for (E value : values) {
            add(value);
        }
    }

    void addAll(Array<E> array);

    boolean remove(E value);

    boolean remove(int index);

    E get(int index);

    int indexOf(E value);

    boolean contains(E value);

    void sortBubble();

    void sortSelect();

    void sortInsert();
}
