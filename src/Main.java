public class Main {

    public static void main(String[] args) {

        System.out.println("UC16 - Manual Sorting using Bubble Sort");
        System.out.println("----------------------------------------");

        // Create array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 68};

        // Display original order
        System.out.println("Original Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // ---- BUBBLE SORT LOGIC ----
        int n = capacities.length;

        // Outer loop controls number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparison
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if elements are in wrong order
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display sorted result
        System.out.println("\n\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nUC16 sorting completed ...");
    }
}