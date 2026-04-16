import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class Main {
    public static void main(String[] args) {

        // Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Display bogies
        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // --- AGGREGATE USING STREAM ---
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)        // extract capacity
                .reduce(0, Integer::sum);   // sum all values

        // Display total
        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);

        System.out.println("\nUC10 aggregation completed...");
    }
}