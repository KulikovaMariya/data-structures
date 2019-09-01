package lesson2;

public class SortedArrayImpl<E extends Object & Comparable<? super E>> extends ArrayImpl<E> {

    @Override
    public void add(E value) {
        checkGrow();
        int index;
        for (index = 0; index < size(); index++) {
            if (data[index].compareTo(value) > 0) {
                break;
            }
        }
        for (int i = size(); i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        size++;
    }

    @Override
    public int indexOf(E value) {
        int low = 0;
        int hight = size - 1;
        while (low <= hight) {
            int mid =  (low + hight) / 2;
            if (data[mid].equals(value)) {
                return mid;
            }
            else if (data[mid].compareTo(value) > 0) {
                hight = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
