package lesson6;

import base.ICollection;

public interface Tree<E> extends ICollection, Iterable<E>{

    enum TraverseMode{
        IN_ORDER,
        PRE_ORDER,
        POST_ORDER
    }

    boolean find(E value);

    boolean add(E valu);

    boolean remove(E value);

    void display();

    boolean isBalanced(Node Node);

    void traverse(TraverseMode mode);
}
