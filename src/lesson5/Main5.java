package lesson5;

public class Main5 {

    public static void main(String[] args) {
        System.out.println(isExp(12));
    }

    public static String isExp(double n) {
        if (n / 2 == 1) {
            return "YES";
        }
        if (n % 2 != 0) {
            return "NO";
        }
        return isExp(n / 2);
    }
}
