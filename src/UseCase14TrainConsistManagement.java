import java.util.*;

// Main class
public class UseCase14TrainConsistManagement {

    // ---- CUSTOM EXCEPTION ----
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // ---- BOGIE MODEL ----
    static class Bogie {
        String type;
        int capacity;

        // Constructor with validation
        Bogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }
    }

    // ---- MAIN METHOD ----
    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("=======================================");

        List<Bogie> train = new ArrayList<>();

        // ---- VALID CASE ----
        try {
            Bogie b1 = new Bogie("Sleeper", 72);
            train.add(b1);
            System.out.println("Created Bogie: " + b1.type + " -> " + b1.capacity);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // ---- INVALID CASE (ZERO / NEGATIVE) ----
        try {
            Bogie b2 = new Bogie("General", 0); // invalid
            train.add(b2);
            System.out.println("Created Bogie: " + b2.type + " -> " + b2.capacity);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // ---- ANOTHER INVALID CASE ----
        try {
            Bogie b3 = new Bogie("AC", -10); // invalid
            train.add(b3);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}