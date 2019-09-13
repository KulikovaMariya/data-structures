package lesson6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeImplTest {

    private TreeImpl<Integer> tree;


    public void preparation() {
        tree = new TreeImpl<>();
        tree.add(60);
        tree.add(50);
        tree.add(66);
        tree.add(40);
        tree.add(55);
        tree.add(70);
        tree.add(21);
        tree.add(45);
        tree.add(57);
        tree.add(67);
        tree.add(81);
        tree.display();

    }

    @Test
    void add() {
        preparation();
        tree.add(19);
        tree.display();
        assertFalse(tree.find(19));
    }

    @Test
    void remove() {
    }

    @Test
    void isBalanced() {
        preparation();
        assertFalse(tree.isBalanced(tree.getRoot()));
    }

    @Test
    void height() {
        preparation();
        assertEquals(4, tree.height(tree.getRoot()));
    }
}