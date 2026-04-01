import java.util.LinkedHashSet;
import java.util.Set;

public class UseCase5TrainConsistMgmnt {
    public static void main(String[] args) {

        System.out.println("UCS - Preserve Insertion Order of Bogies");

        Set<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");
        formation.add("Cargo");

        System.out.println("\nFinal Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUCS formation setup completed ...");
    }
}