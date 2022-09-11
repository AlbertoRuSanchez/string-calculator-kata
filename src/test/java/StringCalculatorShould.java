import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorShould {

    private StringCalculator underTest;

    @BeforeEach
    void setUp() {
        underTest = new StringCalculator();
    }

    @Test
    void return_zero_given_empty_string() {
        //Given
        String emptyString = "";

        //When
         int result = underTest.add(emptyString);

        //Then
        assertThat(result).isEqualTo(0);
    }

    @Test
    void return_int_number_when_only_one_string_number_given() {
        //Given
        String stringNumber = "7";

        //When
        int result = underTest.add(stringNumber);

        //Then
        assertThat(result).isEqualTo(7);
    }

}
