public class StringCalculator {
    public int add(String stringNumbers) {
        if(!stringNumbers.isEmpty()){
            return Integer.parseInt(stringNumbers);
        }
        return 0;
    }
}
