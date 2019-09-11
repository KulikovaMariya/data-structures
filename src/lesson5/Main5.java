package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {

    public static void main(String[] args) {
//        System.out.println(isExp(12));
//        System.out.println(sum(4356));
//        System.out.println(sumRec(4356));
//        print2(4);
//        print3(1, 5);
//        oddNum();
//        oddNum2();
//        System.out.println(findMax());
//        average2(0, 0);
//        int[] maxCount = findMaxCount();
//        System.out.println(maxCount[0] + " " + maxCount[1]);
    }


    public static String isExp(int n) {
        if (n == 2) {
            return "YES";
        }
        if (n % 2 != 0) {
            return "NO";
        }
        return isExp(n / 2);
    }

    public static int sum(int n) {
        int result = 0;
        while (n > 10) {
            result = result + n % 10;
            n = n / 10;
        }
        result = result + n;
        return result;
    }

    public static int sumRec(int n) {
        if (n < 10) {
            return n;
        }
        return sumRec(n / 10) + n % 10;
    }

    public static void print(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }
        print(n / 10);
        System.out.println(n % 10);
    }

    public static void print2(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        print2(n - 1);
        System.out.println(n);
    }

    public static void print3(int a, int b) {
        if (a == b) {
            System.out.println(a);
            return;
        }
        if (a < b) {
            System.out.println(a);
            print3(a + 1, b);
        }
        if (a > b) {
            System.out.println(a);
            print3(a - 1, b);
        }
    }

    public static void oddNum() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (n == 0) {
            return;
        }
        if (n % 2 != 0) {
            System.out.println(n);
        }
        oddNum();
    }

    public static void oddNum2() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (n == 0) {
            return;
        }
        if (n % 2 != 0) {
            System.out.println(n);
        }
        oddNum2();
    }

    public static int findMax() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (n == 0) {
            return 0;
        }
        int maxForNextNumbers = findMax();
        if (n > maxForNextNumbers) {
            return n;
        }
        return maxForNextNumbers;
    }

    public static void average2(int sum, int count) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (n > 0) {
            average2(sum + n, ++count);
        } else if (sum > 0 && count > 0) {
            System.out.println(sum / count);;
        }
    }

    public static int[] findMaxCount() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] maxForNextElement;
        if (n == 0) {
            maxForNextElement = new int[2];
            maxForNextElement[0] = 0;
            maxForNextElement[1] = 1;
            return maxForNextElement;
        }

        maxForNextElement = findMaxCount();
        if (n > maxForNextElement[0]) {
            maxForNextElement[0] = n;
            maxForNextElement[1] = 1;
            return maxForNextElement;
        } else if (n == maxForNextElement[0]) {
            maxForNextElement[1] = maxForNextElement[1] + 1;
            return maxForNextElement;
        } else {
            return maxForNextElement;
        }
    }
}
