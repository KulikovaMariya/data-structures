package lesson3.queue;

public class QueueImpl<E> implements Queue<E> {

    protected static final int DEFAULT_HEAD = 0;
    protected static final int DEFAULT_TAIL = -1;

    protected final E[] data;
    protected int size;

    protected int head;
    protected int tail;

    @SuppressWarnings("unchecked")
    public QueueImpl(int maxCapacity) {
        this.data = (E[]) new Object[maxCapacity];
        this.head = DEFAULT_HEAD;
        this.tail = DEFAULT_TAIL;
    }

    @Override
    public boolean insertR(E value) {
        if (isFull()) {
            return false;
        }
        if (tail == lastIndex()) {
            tail = DEFAULT_TAIL;
        }
        data[++tail] = value;
        size++;
        return true;
    }

    protected int lastIndex() {
        return data.length - 1;
    }

    @Override
    public E removeL() {
        if (isEmpty()) {
            return null;
        }
        if (head == data.length) {
            head = DEFAULT_HEAD;
        }
        E value = data[head++];
        size--;
        return value;
    }

    @Override
    public E peek() {
        return isEmpty() ? null : data[head];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }
}
