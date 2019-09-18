package lesson7;

import java.util.*;

public class Graph {
    private final List<Vertex> vertexList;
    private final boolean[][] adjMat;

    private int size;

    public Graph(int maxVertexCount) {
        this.vertexList = new ArrayList<>(maxVertexCount);
        this.adjMat = new boolean[maxVertexCount][maxVertexCount];
        this.size = 0;
    }

    public void addVertex(String label) {
        vertexList.add(new Vertex(label));
        size++;
    }

    public int getSize() {
        return size;
    }

    public void addEdges(String startLabel, String secondLabel, String... others) {
        addEdge(startLabel, secondLabel);
        for (String anotherLabel : others) {
            addEdge(startLabel, anotherLabel);
        }
    }

    public void addEdge(String startLabel, String finishLabel) {
        int startIndex = indexOf(startLabel);
        int finishIndex = indexOf(finishLabel);
        if (startIndex == -1 || finishIndex == -1) {
            throw new IllegalArgumentException(String.format("Invalid label for vertexes: %s; %s", startLabel, finishLabel));
        }
        adjMat[startIndex][finishIndex] = true;
        adjMat[finishIndex][startIndex] = true;
    }

    private int indexOf(String label) {
        for (int i = 0; i < vertexList.size(); i++) {
            if (vertexList.get(i).getLabel().equals(label)) {
                return i;
            }
        }
        return -1;
    }

    public void display() {
        for (int i = 0; i < vertexList.size(); i++) {
            System.out.print(vertexList.get(i));
            for (int j = 0; j < vertexList.size(); j++) {
                if (adjMat[i][j]) {
                    System.out.println(" -> " + vertexList.get(j));
                }
            }
            System.out.println();
        }
    }

    public void dfs(String startLabel) {
        int startIndex = indexOf(startLabel);
        if (startIndex == -1) {
            throw new IllegalArgumentException("Invalid startLabel: " + startLabel);
        }

        Stack<Vertex> stack = new Stack<>();

        Vertex vertex = vertexList.get(startIndex);
        visitVertex(stack, vertex);

        while(!stack.isEmpty()) {
            vertex = getNearUnvisitedVertex(stack.peek());
            if (vertex != null) {
                visitVertex(stack, vertex);
            } else {
                stack.pop();
            }
        }
    }

    public void bfs(String startLabel) {
        int startIndex = indexOf(startLabel);
        if (startIndex == -1) {
            throw new IllegalArgumentException("Invalid startLabel: " + startLabel);
        }

        Queue<Vertex> queue = new LinkedList<>();

        Vertex vertex = vertexList.get(startIndex);
        visitVertex(queue, vertex);

        while(!queue.isEmpty()) {
            vertex = getNearUnvisitedVertex(queue.peek());
            if (vertex != null) {
                visitVertex(queue, vertex);
            } else {
                queue.remove();
            }
        }
    }

    public void findShortWay(String startLabel, String finishLabel) {
        int startIndex = indexOf(startLabel);
        if (startIndex == -1) {
            throw new IllegalArgumentException("Invalid startLabel: " + startLabel);
        }

        Queue<Vertex> queue = new LinkedList<>();

        Vertex vertex = vertexList.get(startIndex);
        visitVertex(queue, vertex);

        while(!queue.isEmpty()) {
            vertex = getNearUnvisitedVertex(queue.peek());

            if (vertex != null) {
                visitVertex(queue, vertex);
                vertex.setPrevious(queue.peek());
                if (vertex.getLabel().equals(finishLabel)) {
                    printShortWay(vertex);
                    return;
                }
            } else {
                queue.remove();
            }
        }
    }

    private void printShortWay(Vertex vertex) {
        System.out.println("Short way:");
        String result = vertex.getLabel();
        while (vertex.getPrevious() != null) {
            result = vertex.getPrevious().getLabel() + " - " + result;
            vertex = vertex.getPrevious();
        }
        System.out.println(result);
    }

    private Vertex getNearUnvisitedVertex(Vertex peek) {
        int peekIndex = vertexList.indexOf(peek);
        for (int i = 0; i < size; i++) {
            if (adjMat[peekIndex][i] && !vertexList.get(i).isVisited()) {
                return vertexList.get(i);
            }
        }
        return null;
    }

    private void visitVertex(Stack<Vertex> stack, Vertex vertex) {
        System.out.println(vertex.getLabel());
        stack.push(vertex);
        vertex.setVisited(true);
    }

    private void visitVertex(Queue<Vertex> queue, Vertex vertex) {
        System.out.println(vertex.getLabel());
        queue.add(vertex);
        vertex.setVisited(true);
    }
}
