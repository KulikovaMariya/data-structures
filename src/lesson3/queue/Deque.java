package lesson3.queue;

public interface Deque<E> extends Queue<E> {

    boolean insertL(E value);

    E removeR();

}
