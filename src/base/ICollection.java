package base;

import java.io.RandomAccessFile;

public interface ICollection {

    int size();

    boolean isEmpty();

    default boolean isFull() {
        return false;
    }
}
