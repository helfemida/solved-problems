package homework3.overload;

class TestCalculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum of 2 and 3: " + calculator.add(2, 3));
        System.out.println("Sum of 2.5 and 3.5: " + calculator.add(2.5, 3.5));

        System.out.println("Difference between 5 and 3: " + calculator.subtract(5, 3));
        System.out.println("Difference between 5.5 and 3.2: " + calculator.subtract(5.5, 3.2));

        System.out.println("Product of 2 and 3: " + calculator.multiply(2, 3));
        System.out.println("Product of 2.5 and -4: " + calculator.multiply(2.5, -4));

        try {
            System.out.println("Division of 10 by 2: " + calculator.divide(10, 2));
            System.out.println("Division of 5 by 0: " + calculator.divide(5, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
