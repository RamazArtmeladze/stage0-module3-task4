package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {

        double a = 0; // Assign the value you want for 'a'
        double b = 0; // Assign the value you want for 'b'

        double result = (9 * a * a - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);

        boolean followsOrderOfOperations = result == (9 * a * a - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);

        System.out.println("Follows order of operations: " + followsOrderOfOperations);

    }
}
