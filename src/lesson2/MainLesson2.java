package lesson2;

import java.util.Arrays;

public class MainLesson2 {

    private static final int SIZE = 100_000;

    public static void main(String[] args) {

        Array<Integer> array = new ArrayImpl<>(SIZE);

        for (int i = 0; i < SIZE; i++) {
            array.add((int) (Math.random() * SIZE * 100));
        }

        Array<Integer> array2 = new ArrayImpl<>(SIZE);
        System.out.println("array2.addAll(array) started");
        array2.addAll(array);

        Array<Integer> array3 = new ArrayImpl<>(SIZE);
        System.out.println("array3.addAll(array) started");
        array3.addAll(array);

        long startTime = System.nanoTime();
        System.out.println("array.sortBubble() started");
        array.sortBubble();
        long estimatedTime = System.nanoTime() - startTime;

        long startTime2 = System.nanoTime();
        System.out.println("array2.sortInsert() started");
        array2.sortInsert();
        long estimatedTime2 = System.nanoTime() - startTime;

        long startTime3 = System.nanoTime();
        System.out.println("array3.sortSelect() started");
        array3.sortSelect();
        long estimatedTime3 = System.nanoTime() - startTime;

        System.out.println("sortBubble() " + estimatedTime);
        System.out.println("sortInsert() " + estimatedTime2);
        System.out.println("sortSelect() " + estimatedTime3);

    }
}
