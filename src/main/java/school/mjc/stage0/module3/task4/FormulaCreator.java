package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {

        double a = 1; // Assign the value you want for 'a'
        double b = 2; // Assign the value you want for 'b'

        double result = (9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);

        boolean followsOrderOfOperations = result == (9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);

        System.out.println("Follows order of operations: " + followsOrderOfOperations);

    }
}
