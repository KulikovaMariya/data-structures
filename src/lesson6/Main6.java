package lesson6;

import java.util.ArrayList;
import java.util.List;

public class Main6 {

    public final static int TREE_COUNT = 20;

    public static void main(String[] args) {

        List<TreeImpl<Integer>> trees = new ArrayList<>();

        int balancedTree = 0, notBalancedTree = 0;

        for (int i = 0; i < TREE_COUNT; i++) {
            trees.add(createTreeWithRundomNumbers());
            trees.get(i).display();
            if (trees.get(i).isBalanced(trees.get(i).getRoot())) {
                balancedTree++;
            } else {
                notBalancedTree--;
            }
        }

        System.out.println(5 * balancedTree + " % of trees is balanced. " + balancedTree + " from 20 trees.");
    }

    public static TreeImpl<Integer> createTreeWithRundomNumbers() {
        TreeImpl<Integer> tree = new TreeImpl<>();
        for (int i = 0; i < 15; i++) {
            tree.add((int) (Math.random() * 41) - 20);
        }
        return tree;
    }
}
