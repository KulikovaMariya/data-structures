package lesson5;

import java.util.HashSet;
import java.util.Set;

public class Anagramm {

    public static void main(String[] args) {
//        new Anagramm("жопа").getAnagramm();
        System.out.println(exponentiation(2,2));
    }


    private char[] word;
    private Set<String> result = new HashSet<>();

    public Anagramm(String word) {
        this.word = word.toCharArray();
    }

    public void getAnagramm() {
        if (word.length < 2) {
            System.out.println(String.valueOf(word));
        }
        getAnagramm(word.length);
        for (String anagramm : result) {
            System.out.println(anagramm);
        }
    }

    private void getAnagramm(int length) {
        if (length == 1) {
            return;
        }
        for (int i = 0; i < length; i++) {
            getAnagramm(length - 1);
            result.add(String.valueOf(word));
            rotate(length);
        }
    }

    private void rotate(int length) {
        int pos = word.length - length;
        char temp = word[pos];

        for (int i = pos + 1; i < word.length; i++) {
            word[i - 1] = word[i];
        }
        word[word.length - 1] = temp;
    }

    public static int exponentiation(int number, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("positive exponent required");
        }
        if (exponent == 0) {
            return 1;
        }
        return exponentiation(number, exponent - 1) * number;
    }
}
