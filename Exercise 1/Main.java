import behavioral.*;
import creational.*;
import structural.*;

public class Main {
    public static void main(String[] args) {
        // Run Behavioral Patterns
        System.out.println("Observer Pattern:");
        ObserverPattern.main(args);

        System.out.println("\nStrategy Pattern:");
        StrategyPattern.main(args);

        // Run Creational Patterns
        System.out.println("\nFactory Pattern:");
        FactoryPattern.main(args);

        System.out.println("\nSingleton Pattern:");
        SingletonPattern.main(args);

        // Run Structural Patterns
        System.out.println("\nAdapter Pattern:");
        AdapterPattern.main(args);

        System.out.println("\nComposite Pattern:");
        CompositePattern.main(args);
    }
}
