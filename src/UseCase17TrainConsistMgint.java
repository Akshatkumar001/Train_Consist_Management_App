import java.util.Arrays;

public class UseCase17TrainConsistMgint {

    public static void main(String[] args) {

        System.out.println("UC17 - Sort Bogie Names Using Arrays.sort()");
        System.out.println("--------------------------------------------");

        // Create array of bogie type names
        String[] bogieNames = {
            "Sleeper", "AC Chair", "First Class", "General", "Luxury"
        };

        // Display original array
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // ---- SORT USING BUILT-IN METHOD ----
        Arrays.sort(bogieNames);

        // Display sorted array
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 sorting completed ...");
    }
}