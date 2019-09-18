package lesson7;

public class Vertex {

    private final String label;
    private boolean visited;
    private Vertex previous = null;

    public Vertex(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Vertex{" + "label='" + label + '\'' + "}";
    }

    public String getLabel() {
        return label;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setPrevious(Vertex previous) {
        this.previous = previous;
    }

    public Vertex getPrevious() {
        return previous;
    }
}
