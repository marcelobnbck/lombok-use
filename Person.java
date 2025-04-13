import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor; // Generates constructor with all arguments
import lombok.NoArgsConstructor;  // Optional: Generates no-args constructor
import lombok.NonNull;          // For null checks

@Getter // Generates all getter methods (getName(), getAge(), isEmployed())
// @Setter // We'll handle setters manually because of custom logic
@ToString // Generates a helpful toString() method
@AllArgsConstructor // Generates constructor: public Person(String name, int age, boolean employed)
@NoArgsConstructor  // Optional: Generates public Person() constructor if needed
public class Person {

    // Add @NonNull for fields that shouldn't be null,
    @NonNull
    private String name;

    private int age;

    // @Getter is already generating isEmployed() correctly for boolean
    private boolean employed;

    // Custom Setter for 'name' with Validation
    public void setName(@NonNull String name) {
        if (name.trim().isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
        } else {
            this.name = name.trim();
        }
    }

    // Custom Setter for 'age' with Validation
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Error: Invalid age provided (" + age + "). Age must be between 0 and 120.");
        }
    }

    // Standard Setter for 'employed'
    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

}