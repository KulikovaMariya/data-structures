package lesson3.queue;

import base.ICollection;

public interface Queue<E> extends ICollection {

    boolean insertR(E value);

    E removeL();

    E peek();


}
