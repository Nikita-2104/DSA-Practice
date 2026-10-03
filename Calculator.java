import java.util.*;

public class Calculator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // First number input
        System.out.println("Enter a First number:");
        int a = sc.nextInt();

        // Second number input
        System.out.println("Enter a Second number:");
        int b = sc.nextInt();

        // Operation menu
        System.out.println("Choose an operation:");
        System.out.println("1. + (Addition)");
        System.out.println("2. - (Subtraction)");
        System.out.println("3. * (Multiplication)");
        System.out.println("4. / (Division)");
        System.out.println("5. % (Modulo)");

        System.out.println("Enter your choice (1-5):");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Result: " + (a + b));
                break;

            case 2:
                System.out.println("Result: " + (a - b));
                break;

            case 3:
                System.out.println("Result: " + (a * b));
                break;

            case 4:
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Error: Division by zero is not allowed.");
                break;

            case 5:
                if (b != 0)
                    System.out.println("Result: " + (a % b));
                else
                    System.out.println("Error: Modulo by zero is not allowed.");
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}