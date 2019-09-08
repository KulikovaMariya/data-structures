package lesson5;

public class Main5 {

    public static void main(String[] args) {
//        System.out.println(isExp(12));
//        System.out.println(sum(4356));
//        System.out.println(sumRec(4356));
//        print2(4);
        print3(1, 5);
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
}
