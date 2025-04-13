public class Main {

    public static void main(String[] args) {
        // 1. Create a Person object using the Lombok-generated constructor
        Person person1 = new Person("Mariana", 39, true);

        // 2. Use Lombok-generated Getters to retrieve initial values
        System.out.println("--- Initial Values ---");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is Employed: " + person1.isEmployed());

        System.out.println("\n--- Modifying Values using Setters ---");

        // 3. Use manual/Lombok-generated Setters to modify the object's state
        person1.setName("  Marcelo  "); // Uses custom setter
        person1.setAge(41);         // Uses custom setter
        person1.setEmployed(false); // Uses manual or Lombok-generated setter

        // 4. Use Getters again to see the updated values
        System.out.println("Updated Name: " + person1.getName());
        System.out.println("Updated Age: " + person1.getAge());
        System.out.println("Updated Employment: " + person1.isEmployed());

        System.out.println("\n--- Testing Validation ---");
        // 5. Test validation logic in custom setters
        System.out.print("Trying to set invalid age (-5): ");
        person1.setAge(-5); // Custom setter should print an error

        System.out.print("Trying to set invalid name (empty): ");
        person1.setName("   "); // Custom setter should print an error

        // Check values after trying invalid updates
        System.out.println("\nValues after attempting invalid updates:");
        System.out.println("Name: " + person1.getName()); // Should still be "Marcelo"
        System.out.println("Age: " + person1.getAge());   // Should still be 41
        
    }
}