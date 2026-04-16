// ---- CUSTOM RUNTIME EXCEPTION ----
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// ---- GOODS BOGIE MODEL ----
class GoodsBogie {
    String shape;
    String cargo;

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    // Assign cargo with safety validation
    public void assignCargo(String cargo) {
        try {
            // Rule: Rectangular bogie cannot carry petroleum
            if (shape.equalsIgnoreCase("Rectangular") && 
                cargo.equalsIgnoreCase("Petroleum")) {
                
                throw new CargoSafetyException("Unsafe cargo assignment!");
            }

            // Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully -> " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cargo validation completed for " + shape + " bogie");
        }
    }
}

// ---- MAIN CLASS ----
public class Main {
    public static void main(String[] args) {

        System.out.println("UC15 - Safe Cargo Assignment\n");

        // Safe case
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
        cylindrical.assignCargo("Petroleum");

        System.out.println();

        // Unsafe case
        GoodsBogie rectangular = new GoodsBogie("Rectangular");
        rectangular.assignCargo("Petroleum");

        System.out.println();

        System.out.println("UC15 runtime handling completed ...");
    }
}