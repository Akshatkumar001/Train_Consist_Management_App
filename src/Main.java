import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = sc.nextLine();

        // Define regex patterns
        String trainPattern = "TRN-\\d{4}";      // TRN-1234
        String cargoPattern = "PET-[A-Z]{2}";    // PET-AB

        // Compile patterns
        Pattern pTrain = Pattern.compile(trainPattern);
        Pattern pCargo = Pattern.compile(cargoPattern);

        // Create matcher objects
        Matcher mTrain = pTrain.matcher(trainId);
        Matcher mCargo = pCargo.matcher(cargoCode);

        // Validate using matches()
        boolean isTrainValid = mTrain.matches();
        boolean isCargoValid = mCargo.matches();

        // Display results
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainValid);
        System.out.println("Cargo Code Valid: " + isCargoValid);

        System.out.println("\nUC11 validation completed...");
    }
}