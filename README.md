# Design Patterns Demo (Java)

This project demonstrates six different software design patterns implemented in Java. The patterns are categorized into behavioral, creational, and structural patterns, and each use case is implemented in a modular, maintainable, and easy-to-understand manner. The project adheres to best coding practices such as clean code organization, logging, error handling, and defensive programming.

## Design Patterns Covered

### 1. Behavioral Patterns

- **Observer Pattern**: Demonstrates a basic implementation where observers are notified when the subject changes its state.
- **Strategy Pattern**: Implements different strategies for performing operations like addition and subtraction, encapsulated in separate classes.

### 2. Creational Patterns

- **Factory Pattern**: Shows how to instantiate objects dynamically based on provided input.
- **Singleton Pattern**: Demonstrates a singleton pattern that ensures only one instance of a class exists.

### 3. Structural Patterns

- **Adapter Pattern**: Converts the interface of a class into another interface that clients expect.
- **Composite Pattern**: Allows clients to treat individual objects and compositions of objects uniformly.

## Project Structure

```
DesignPatternsDemo/
├── src/
│   ├── behavioral/
│   │   ├── ObserverPattern.java
│   │   ├── StrategyPattern.java
│   ├── creational/
│   │   ├── FactoryPattern.java
│   │   ├── SingletonPattern.java
│   ├── structural/
│   │   ├── AdapterPattern.java
│   │   ├── CompositePattern.java
│   ├── Main.java
│   ├── Logger.java
└── README.md
```

### File Descriptions:

- **Main.java**: The main entry point that runs all design pattern examples.
- **Logger.java**: A basic logging utility for logging info and errors throughout the project.
- **Behavioral Patterns**: Observer and Strategy patterns are located in the `behavioral` package.
- **Creational Patterns**: Factory and Singleton patterns are located in the `creational` package.
- **Structural Patterns**: Adapter and Composite patterns are located in the `structural` package.

## Prerequisites

Before you can run this project, make sure you have the following installed:

- **Java Development Kit (JDK)** (ensure both `java` and `javac` are available in your PATH)
- A terminal or command line to run the project.
