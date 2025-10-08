import java.util.Scanner;

public class CalculatorApp {

    static class Calculator {

        public int add(int a, int b) {
            return a + b;
        }

        public double add(double a, double b) {
            return a + b;
        }

        public int add(int a, int b, int c) {
            return a + b + c;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public double multiply(double a, double b) {
            return a * b;
        }

        public double divide(int a, int b) {
            try {
                if (b == 0)
                    throw new ArithmeticException("Division by zero is not allowed!");
                return (double) a / b;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                return 0;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int choice;

        do {
            System.out.println("\n=== Calculator Application ===");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.println("\n1. Add two integers");
                    System.out.println("2. Add two doubles");
                    System.out.println("3. Add three integers");
                    System.out.print("Choose option: ");
                    int addChoice = sc.nextInt();

                    switch (addChoice) {
                        case 1 -> {
                            System.out.print("Enter first integer: ");
                            int a = sc.nextInt();
                            System.out.print("Enter second integer: ");
                            int b = sc.nextInt();
                            System.out.println("Result: " + calc.add(a, b));
                        }
                        case 2 -> {
                            System.out.print("Enter first double: ");
                            double a = sc.nextDouble();
                            System.out.print("Enter second double: ");
                            double b = sc.nextDouble();
                            System.out.println("Result: " + calc.add(a, b));
                        }
                        case 3 -> {
                            System.out.print("Enter three integers: ");
                            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
                            System.out.println("Result: " + calc.add(a, b, c));
                        }
                        default -> System.out.println("Invalid option!");
                    }
                }

                case 2 -> {
                    System.out.print("Enter first integer: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second integer: ");
                    int b = sc.nextInt();
                    System.out.println("Result: " + calc.subtract(a, b));
                }

                case 3 -> {
                    System.out.print("Enter first double: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter second double: ");
                    double b = sc.nextDouble();
                    System.out.println("Result: " + calc.multiply(a, b));
                }

                case 4 -> {
                    System.out.print("Enter numerator: ");
                    int a = sc.nextInt();
                    System.out.print("Enter denominator: ");
                    int b = sc.nextInt();
                    double result = calc.divide(a, b);
                    if (b != 0)
                        System.out.println("Result: " + result);
                }

                case 5 -> System.out.println("Exiting... Thank you!");

                default -> System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
