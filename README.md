# Java Lombok Demo Project

A practical demonstration of Project Lombok's capabilities with custom validation logic.

## Project Overview

This project features:
- A `Person` class with Lombok annotations and custom validation
- A `Main` class demonstrating usage patterns
- Example of proper getter/setter generation with custom logic

## Classes

### Person.java

A model class showcasing Lombok's code reduction capabilities with added validation.

#### Key Features:
- **Lombok Annotations**:
  - `@Getter`: Auto-generates all getter methods
  - `@ToString`: Creates a comprehensive `toString()` implementation
  - `@AllArgsConstructor`: Generates a full-parameter constructor
  - `@NoArgsConstructor`: Provides a no-args constructor
  - `@NonNull`: Enforces null checks

## Setup Instructions

### Add Lombok Dependency: Maven:

<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.30</version>
    <scope>provided</scope>
</dependency>

### IDE Configuration:
- Enable annotation processing
- Install Lombok plugin (if needed)

## How to Run

** Using an IDE (Integrated Development Environment):**
- Clone or download the repository.
- Import the project into your favorite Java IDE (e.g., Eclipse, IntelliJ IDEA, VS Code with Java extensions).
- Locate the `Main.java` file.
- Right-click on `Main.java` and select "Run" or "Run As Java Application". The output will appear in the IDE's console.
