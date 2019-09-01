package lesson3.queue;

public class DequeImpl<E> extends QueueImpl<E> implements Deque<E> {

    public DequeImpl(int maxCapacity) {
        super(maxCapacity);
    }
//
//    @Override
//    public boolean insertR(E value) {
//        if (isFull()) {
//            return false;
//        }
//        if (tail == lastIndex()) {
//            tail = DEFAULT_TAIL;
//        }
//        data[++tail] = value;
//        size++;
//        return true;
//    }


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

//    @Override
//    public E removeL() {
//        if (isEmpty()) {
//            return null;
//        }
//        if (head == data.length) {
//            head = DEFAULT_HEAD;
//        }
//        E value = data[head++];
//        size--;
//        return value;
//    }
}
