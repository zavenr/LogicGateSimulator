import java.util.Scanner;

class AND {
    
    public boolean compute(boolean input1, boolean input2) {
        return input1 && input2;
    }
}

class NOT {
    public boolean compute(boolean input) {
        return !input;
    }
}

class OR {
    public boolean compute(boolean input1, boolean input2) {
        return input1 || input2;
    }
}

public class LogicGate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a gate to simulate (AND, OR, NOT): ");
        String gateType = scanner.nextLine().toUpperCase();

        boolean result = false;

        switch (gateType) {
            case "AND":
                System.out.print("Enter first input (true(1)/false(0)): ");
                boolean andInput1 = scanner.nextBoolean();
                System.out.print("Enter second input (true(1)/false(0)): ");
                boolean andInput2 = scanner.nextBoolean();
                
                AND andGate = new AND();
                result = andGate.compute(andInput1, andInput2);
                break;

            case "OR":
                System.out.print("Enter first input (true(1)/false(0)): ");
                boolean orInput1 = scanner.nextBoolean();
                System.out.print("Enter second input (true(1)/false(0)): ");
                boolean orInput2 = scanner.nextBoolean();
                
                OR orGate = new OR();
                result = orGate.compute(orInput1, orInput2);
                break;

            case "NOT":
                System.out.print("Enter input (true(1)/false(0)): ");
                boolean notInput = scanner.nextBoolean();
                
                NOT notGate = new NOT();
                result = notGate.compute(notInput);
                break;

            default:
                System.out.println("Invalid gate type. Please choose AND, OR, or NOT.");
                scanner.close();
                return;
        }

        System.out.println("The result is: " + result);
        scanner.close();
    }
}
