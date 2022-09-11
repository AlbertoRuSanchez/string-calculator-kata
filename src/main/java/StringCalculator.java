public class StringCalculator {
    public int add(String stringNumbers) {
        if (stringNumbers.isEmpty()) {
            return 0;
        }
        if (!stringNumbers.contains(",")) {
            return Integer.parseInt(stringNumbers);
        }
        String[] numbers = stringNumbers.split(",");
        return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);

    }
}
