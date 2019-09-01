package lesson3.queue;

public class PriorityQueueImpl<E extends Object & Comparable<? super E>> extends QueueImpl<E> {

    public PriorityQueueImpl(int maxCapacity) {
        super(maxCapacity);
    }

    @Override
    public boolean insertR(E value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            data[size++] = value;
            return true;
        }
        int index;
        for (index = size - 1; index >= 0; index--) {
            if (value.compareTo(data[index]) > 0) {
                data[index + 1] = data[index];
            }
            else {
                break;
            }
        }
        data[index + 1] = value;
        size++;
        return true;
    }

    @Override
    public E removeL() {
        return isEmpty() ? null : data[--size];
    }

    @Override
    public E peek() {
        return isEmpty() ? null : data[--size];
    }
}
