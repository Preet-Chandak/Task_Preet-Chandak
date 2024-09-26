package structural;

import java.util.ArrayList;
import java.util.List;

// Component interface
interface Component {
    void operation();
}

// Leaf class
class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Leaf: " + name);
    }
}

// Composite class
class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void operation() {
        for (Component child : children) {
            child.operation();
        }
    }
}

// Example of use
public class CompositePattern {
    public static void main(String[] args) {
        Composite composite = new Composite();
        composite.add(new Leaf("Leaf 1"));
        composite.add(new Leaf("Leaf 2"));

        composite.operation();
    }
}
