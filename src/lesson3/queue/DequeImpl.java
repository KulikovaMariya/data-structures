package lesson3.queue;

public class DequeImpl<E> extends QueueImpl<E> implements Deque<E> {

    public DequeImpl(int maxCapacity) {
        super(maxCapacity);
    }

    public boolean insertL(E value) {
       if (isFull()) {
           return false;
       }
       if (head == DEFAULT_HEAD) {
           head = data.length;
       }
       data[--head] = value;
       size++;
       return true;
    }

    @Override
    public E removeR() {
        if (isEmpty()) {
            return null;
        }
        if (tail == DEFAULT_TAIL) {
            tail = lastIndex();
        }
        E value = data[tail--];
        size--;
        return value;
    }
}
