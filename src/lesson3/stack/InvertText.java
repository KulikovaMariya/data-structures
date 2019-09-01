package lesson3.stack;

import lesson3.queue.Deque;
import lesson3.queue.DequeImpl;
import lesson3.queue.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InvertText {

    private String text;

    public InvertText() {
    }

    public static void main(String[] args) {
        InvertText invertText = new InvertText();
        invertText.setText();
        invertText.turnOverDeque();
    }

    public void turnOver() {
        Stack<Character> stack = new StackImpl<>(text.length());
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }
        for (int i = 0; i < text.length(); i++) {
            System.out.print(stack.pop());
        }
    }

    public void setText() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            this.text = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void turnOverDeque() {
        Deque<Character> deque = new DequeImpl<>(text.length());
        for (int i = 0; i < text.length(); i++) {
            deque.insertR(text.charAt(i));
        }
        for (int i = 0; i < text.length(); i++) {
            System.out.print(deque.removeR());
        }
    }
}
